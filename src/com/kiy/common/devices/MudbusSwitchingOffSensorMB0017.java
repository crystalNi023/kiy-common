package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 开关量传感器常闭
 * 型号 MB_0017
 * @author HLX Tel:18996470535 
 * @date 2018年5月30日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusSwitchingOffSensorMB0017 extends Device {

	private static final long serialVersionUID = 1L;
	// 状态：是否关门/false为关门
	private boolean flood;

	public MudbusSwitchingOffSensorMB0017() {
		super(Vendor.MUDBUS, Kind.SENSOR_SWITCHING_OFF,Model.MB_0017);

	}

	@Override
	public Status getFeatureStatus() {
		return flood ? Status.ALARM : Status.NONE;
	}

	@Override
	public String getIndicate() {
		return flood ? "OPNE" : "CLOSE";
	}

	/**
	 * 获取状态：是否关门(false 关门)
	 * 
	 * @return
	 */
	public boolean isFeed() {
		return flood;
	}

	/**
	 * 设置状态:是否关门(false 关门)
	 * 
	 * @param feed
	 */
	public void setFeed(boolean feed) {
		this.flood = feed;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFlood(0) };
		return features;
	}

	public class FeatureFlood extends Feature {

		public FeatureFlood(int index) {
			super("Flood", true, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			return flood ? Status.ALARM : Status.NONE;
		}

		@Override
		public String getName() {
			return "门磁";
		}

		/**
		 * 1为打开/0为关闭
		 */
		@Override
		public int getValue() {
			return flood ? 1 : 0;
		}

		/**
		 * 1为打开/0为关闭
		 */
		@Override
		public void setValue(int value) {
			flood = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return flood ? "OPEN" : "CLOSE";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return flood;
	}
}
