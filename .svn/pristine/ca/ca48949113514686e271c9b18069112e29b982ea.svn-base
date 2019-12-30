package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * MUDBUS-精讯畅通 PM2.5/10变送器
 * 型号 MB_0008
 * @author HLX Tel:18996470535 
 * @date 2018年4月12日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusPMSensor extends Device{

	private static final long serialVersionUID = 1L;
	
	// 读数：PM2.5
	private int pm25;
	// 读数：PM10
	private int pm10;

	public MudbusPMSensor() {
		super(Vendor.MUDBUS, Kind.SENSOR_PM,Model.MB_0008);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return "PM2.5 : "+pm25 + "μg/m³"+" PM10 : "+pm10+"μg/m³";
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeaturePM25(0), new FeaturePM10(1) };
		return features;
	}
	
	/**
	 * 获取读数：PM2.5
	 * @return
	 */
	public int getPM25() {
		return pm25;
	}

	/**
	 * 设置读数：PM2.5
	 * @return
	 */
	public void setPM25(int value) {
		pm25 = value;
	}

	/**
	 * 获取读数：PM10
	 * @return
	 */
	public int getPM10() {
		return pm10;
	}

	/**
	 * 设置读数：PM10
	 * @return
	 */
	public void setPM10(int value) {
		pm10 = value;
	}

	/**
	 * 特性：pm2.5
	 */
	public class FeaturePM25 extends Feature {

		public FeaturePM25(int index) {
			super("PM2.5", true, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
			
		}

		@Override
		public String getName() {
			return "PM2.5";
		}

		@Override
		public int getValue() {
			return pm25;
		}

		@Override
		public void setValue(int value) {
			pm25 = value;
		}

		@Override
		public String getText() {
			return getPM25String(pm25)+"  "+ pm25 + "μg/m³";
		}
	}

	/**
	 * 特性：PM10
	 */
	public class FeaturePM10 extends Feature {

		public FeaturePM10(int index) {
			super("PM10", true, true, index, 0, 1, 1,10);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "PM10";
		}

		@Override
		public int getValue() {
			return pm10;
		}

		@Override
		public void setValue(int value) {
			pm10 = value;
		}

		@Override
		public String getText() {
			return pm10 + "μg/m³";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	private static String getPM25String(int pm25){
		if (0<=pm25&&pm25<=50) {
			return "优";
		} else if (50<pm25&&pm25<=100) {
			return "良";
		} else if (100<pm25&&pm25<=150) {
			return "轻度";
		} else if (150<pm25&&pm25<=200) {
			return "中度";
		} else if (200<pm25&&pm25<=300) {
			return "重度";
		} else if (300<pm25) {
			return "严重";
		}else {
			return null;
		}
	}
}
