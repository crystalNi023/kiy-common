package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * EASTSOFT 温湿度传感器 P-SN-TH-SC-63
 * 型号 ES_0009
 * @author HLX Tel:18996470535 
 * @date 2018年4月26日 
 * Copyright:Copyright(c) 2018
 */
public class ESHumitureSensorES0009 extends Device{

	private static final long serialVersionUID = 1L;
	
	// 读数：温度
	private float temperature;
	// 读数：湿度
	private float moisture;

	public ESHumitureSensorES0009() {
		super(Vendor.EASTSOFT, Kind.SENSOR_MOISTURE_TEMPERATURE,Model.ES_0009);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return temperature + "℃"+" "+moisture+"%rh";
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureMoisture(0), new FeatureTemperature(1) };
		return features;
	}
	
	/**
	 * 获取读数：温度
	 * @return
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * 设置读数：温度
	 * @return
	 */
	public void setTemperature(float value) {
		temperature = value;
	}

	/**
	 * 获取读数：湿度
	 * @return
	 */
	public float getMoisture() {
		return moisture;
	}

	/**
	 * 设置读数：温度
	 * @return
	 */
	public void setMoisture(float value) {
		moisture = value;
	}

	/**
	 * 特性：温度
	 */
	public class FeatureTemperature extends Feature {

		public FeatureTemperature(int index) {
			super("TEMPERATURE", true, true, index, 0, 1, 1,10);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
			
		}

		@Override
		public String getName() {
			return "温度";
		}

		@Override
		public int getValue() {
			return (int) (temperature * 10);
		}

		@Override
		public void setValue(int value) {
			temperature = (float) (value / 10.00);
		}

		@Override
		public String getText() {
			return temperature + "℃";
		}
	}

	/**
	 * 特性：湿度
	 */
	public class FeatureMoisture extends Feature {

		public FeatureMoisture(int index) {
			super("MOISTURE", true, true, index, 0, 1, 1,10);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "湿度";
		}

		@Override
		public int getValue() {
			return (int) (moisture * 10);
		}

		@Override
		public void setValue(int value) {
			moisture = (float) (value / 10.00);
		}

		@Override
		public String getText() {
			return moisture + "%rh";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

}
