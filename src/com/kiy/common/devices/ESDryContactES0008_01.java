package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 干接点执行器(东软载波)线路1
 */
public class ESDryContactES0008_01 extends Device {

	private static final long serialVersionUID = 1L;

	private int lineOne;

	public int getLineOne() {
		return lineOne;
	}

	public void setLineOne(int lineOne) {
		this.lineOne = lineOne;
	}

	public ESDryContactES0008_01() {
		super(Vendor.EASTSOFT, Kind.DRY_CONTACT, Model.ES_0008_01);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return (lineOne == 0 ? " 正常 " : " 报警 ");
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureLineOne(0) };
		return features;
	}

	public class FeatureLineOne extends Feature {

		public FeatureLineOne(int index) {
			super("Line", true, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "线路一";
		}

		@Override
		public int getValue() {
			return lineOne;
		}

		@Override
		public void setValue(int value) {
			lineOne = value;

		}

		@Override
		public String getText() {
			return lineOne == 0 ? "正常" : "报警";// 3是正常 4是报警
		}
	}
}
