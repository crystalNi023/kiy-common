package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 声光报警器
 * 型号MB_0015
 * @author HLX Tel:18996470535 
 * @date 2018年5月30日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusAudibleAndVisualAlarm extends Device{
	
	private static final long serialVersionUID = 1L;
	
	private boolean beep; //蜂鸣器1 true为开 /false 为关
	
	private boolean light; //闪光 true为开 /false 为关

	public MudbusAudibleAndVisualAlarm() {
		super(Vendor.MUDBUS,Kind.AUDIBLE_VISUAL_ALARM,Model.MB_0015);
	}
	
	/**
	 * 获取状态 true为开/false为关
	 */
	public boolean isBeep() {
		return beep;
	}

	/**
	 * 设置状态 true为开/false为关
	 */
	public void setBeep(boolean beep) {
		this.beep = beep;
	}

	/**
	 * 获取状态 true为开/false为关
	 */
	public boolean isLight() {
		return light;
	}
	
	/**
	 * 设置状态 true为开/false为关
	 */
	public void setLight(boolean light) {
		this.light = light;
	}



	/**
	 * 获取设备状态
	 */
	@Override
	public Status getFeatureStatus() {
		if (beep || light)
			return Status.BEEP;
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		if (beep || light)
			return "开";
		return "关";
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureBeep(0) ,  new FeatureLight(1)};
		return features;
	}

	public class FeatureBeep extends Feature{
		
		public FeatureBeep(int index){
			super("BEEP",true,false,index,0,1,1,1);
		}

		/**
		 * 获取设备状态
		 */
		@Override
		public Status getAlarm() {
			return beep?Status.BEEP:Status.NONE;
		}

		@Override
		public String getName() {
			return "蜂鸣器1";
		}

		/**
		 * 获取设备状态 1为开/0为关
		 */
		@Override
		public int getValue() {
			return beep?1:0;
		}

		/**
		 * 设置设备状态 1为开/0为关
		 */
		@Override
		public void setValue(int value) {
			beep = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return beep?"ON":"OFF";
		}
	}
	


public class FeatureLight extends Feature{
	
	public FeatureLight(int index){
		super("LIGHT",true,false,index,0,1,1,1);
	}

	/**
	 * 获取设备状态
	 */
	@Override
	public Status getAlarm() {
		return light?Status.BEEP:Status.NONE;
	}

	@Override
	public String getName() {
		return "闪光";
	}

	/**
	 * 获取设备状态 1为开/0为关
	 */
	@Override
	public int getValue() {
		return light?1:0;
	}

	/**
	 * 设置设备状态 1为开/0为关
	 */
	@Override
	public void setValue(int value) {
		light = value > 0 ? true : false;
	}

	@Override
	public String getText() {
		return light?"ON":"OFF";
	}
}



@Override
public boolean getSwitchStatus() {
	return beep;
}
}
