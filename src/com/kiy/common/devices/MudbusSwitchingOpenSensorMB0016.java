package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 开关量传感器常开
 * 型号 MB_0016
 * @author HLX Tel:18996470535 
 * @date 2018年5月30日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusSwitchingOpenSensorMB0016 extends Device {

	private static final long serialVersionUID = 1L;
	// 状态：是否水浸/false为正常
	private boolean flood;

	public MudbusSwitchingOpenSensorMB0016() {
		super(Vendor.MUDBUS, Kind.SENSOR_SWITCHING_OPEN,Model.MB_0016);

	}

	@Override
	public Status getFeatureStatus() {
		return flood ? Status.ALARM : Status.NONE;
	}

	@Override
	public String getIndicate() {
		return flood ? "报警" : "正常";
	}

	/**
	 * 获取状态：是否水浸(false 正常)
	 * 
	 * @return
	 */
	public boolean isFeed() {
		return flood;
	}

	/**
	 * 设置状态:是否水浸(false 正常)
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
			return "水浸";
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
			return flood ? "WARING" : "NONE";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return flood;
	}
}
