package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 2按键开关控制模块(东软载波)
 * @author HLX Tel:18996470535 
 * @date 2018年6月26日 
 * Copyright:Copyright(c) 2018
 */
public class ESSwitchTouchTwoES0006 extends Device{

	private static final long serialVersionUID = 1L;

	public ESSwitchTouchTwoES0006() {
		super(Vendor.EASTSOFT, Kind.SWITCH_TOUCH_TWO, Model.ES_0006);
	}
	
	/**
	 * 开关1
	 */
	private boolean switchOne;

	/**
	 * 开关2
	 */
	private boolean switchTwo;
	
	
	public boolean isSwitchOne() {
		return switchOne;
	}

	public void setSwitchOne(boolean switchOne) {
		this.switchOne = switchOne;
	}

	public boolean isSwitchTwo() {
		return switchTwo;
	}

	public void setSwitchTwo(boolean switchTwo) {
		this.switchTwo = switchTwo;
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return "开关一:"+(switchOne?"开启":"关闭")+" 开关二:"+(switchTwo?"开启":"关闭");
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureSwitchOne(0),new FeatureSwitchTwo(1)};
		return features;
	}

	public class FeatureSwitchOne extends Feature {

		public FeatureSwitchOne(int index) {
			super("Switch", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开关一";
		}

		@Override
		public int getValue() {
			return switchOne?1:0;
		}

		@Override
		public void setValue(int value) {
			switchOne = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return switchOne?"开启":"关闭";
		}
		
	}
	
	public class FeatureSwitchTwo extends Feature {

		public FeatureSwitchTwo(int index) {
			super("Switch", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开关二";
		}

		@Override
		public int getValue() {
			return switchTwo?1:0;
		}

		@Override
		public void setValue(int value) {
			switchTwo = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return switchTwo?"开启":"关闭";
		}
		
	}
	
}
