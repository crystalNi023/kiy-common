package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 开关控制模块 东软载波
 * @author HLX Tel:18996470535 
 * @date 2018年6月26日 
 * Copyright:Copyright(c) 2018
 */
public class ESSwitchES0004 extends Device{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 开关状态
	 */
	private boolean feed;
	
	public boolean isFeed() {
		return feed;
	}

	public void setFeed(boolean feed) {
		this.feed = feed;
	}

	public ESSwitchES0004() {
		super(Vendor.EASTSOFT, Kind.SWITCH, Model.ES_0004);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return feed?"开启":"关闭";
	}

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFeed(0)};
		return features;
	}

	public class FeatureFeed extends Feature {

		public FeatureFeed(int index) {
			super("Feed", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开关";
		}

		@Override
		public int getValue() {
			return feed?1:0;
		}

		@Override
		public void setValue(int value) {
			feed = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return feed?"开启":"关闭";
		}
		
	}
}
