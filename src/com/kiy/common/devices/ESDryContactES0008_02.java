package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 干接点执行器(东软载波)线路2
 */
public class ESDryContactES0008_02 extends Device {

	private static final long serialVersionUID = 1L;

	private int lineTwo;

	public int getLineTwo() {
		return lineTwo;
	}

	public void setLineTwo(int lineTwo) {
		this.lineTwo = lineTwo;
	}

	public ESDryContactES0008_02() {
		super(Vendor.EASTSOFT, Kind.DRY_CONTACT, Model.ES_0008_02);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return (lineTwo == 0 ? " 正常 " : " 报警 ");
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureLineTwo(0) };
		return features;
	}

	public class FeatureLineTwo extends Feature {

		public FeatureLineTwo(int index) {
			super("Line", true, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "线路二";
		}

		@Override
		public int getValue() {
			return lineTwo;
		}

		@Override
		public void setValue(int value) {
			lineTwo = value;

		}

		@Override
		public String getText() {
			return lineTwo == 0 ? "正常" : "报警";
		}
	}

}
