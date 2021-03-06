/**
 * 2017年6月9日
 */
package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 阀门控制，陕西凯星电子
 * 型号 KS_0018
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class KSValve extends Device {

	private static final long serialVersionUID = 1L;

	// 状态：阀门开度0~1
	private int feed;
	// 状态：ROM
	private boolean rom;
	// 状态：信号
	private boolean signal;
	// 状态：时钟
	private boolean clock;

	public KSValve() {
		super(Vendor.KAISTAR, Kind.VALVE,Model.KS_0018);
	}

	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFeed(0), new FeatureROM(1), new FeatureSignal(2), new FeatureClock(3) };
		return features;
	}

	@Override
	public Status getFeatureStatus() {
		if (!rom || !signal || !clock)
			return Status.FAULT;

		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return feed + "%";
	}

	/**
	 * 获取状态：开度
	 */
	public int getFeed() {
		return feed;
	}

	/**
	 * 设置状态：开度
	 */
	public void setFeed(int value) {
		feed = value;
	}

	/**
	 * 获取状态：ROM
	 */
	public boolean isRom() {
		return rom;
	}

	/**
	 * 设置状态：ROM
	 */
	public void setRom(boolean value) {
		rom = value;
	}

	/**
	 * 获取状态：信号
	 */
	public boolean isSignal() {
		return signal;
	}

	/**
	 * 设置状态：信号
	 */
	public void setSignal(boolean value) {
		signal = value;
	}

	/**
	 * 获取状态：时钟
	 */
	public boolean isClock() {
		return clock;
	}

	/**
	 * 设置状态：时钟
	 */
	public void setClock(boolean value) {
		clock = value;
	}

	/**
	 * 特性：供应
	 */
	public class FeatureFeed extends Feature {

		public FeatureFeed(int index) {
			super("VALVE", true, false, index, 0, 100, 25, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开度";
		}

		@Override
		public int getValue() {
			return feed;
		}

		@Override
		public void setValue(int value) {
			feed = value;
		}

		@Override
		public String getText() {
			return feed + "%";
		}
	}

	/**
	 * 特性：ROM
	 */
	public class FeatureROM extends Feature {

		public FeatureROM(int index) {
			super("ROM", false, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			if (!rom)
				return Status.FAULT;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "存储";
		}

		@Override
		public int getValue() {
			return rom ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			rom = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return rom ? "OK" : "FAUL";
		}
	}

	/**
	 * 特性：信号
	 */
	public class FeatureSignal extends Feature {

		public FeatureSignal(int index) {
			super("SIGNAL", false, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			if (!signal)
				return Status.FAULT;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "信号";
		}

		@Override
		public int getValue() {
			return signal ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			signal = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return signal ? "OK" : "FAUL";
		}
	}

	/**
	 * 特性：时钟
	 */
	public class FeatureClock extends Feature {

		public FeatureClock(int index) {
			super("CLOCK", false, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			if (!clock)
				return Status.FAULT;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "时钟";
		}

		@Override
		public int getValue() {
			return clock ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			clock = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return clock ? "OK" : "FAUL";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		if (feed>1) {
			return true;
		}
		return false;
	}
}