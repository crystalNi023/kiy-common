package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * Tip:可燃气体单位换算
 * 对于甲烷，爆炸下限为5%，对应可燃气体100LEL%
 * 例如当前读取的可燃气体浓度为3.1%,则空气中甲烷的含量为3.1%*5%=0.155%,也就是1550ppm
 * 对于丙烷，爆炸下2.1%,对于可燃气体100LEL%
 * 例如当前读取到的可燃气体浓度为7.8%，则空气中丙烷的含量为7.8%*2.1%=0.1638%，也就是1638ppm
 * 
 * 报警设置
 * 如果需要对应设置警报值，按照国家要求，低报警点应该设置为15%LEL到25%LEL之间，推荐设置为15%LEL，高报警点一般设置为50%LEL即可
 */

/**
 * MUDBUS-精讯畅通 甲烷传感器
 * 型号 MB_0006
 * @author HLX Tel:18996470535 
 * @date 2018年4月12日 
 * Copyright:Copyright(c) 2018
 */
public class MudbusMethaneSensorMB0006 extends Device{

	/**
	 * 读数
	 */
	private float degree;

	private static final long serialVersionUID = 1L;

	public MudbusMethaneSensorMB0006() {
		super(Vendor.MUDBUS, Kind.SENSOR_METHANE, Model.MB_0006);
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
		return degree+"LEL%";
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
			super("DEGREE", true, true, index, 0, 0, 0, 10);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "甲烷浓度";
		}

		@Override
		public int getValue() {
			return (int) (degree *10);
		}

		@Override
		public void setValue(int value) {
			degree = (float)(value / 10.0) ;
		}

		@Override
		public String getText() {
			return degree + "LEL%";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}


}
