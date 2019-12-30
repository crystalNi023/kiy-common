package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 射频编解码模块 315 433Mhz无线遥控开关重置报警 串口通讯（RF34T）(东软PLC-485)
 * 
 * 型号 ES_0027
 */
public class ESPLC2RS485FYSerialRadioFrequencyES0027 extends Device {

	private static final long serialVersionUID = 1L;

	/**
	 * 判断是否为学习 true-学习 false-重置报警 
	 */
	private boolean learn;
	
	private boolean feed;// 报警状态

	public ESPLC2RS485FYSerialRadioFrequencyES0027() {
		super(Vendor.EASTSOFT, Kind.SERIAL_RADIO_FREQUENCY,Model.ES_0027);
	}

	/**
	 * 报警状态feed/true报警，false正常
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
			features = new Feature[] { new FeatureLearn(0),new FeatureFeed(1) };
		return features;
	}

	/**
	 * 获取状态: true报警/false正常
	 * 
	 * @return
	 */
	public boolean isFeed() {
		return feed;
	}

	/**
	 * 设置状态: true报警/false正常
	 * 
	 * @param feed
	 */
	public void setFeed(boolean feed) {
		this.feed = feed;
	}
	
	/**
	 * 状态：  true学习/false重置报警 
	 * @return
	 */
	public boolean isLearn() {
		return learn;
	}

	/**
	 * 状态设置：true学习/false重置报警 
	 * @param learn
	 */
	public void setLearn(boolean learn) {
		this.learn = learn;
	}



	/**
	 * 特性：feature 0为学习 1为重置报警 
	 */
	public class FeatureLearn extends Feature {

		public FeatureLearn(int index) {
			super("SWITCH_LEARN", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "操作";
		}

		@Override
		public int getValue() {
			return learn? 0:1;/* 0为学习 1为重置报警 */
		}

		@Override
		public void setValue(int value) {/*0为学习 1为重置报警*/
			learn = value == 0 ? true : false;/* 0为学习 1为重置报警 */
			switch (value) {
				case 1:
					feed=false;
					break;
				default:
					break;
			}
		}

		@Override
		public String getText() {
			return learn ? "学习" : "重置报警";
		}
	}
	
	//状态正常报警
	public class FeatureFeed extends Feature {
		public FeatureFeed(int index) {
			super("SERIAL_RADIO_FREQUENCY", true, true, index, 0, 1, 1,1);
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
		 * 1报警/0正常
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
