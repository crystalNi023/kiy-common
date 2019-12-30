package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 四路开关执行器(东软载波带电流检测)
 */
public class ESSwitchFourES0020 extends Device{

	private static final long serialVersionUID = 1L;
	
	private boolean switchOne;
	
	private boolean switchTwo;
	
	private boolean switchThree;
	
	private boolean switchFour;
	
	
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


	public boolean isSwitchFour() {
		return switchFour;
	}

	public void setSwitchFour(boolean switchFour) {
		this.switchFour = switchFour;
	}

	public ESSwitchFourES0020() {
		super(Vendor.EASTSOFT, Kind.SWITCH_FOUR, Model.ES_0020);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return (switchOne?"ON":"OFF")+(switchTwo?" ON":" OFF")+(switchThree?" ON":" OFF")+(switchFour?" ON":" OFF");
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureSwitchOne(0),new FeatureSwitchTwo(1),new FeatureSwitchThree(2),new FeatureSwitchFour(3)};
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
	
	
	public class FeatureSwitchThree extends Feature {

		public FeatureSwitchThree(int index) {
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
			return switchThree?1:0;
		}

		@Override
		public void setValue(int value) {
			switchThree = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return switchThree?"开启":"关闭";
		}
		
	}
	
	public class FeatureSwitchFour extends Feature {

		public FeatureSwitchFour(int index) {
			super("Switch", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "4";
		}

		@Override
		public int getValue() {
			return switchFour?1:0;
		}

		@Override
		public void setValue(int value) {
			switchFour = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return switchFour?"1":"0";
		}
		
	}
}
