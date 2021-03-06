/**
 * 2017年7月7日
 */
package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * Mudbus断电传感器(用于配电室托管)
 * 型号 MB_0009
 * @author HLX Tel:18996470535 
 * @date 2018年5月30日 
 * Copyright:Copyright(c) 2018
 */
public final class MudbusPowerSensorMB0009 extends Device {

	private static final long serialVersionUID = 1L;

	// 状态：是否断电(true 断开)
	private boolean feed;

	/**
	 * 易优断电传感器
	 */
	public MudbusPowerSensorMB0009() {
		super(Vendor.MUDBUS, Kind.SENSOR_POWER,Model.MB_0009);
	}

	@Override
	public Status getFeatureStatus() {
		return feed ? Status.ALARM : Status.NONE;
	}

	@Override
	public String getIndicate() {
		return feed ? "断电" : "正常";
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFeed(0) };
		return features;
	}

	/**
	 * 获取状态：是否断电(true断电)
	 */
	public boolean getFeed() {
		return feed;
	}

	/**
	 * 设置状态：是否断电
	 */
	public void setFeed(boolean value) {
		feed = value;
	}

	/**
	 * 特性：供电
	 */
	public class FeatureFeed extends Feature {

		public FeatureFeed(int index) {
			super("SWITCH", true, true, index, 0, 1, 1 ,1);
		}

		@Override
		public Status getAlarm() {
			return feed ? Status.ALARM : Status.NONE;
		}

		@Override
		public String getName() {
			return "供电";
		}

		@Override
		public int getValue() {
			return feed ? 0 : 1;
		}

		@Override
		public void setValue(int value) {
			feed = value > 0 ? false : true ;
		}

		@Override
		public String getText() {
			return feed ? "断电" : "正常";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}
}