package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 四路开关执行器开关3
 * 
 * @author Administrator
 *
 */
public class ESSwitchFourES0003_03 extends Device {

	private static final long serialVersionUID = 1L;
	
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ESSwitchFourES0003_03() {
		super(Vendor.EASTSOFT, Kind.SWITCH_FOUR, Model.ES_0003_03);
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureSwtitch() };
		return features;
	}

	public class FeatureSwtitch extends Feature {

		public FeatureSwtitch() {
			super("Switch", true, false, 0, 0, 1, 1, 1);
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
