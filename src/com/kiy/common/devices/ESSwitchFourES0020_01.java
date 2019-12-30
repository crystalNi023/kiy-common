package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 四路开关执行器开关1(东软载波带电流检测)
 */
public class ESSwitchFourES0020_01 extends Device{
private static final long serialVersionUID = 1L;
	
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ESSwitchFourES0020_01() {
		super(Vendor.EASTSOFT, Kind.SWITCH_FOUR, Model.ES_0020_01);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return (status ? "ON" : "OFF");
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureSwtitch(0) };
		return features;
	}

	public class FeatureSwtitch extends Feature {

		public FeatureSwtitch(int index) {
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
			return status ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			status = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return status ? "开启" : "关闭";
		}

	}

}
