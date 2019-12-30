package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

public class ESSwitchTwoES0005_03 extends Device{


	private static final long serialVersionUID = 1L;

	public ESSwitchTwoES0005_03() {
		super(Vendor.EASTSOFT, Kind.SWITCH_TWO, Model.ES_0005_03);
	}

	/**
	 * 开关2
	 */
	private boolean switchTwo;

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
		return "开关三:" + (switchTwo ? "开启" : "关闭");
	}

	@Override
	public boolean getSwitchStatus() {
		return switchTwo;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureSwitchOne(0) };
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
			return "开关三";
		}

		@Override
		public int getValue() {
			return switchTwo ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			switchTwo = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return switchTwo ? "开启" : "关闭";
		}

	}
}
