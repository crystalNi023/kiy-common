package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Use;
import com.kiy.common.Types.Vendor;

/**
 * Mudbus开关量传感器-常闭(ZZ-IO204开关量集成)
 * 型号 MB_0019
 * @author HLX Tel:18996470535 
 * @date 2018年6月1日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusSwitchingOffSensorMB0019 extends Device{
	
	private static final long serialVersionUID = 1L;
	
	private boolean feed;// 报警状态

	public MudbusSwitchingOffSensorMB0019( ) {
		super(Vendor.MUDBUS, Kind.SENSOR_SWITCHING_OFF, Model.MB_0019);
	}

	/**
	 * 报警状态feed/true正常，false报警
	 */
	@Override
	public Status getFeatureStatus() {
		return feed ? Status.BEEP:Status.NONE;
	}

	/**
	 * 报警状态feed/true正常，false报警
	 */
	@Override
	public String getIndicate() {
		/**
		 * 常闭设备有 : 门磁传感器，玻璃破碎传感器
		 */
		Use use2 = this.getUse();
		
		if (use2==null) {
			return feed ? "报警" : "正常";
		}else {
			switch (this.getUse()) {
				case SENSOR_DOOR:
					return feed ? "开启" : "关闭";
				default:
					return feed ? "报警" : "正常";
			}

		}
	}

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFeed(0) };
		return features;
	}

	/**
	 * 获取状态
	 * 
	 * @return true报警/false正常
	 */
	public boolean isFeed() {
		return feed;
	}

	/**
	 * 设置状态 
	 * 
	 * @param feed true报警/false正常
	 */
	public void setFeed(boolean feed) {
		this.feed = !feed;
	}
	
	public class FeatureFeed extends Feature {
		public FeatureFeed(int index) {
			super("STATUS", true, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			return feed ? Status.BEEP : Status.NONE;
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
			if (getUse()!=null) {
				switch (getUse()) {
					case SENSOR_DOOR:
						return feed ? "开启" : "关闭";
					default:
						return feed ? "报警" : "正常";
				}
			}else {
				return feed ? "报警" : "正常";
			}
		}
	}

}
