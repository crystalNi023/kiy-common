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
 * 单相电表，陕西凯星电子
 * 型号KS-0003
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class KSElectricityMeter1 extends Device {

	private static final long serialVersionUID = 1L;

	// 读数：电度数kw/
	private float degree;
	// 状态：供电开关
	private boolean feed;
	// 状态：蜂鸣
	private boolean beep;
	// 状态：ROM
	private boolean rom;
	// 状态：信号
	private boolean signal;
	// 状态：时钟
	private boolean clock;

	public KSElectricityMeter1() {
		super(Vendor.KAISTAR, Kind.METER_ELECTRICITY_ONE,Model.KS_0003);

	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureDegree(0), new FeatureFeed(1), new FeatureBeep(2), new FeatureROM(3), new FeatureSignal(4), new FeatureClock(5) };
		return features;
	}

	@Override
	public Status getFeatureStatus() {
		if (!rom || !signal || !clock)
			return Status.FAULT;
		if (beep)
			return Status.BEEP;
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return degree + "kw/h";
	}

	/**
	 * 获取读数：电度数kw/h
	 */
	public float getDegree() {
		return degree;
	}

	/**
	 * 设置读数：电度数kw/h
	 */
	public void setDegree(float value) {
		degree = value;
	}

	/**
	 * 获取状态：供电开关
	 */
	public boolean isFeed() {
		return feed;
	}

	/**
	 * 设置状态：供电开关
	 */
	public void setFeed(boolean value) {
		feed = value;
	}

	/**
	 * 获取状态：蜂鸣
	 */
	public boolean isBuzzer() {
		return beep;
	}

	/**
	 * 设置状态：蜂鸣
	 */
	public void setBuzzer(boolean value) {
		beep = value;
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
	 * 特性：读数
	 */
	public class FeatureDegree extends Feature {

		public FeatureDegree(int index) {
			super("DEGREE", true, true, index, 0, 0, 0, 100);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "电量";
		}

		@Override
		public int getValue() {
			return (int) (degree * 100);
		}

		@Override
		public void setValue(int value) {
			degree = (float) (value / 100.00);
		}

		@Override
		public String getText() {
			return degree + "kw/h";
		}
	}

	/**
	 * 特性：蜂鸣
	 */
	public class FeatureBeep extends Feature {

		public FeatureBeep(int index) {
			super("BEEP", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return beep ? Status.BEEP : Status.NONE;
		}

		@Override
		public String getName() {
			return "蜂鸣";
		}

		@Override
		public int getValue() {
			return beep ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			beep = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return beep ? "蜂鸣" : "关闭";
		}
	}

	/**
	 * 特性：供应
	 */
	public class FeatureFeed extends Feature {

		public FeatureFeed(int index) {
			super("SWITCH", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "供电";
		}

		@Override
		public int getValue() {
			return feed ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			feed = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return feed ? "开启" : "关闭";
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
			if (rom)
				return Status.NONE;
			return Status.FAULT;
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
			if (signal)
				return Status.NONE;
			return Status.FAULT;
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
			if (clock)
				return Status.NONE;
			return Status.FAULT;
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
		return feed;
	}
}