package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * MUDBUS-精讯畅通 CO传感器
 * 型号 MB_0010
 * @author HLX Tel:18996470535 
 * @date 2018年4月12日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusCOSensor extends Device{
	/**
	 * 读数
	 */
	private float degree;

	private static final long serialVersionUID = 1L;

	public MudbusCOSensor() {
		super(Vendor.MUDBUS, Kind.SENSOR_CO,Model.MB_0010);
	}

	/**
	 * 设置设备读数
	 * @return
	 */
	public float getDegree() {
		return degree;
	}

	/**
	 * 获取设备读数
	 * @param degree
	 */
	public void setDegree(float degree) {
		this.degree = degree;
	}


	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return degree+"ppm";
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
			super("DEGREE", true, false, index, 0, 0, 0, 10);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "一氧化碳";
		}

		@Override
		public int getValue() {
			return (int) (degree*10);
		}

		@Override
		public void setValue(int value) {
			degree = (float) (value/10.0) ;
		}

		@Override
		public String getText() {
			return degree + "ppm";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

}
