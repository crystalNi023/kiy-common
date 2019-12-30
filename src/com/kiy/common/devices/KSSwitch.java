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
 * 开关控制器，陕西凯星电子
 * 型号 KS_0019
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class KSSwitch extends Device {

	private static final long serialVersionUID = 1L;

	// 读数：电流A
	private float a;
	// 读数：电压V
	private float v;
	// 状态：供电开关
	private boolean feed;
	// 状态：ROM
	private boolean rom;
	// 状态：信号
	private boolean signal;
	// 状态：时钟
	private boolean clock;

	public KSSwitch() {
		super(Vendor.KAISTAR, Kind.SWITCH,Model.KS_0019);
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureV(0), new FeatureA(1), new FeatureFeed(2), new FeatureROM(3), new FeatureSignal(4), new FeatureClock(5) };
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
		return feed ? "开启" : "关闭";
	}

	/**
	 * 获取读数：电流A
	 */
	public float getA() {
		return a;
	}

	/**
	 * 设置读数：电流A
	 */
	public void setA(float value) {
		a = value;
	}

	/**
	 * 获取读数：电压V
	 */
	public float getV() {
		return v;
	}

	/**
	 * 设置读数：电压V
	 */
	public void setV(float value) {
		v = value;
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
	 * 特性：电压
	 */
	public class FeatureV extends Feature {

		public FeatureV(int index) {
			super("VOLTAGE", true, true, index, 0, 65536, 0, 100);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "电压";
		}

		@Override
		public int getValue() {
			return (int) (v * 100);
		}

		@Override
		public void setValue(int value) {
			v = (float) (value / 100.00);
		}

		@Override
		public String getText() {
			return v + "V";
		}
	}

	/**
	 * 特性：电流
	 */
	public class FeatureA extends Feature {

		public FeatureA(int index) {
			super("CURRENT", true, true, index, 0, 65536, 0, 100);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "电流";
		}

		@Override
		public int getValue() {
			return (int) (a * 100);
		}

		@Override
		public void setValue(int value) {
			a = (float) (value / 100.00);
		}

		@Override
		public String getText() {
			return a + "A";
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
			return feed ? "ON" : "OFF";
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
		return feed;
	}
}