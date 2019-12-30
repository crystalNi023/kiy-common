/**
 * 2017年6月9日
 */
package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Use;
import com.kiy.common.Types.Vendor;

/**
 * MUDBUS 开关量传感器(长闭) 例如-门磁传感器
 * 型号MB0013
 * @author HLX Tel:18996470535
 * @date 2018年4月26日 Copyright:Copyright(c) 2018
 */
public final class MudbusSwitchingOffSensorMB0013 extends Device {

	private static final long serialVersionUID = 1L;
	// 读数：开关量
	private boolean indecate;

	public MudbusSwitchingOffSensorMB0013() {
		super(Vendor.MUDBUS, Kind.SENSOR_SWITCHING_OFF,Model.MB_0013);
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureSwitch(0) };
		return features;
	}

	@Override
	public Status getFeatureStatus() {
		if (indecate)
			return Status.BEEP;
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		/**
		 * 常闭设备有 : 门磁传感器，玻璃破碎传感器
		 */
		Use use2 = this.getUse();
		
		if (use2==null) {
			return indecate ? "报警" : "正常";
		}else {
			switch (this.getUse()) {
				case SENSOR_DOOR:
					return indecate ? "开启" : "关闭";
				default:
					return indecate ? "报警" : "正常";
			}

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
	 * 特性：开关量 true 为断开，如门磁
	 */
	public class FeatureSwitch extends Feature {

		public FeatureSwitch(int index) {
			super("SWITCH", true, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			if (indecate)
				return Status.BEEP;
			return Status.NONE;
		}

		@Override
		public String getName() {
			Use use2 = getUse();
			if (use2 != null) {
				switch (getUse()) {
					case SENSOR_DOOR:
						return "门磁";
					default:
						return "状态";
				}
			}
			return "状态";

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
			if (getUse()!=null) {
				switch (getUse()) {
					case SENSOR_DOOR:
						return indecate ? "开启" : "关闭";
					default:
						return indecate ? "报警" : "正常";
				}
			}else {
				return indecate ? "报警" : "正常";
			}
			
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return indecate;
	}

}