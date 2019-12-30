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
 * 温度采集器，陕西凯星电子
 * 型号 KS_0009
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class KSTemperatureSensor extends Device {

	private static final long serialVersionUID = 1L;
	// 读数：温度
	private float temperature;
	// 状态：ROM
	private boolean rom;
	// 状态：信号
	private boolean signal;
	// 状态：时钟
	private boolean clock;

	public KSTemperatureSensor() {
		super(Vendor.KAISTAR, Kind.SENSOR_TEMPERATURE,Model.KS_0009);
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureTemperature(0), new FeatureROM(1), new FeatureSignal(2), new FeatureClock(3) };
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
		return temperature + "℃";
	}

	/**
	 * 获取读数：温度
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * 设置读数：温度
	 */
	public void setTemperature(float value) {
		temperature = value;
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
	 * 特性：温度
	 */
	public class FeatureTemperature extends Feature {

		public FeatureTemperature(int index) {
			super("TEMPERATURE", true, true, index, -100, 100, 1, 100);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "温度";
		}

		@Override
		public int getValue() {
			return (int) (temperature * 100);
		}

		@Override
		public void setValue(int value) {
			temperature = (float) (value / 100.00);
		}

		@Override
		public String getText() {
			return temperature + "℃";
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
		return false;
	}
}