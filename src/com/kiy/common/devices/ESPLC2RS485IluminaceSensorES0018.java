package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 光照传感器
 * 型号ES_0018
 */
public class ESPLC2RS485IluminaceSensorES0018 extends Device{
	/**
	 * 读数
	 */
	private int degree;

	private static final long serialVersionUID = 1L;

	public ESPLC2RS485IluminaceSensorES0018() {
		super(Vendor.EASTSOFT, Kind.SENSOR_ILLUMINANCE,Model.ES_0018);
	}

	/**
	 * 设置设备读数
	 * @return
	 */
	public int getDegree() {
		return degree;
	}

	/**
	 * 获取设备读数
	 * @param degree
	 */
	public void setDegree(int degree) {
		this.degree = degree;
	}


	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return degree+"lux";
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureDegree(0) };
		return features;
	}
	
	/**
	 * 特性：读数
	 */
	public class FeatureDegree extends Feature {

		public FeatureDegree(int index) {
			super("DEGREE", true, true, index, 0, 0, 0, 0);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "光照";
		}

		@Override
		public int getValue() {
			return degree;
		}

		@Override
		public void setValue(int value) {
			degree = value ;
		}

		@Override
		public String getText() {
			return degree + "lux";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

}
