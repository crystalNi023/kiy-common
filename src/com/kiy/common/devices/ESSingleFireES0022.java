package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 单火线触摸开关执行器开关
 * 
 * @author Administrator
 *
 */
public class ESSingleFireES0022 extends Device {

	private static final long serialVersionUID = 1L;
	
	private boolean switchOne;
	
	private boolean switchTwo;
	
	private boolean switchThree;

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

	public boolean isSwitchThree() {
		return switchThree;
	}

	public void setSwitchThree(boolean switchThree) {
		this.switchThree = switchThree;
	}

	public ESSingleFireES0022() {
		super(Vendor.EASTSOFT, Kind.SINGLE_FIRE_LINE, Model.ES_0022);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return (switchOne ? "ON" : "OFF")+(switchTwo ? "ON" : "OFF")+(switchThree ? "ON" : "OFF");
	}

	@Override
	public boolean getSwitchStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureSwtitchOne(0), new FeatureSwtitchTwo(1), new FeatureSwtitchThree(2) };
		return features;
	}

	public class FeatureSwtitchOne extends Feature {

		public FeatureSwtitchOne(int index) {
			super("Switch", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开关1";
		}

		@Override
		public int getValue() {
			return switchOne ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			switchOne = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return switchOne ? "1" : "0";
		}

	}
	public class FeatureSwtitchTwo extends Feature {

		public FeatureSwtitchTwo(int index) {
			super("Switch", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开关2";
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
			return switchTwo ? "1" : "0";
		}

	}
	public class FeatureSwtitchThree extends Feature {

		public FeatureSwtitchThree(int index) {
			super("Switch", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开关3";
		}

		@Override
		public int getValue() {
			return switchThree ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			switchThree = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return switchThree ? "1" : "0";
		}

	}
}
