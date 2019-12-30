/**
 * 2017年6月9日
 */
package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 三相电表，陕西凯星电子
 * 型号 KS_0004
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class KSElectricityMeter3 extends Device {

	private static final long serialVersionUID = 1L;
	
	//正向有功总电量
	private float degree;

	public KSElectricityMeter3() {
		super(Vendor.KAISTAR, Kind.METER_ELECTRICITY_THREE,Model.KS_0004);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}
	
	@Override
	public String getIndicate() {
		return degree + "kw/h";
	}

	/**
	 * 获取读数：电度数kw/h
	 */
	public float getDegree() {
		return degree;
	}

	/**
	 * 设置读数：电度数kw/h
	 */
	public void setDegree(float value) {
		degree = value;
	}
	
	@Override
	public Feature[] getFeatures() {
		return features = new Feature[]{new FeatureDegree(0)};
	}
	

	/**
	 * 特性：读数
	 */
	public class FeatureDegree extends Feature {

		public FeatureDegree(int index) {
			super("DEGREE", true, true, index, 0, 0, 0, 100);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "电量";
		}

		@Override
		public int getValue() {
			return (int) (degree * 100);
		}

		@Override
		public void setValue(int value) {
			degree = (float) (value / 100.00);
		}

		@Override
		public String getText() {
			return degree + "kw/h";
		}
	}


	@Override
	public boolean getSwitchStatus() {
		return false;
	}

}