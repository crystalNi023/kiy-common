package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 干接点执行器(东软载波)线路3
 */
public class ESDryContactES0008_03 extends Device {

	private static final long serialVersionUID = 1L;

	private int lineThree;

	public int getLineThree() {
		return lineThree;
	}

	public void setLineThree(int lineThree) {
		this.lineThree = lineThree;
	}

	public ESDryContactES0008_03() {
		super(Vendor.EASTSOFT, Kind.DRY_CONTACT, Model.ES_0008_03);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return (lineThree == 0 ? " 正常 " : " 报警 ");
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureLineThree(0) };
		return features;
	}

	public class FeatureLineThree extends Feature {

		public FeatureLineThree(int index) {
			super("Line", true, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "线路三";
		}

		@Override
		public int getValue() {
			return lineThree;
		}

		@Override
		public void setValue(int value) {
			lineThree = value;

		}

		@Override
		public String getText() {
			return lineThree == 0 ? "正常" : "报警";
		}
	}

}
