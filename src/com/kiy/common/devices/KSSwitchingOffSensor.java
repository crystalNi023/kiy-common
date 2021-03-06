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
 * 开关量传感器，陕西凯星电子 (长闭)
 * 型号 KS_0015
 * @author HLX Tel:18996470535 
 * @date 2018年4月8日 
 * Copyright:Copyright(c) 2018
 */
public final class KSSwitchingOffSensor extends Device {

	private static final long serialVersionUID = 1L;
	// 读数：开关量
	private boolean indecate;
	// 状态：ROM
	private boolean rom;
	// 状态：信号
	private boolean signal;
	// 状态：时钟
	private boolean clock;

	public KSSwitchingOffSensor() {
		super(Vendor.KAISTAR, Kind.SENSOR_SWITCHING_OFF,Model.KS_0015);
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFlood(0), new FeatureROM(1), new FeatureSignal(2), new FeatureClock(3) };
		return features;
	}

	@Override
	public Status getFeatureStatus() {
		if (!rom || !signal || !clock)
			return Status.FAULT;
		if (indecate)
			return Status.BEEP;
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		/**
		 *	常闭设备有 : 门磁传感器，玻璃破碎传感器 
		 */
		switch (this.getUse()) {
		case SENSOR_DOOR:
			return indecate ? "开启" : "关闭";
		case SENSOR_GLASSES_BROKEN:
			return indecate ? "破碎" : "正常";	
		default:
			return indecate ? "报警" : "正常";
		}
		
	}

	/**
	 * 获取读数：开关量 闭合为true
	 */
	public boolean isDegree() {
		return indecate;
	}

	/**
	 * 设置读数：开关量 闭合为true
	 */
	public void setDegree(boolean value) {
		indecate = !value;
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
	 * 特性：开关量 true 为断开，如门磁
	 */
	public class FeatureFlood extends Feature {

		public FeatureFlood(int index) {
			super("FLOOD", true, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			if (indecate)
				return Status.BEEP;
			return Status.NONE;
		}

		@Override
		public String getName() {
			switch (getUse()) {
			case SENSOR_DOOR:
				return "门磁";
			case SENSOR_GLASSES_BROKEN:
				return "玻璃破碎";
			default :
				return "状态";
			}	
		}

		@Override
		public int getValue() {
			return indecate ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			indecate = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			switch (getUse()) {
			case SENSOR_WATER:
			case SENSOR_RAIN:	
				return indecate ? "有水" : "无水";
			case SENSOR_DOOR:
				return indecate ? "开启" : "关闭";
			case SENSOR_INFRARED:
			case SENSOR_HUMAN_INFRARED:	
				return indecate ? "有人" : "无人";
			case SENSOR_GLASSES_BROKEN:
				return indecate ? "破碎" : "正常";	
			default:
				return indecate ? "报警" : "正常";
			}
		}
	}

	/**
	 * 特性：ROM
	 */
	public class FeatureROM extends Feature {

		public FeatureROM(int index) {
			super("ROM", false, true, index, 0, 1, 1,1);
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
			super("SIGNAL", false, true, index, 0, 1, 1,1);
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
			super("CLOCK", false, true, index, 0, 1, 1,1);
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
		return indecate;
	}
}