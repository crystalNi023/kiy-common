package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 通断控制器
 * 型号 MB_0014
 * @author HLX Tel:18996470535 
 * @date 2018年5月30日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusSwitchMB0014 extends Device{
	
	private static final long serialVersionUID = 1L;
	// 供电开关
	private boolean feed;

	public MudbusSwitchMB0014() {
		super(Vendor.MUDBUS, Kind.SWITCH,Model.MB_0014);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return feed ? "开启" : "关闭";
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFeed(0)};
		return features;
	}
	
	/**
	 * 获取状态：供电开关 true为开 false为关
	 */
	public boolean isFeed() {
		return feed;
	}
	
	/**
	 * 设置状态：供电开关 true为开 false为关
	 */
	public void setFeed(boolean feed) {
		this.feed = feed;
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

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}
}
