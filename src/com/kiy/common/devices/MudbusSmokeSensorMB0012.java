package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 烟雾传感器 MUDBUS协议
 * 型号 MB_0012
 * @author HLX Tel:18996470535 
 * @date 2018年4月26日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusSmokeSensorMB0012 extends Device {

	private static final long serialVersionUID = 1L;
	
	private boolean feed;// 报警状态

	public MudbusSmokeSensorMB0012() {
		super(Vendor.MUDBUS, Kind.SENSOR_SMOKE,Model.MB_0012);
	}

	/**
	 * 报警状态feed/true正常，false报警
	 */
	@Override
	public Status getFeatureStatus() {
		return feed ? Status.ALARM:Status.NONE;
	}

	/**
	 * 报警状态feed/true正常，false报警
	 */
	@Override
	public String getIndicate() {
		return feed ? "报警":"正常";
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFeed(0) };
		return features;
	}

	/**
	 * 获取状态: true正常/false报警
	 * 
	 * @return
	 */
	public boolean isFeed() {
		return feed;
	}

	/**
	 * 设置状态: true正常/false报警
	 * 
	 * @param feed
	 */
	public void setFeed(boolean feed) {
		this.feed = feed;
	}

	public class FeatureFeed extends Feature {
		public FeatureFeed(int index) {
			super("SMOKE", true, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			return feed ? Status.ALARM : Status.NONE;
		}

		@Override
		public String getName() {
			return "状态";
		}

		/**
		 * 0正常/1报警
		 */
		@Override
		public int getValue() {
			return feed ? 1 : 0;
		}

		/**
		 * 0正常/1报警
		 */
		@Override
		public void setValue(int value) {
			feed = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return feed ? "报警" : "正常";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}

}
