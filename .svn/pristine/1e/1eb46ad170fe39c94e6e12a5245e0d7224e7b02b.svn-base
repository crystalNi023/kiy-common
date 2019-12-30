/**
 * 2017年6月8日
 */
package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 干式变压器温度控制器，济南灵瑞电器有限公司；支持型号:3200DR/3200SR
 * 型号 LR_0001
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class LRTransformerTemperature extends Device {

	private static final long serialVersionUID = 1L;

	// 读数：A相温度
	private float a;
	// 读数：B相温度
	private float b;
	// 读数：C相温度
	private float c;
	// 读数：D相温度
	private float d;
	// 状态/控制：超温报警
	private boolean over;
	// 状态/控制：跳闸开关
	private boolean trip;
	// 状态/控制：风机开关
	private boolean fan;

	// 状态：传感器A
	private boolean sensorA;
	// 状态：传感器B
	private boolean sensorB;
	// 状态：传感器C
	private boolean sensorC;
	// 状态：传感器D
	private boolean sensorD;

	// 设定：风机关阀值
	private int thresholdOffFan;
	// 设定：风机开阀值
	private int thresholdOnFan;
	// 设定：超温报警阀值
	private int thresholdOverheat;
	// 设定：跳闸阀值
	private int thresholdTrip;
	// 设定：显示（设备面板温度显示方式）
	private boolean display;
	// 设定：风机自动启动
	private boolean autoFan;

	public LRTransformerTemperature() {
		super(Vendor.LINGRUI, Kind.TRANSFORMER_TEMPERATURE_CONTROLLER,Model.LR_0001);
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureA(0), new FeatureB(1), new FeatureC(2), new FeatureOver(3), new FeatureTrip(4), new FeatureFan(5), new FeatureSA(6), new FeatureSB(7), new FeatureSC(8), new FeatureSD(9) };
		return features;
	}

	@Override
	public Status getFeatureStatus() {
		if (sensorA || sensorB || sensorC || sensorD) {
			return Status.FAULT;
		}
		if (over) {
			return Status.THRESHOLD;
		}
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		if (a > b && a > c && a > d)
			return a + "C";
		if (b > a && b > c && b > d)
			return b + "C";
		if (c > a && c > b && c > d)
			return c + "C";
		if (d > a && d > b && d > c)
			return d + "C";

		return a + "℃";
	}

	/**
	 * 获取读数：A相温度
	 */
	public float getA() {
		return a;
	}

	/**
	 * 设置读数：A相温度
	 */
	public void setA(float value) {
		a = value;
	}

	/**
	 * 获取读数：B相温度
	 */
	public float getB() {
		return b;
	}

	/**
	 * 设置读数：B相温度
	 */
	public void setB(float value) {
		b = value;
	}

	/**
	 * 获取读数：C相温度
	 */
	public float getC() {
		return c;
	}

	/**
	 * 设置读数：C相温度
	 */
	public void setC(float value) {
		c = value;
	}

	/**
	 * 获取读数：D相温度（铁蕊温度）
	 */
	public float getD() {
		return d;
	}

	/**
	 * 设置读数：D相温度（铁蕊温度）
	 */
	public void setD(float value) {
		d = value;
	}

	/**
	 * 获取状态：超温报警
	 */
	public boolean isOver() {
		return over;
	}

	/**
	 * 设置状态：超温报警
	 */
	public void setOver(boolean value) {
		over = value;
	}

	/**
	 * 获取状态：跳闸开关
	 */
	public boolean isTrip() {
		return trip;
	}

	/**
	 * 设置状态：跳闸开关
	 */
	public void setTrip(boolean value) {
		trip = value;
	}

	/**
	 * 获取状态：风机开关
	 */
	public boolean isFan() {
		return fan;
	}

	/**
	 * 设置状态：风机开关
	 */
	public void setFan(boolean value) {
		fan = value;
	}

	/**
	 * 获取状态：传感器A
	 */
	public boolean isSensorA() {
		return sensorA;
	}

	/**
	 * 设置状态：传感器A
	 */
	public void setSensorA(boolean value) {
		sensorA = value;
	}

	/**
	 * 获取状态：传感器B
	 */
	public boolean isSensorB() {
		return sensorB;
	}

	/**
	 * 设置状态：传感器B
	 */
	public void setSensorB(boolean value) {
		sensorB = value;
	}

	/**
	 * 获取状态：传感器C
	 */
	public boolean isSensorC() {
		return sensorC;
	}

	/**
	 * 设置状态：传感器C
	 */
	public void setSensorC(boolean value) {
		sensorC = value;
	}

	/**
	 * 获取状态：传感器D
	 */
	public boolean isSensorD() {
		return sensorD;
	}

	/**
	 * 设置状态：传感器D
	 */
	public void setSensorD(boolean value) {
		sensorD = value;
	}

	/**
	 * 获取设定：风机关阀值
	 */
	public int getThresholdOffFan() {
		return thresholdOffFan;
	}

	/**
	 * 设置设定：风机关阀值
	 */
	public void setThresholdOffFan(int value) {
		thresholdOffFan = value;
	}

	/**
	 * 获取设定：风机开阀值
	 */
	public int getThresholdOnFan() {
		return thresholdOnFan;
	}

	/**
	 * 设置设定：风机开阀值
	 */
	public void setThresholdOnFan(int value) {
		thresholdOnFan = value;
	}

	/**
	 * 获取设定：超温报警阀值
	 */
	public int getThresholdOverheat() {
		return thresholdOverheat;
	}

	/**
	 * 设置设定：超温报警阀值
	 */
	public void setThresholdOverheat(int value) {
		thresholdOverheat = value;
	}

	/**
	 * 获取设定：跳闸阀值
	 */
	public int getThresholdTrip() {
		return thresholdTrip;
	}

	/**
	 * 设置设定：跳闸阀值
	 */
	public void setThresholdTrip(int value) {
		thresholdTrip = value;
	}

	/**
	 * 获取设定：显示（设备面板温度显示方式）
	 */
	public boolean isDisplay() {
		return display;
	}

	/**
	 * 设置设定：显示（设备面板温度显示方式）
	 */
	public void setDisplay(boolean value) {
		display = value;
	}

	/**
	 * 获取设定：风机自动启动
	 */
	public boolean isAutoFan() {
		return autoFan;
	}

	/**
	 * 设置设定：风机自动启动
	 */
	public void setAutoFan(boolean value) {
		autoFan = value;
	}

	/**
	 * 特性：A相
	 */
	public class FeatureA extends Feature {

		public FeatureA(int index) {
			super("TEMPERATURE", true, true, index, -20, 200, 1,10);
		}

		@Override
		public Status getAlarm() {
			if (a >= thresholdOverheat)
				return Status.THRESHOLD;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "A相温度";
		}

		@Override
		public int getValue() {
			return (int) (a * 10);
		}

		@Override
		public void setValue(int value) {
			a = (float) (value / 10.0);
		}

		@Override
		public String getText() {
			return a + "℃";
		}
	}

	/**
	 * 特性：B相
	 */
	public class FeatureB extends Feature {

		public FeatureB(int index) {
			super("TEMPERATURE", true, true, index, -20, 200, 1,10);
		}

		@Override
		public Status getAlarm() {
			if (b >= thresholdOverheat)
				return Status.THRESHOLD;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "B相温度";
		}

		@Override
		public int getValue() {
			return (int) (b * 10);
		}

		@Override
		public void setValue(int value) {
			b = (float) (value / 10.0);
		}

		@Override
		public String getText() {
			return b + "℃";
		}
	}

	/**
	 * 特性：C相
	 */
	public class FeatureC extends Feature {

		public FeatureC(int index) {
			super("TEMPERATURE", true, true, index, -20, 200, 1,10);
		}

		@Override
		public Status getAlarm() {
			if (c >= thresholdOverheat)
				return Status.THRESHOLD;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "C相温度";
		}

		@Override
		public int getValue() {
			return (int) (c * 10);
		}

		@Override
		public void setValue(int value) {
			c = (float) (value / 10.0);
		}

		@Override
		public String getText() {
			return c + "℃";
		}
	}

	/**
	 * 特性：D相
	 */
	public class FeatureD extends Feature {

		public FeatureD(int index) {
			super("TEMPERATURE", true, true, index, -20, 200, 10,10);
		}

		@Override
		public Status getAlarm() {
			if (d >= thresholdOverheat)
				return Status.THRESHOLD;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "D相温度";
		}

		@Override
		public int getValue() {
			return (int) (d * 10);
		}

		@Override
		public void setValue(int value) {
			d = (float) (value / 10.0);
		}

		@Override
		public String getText() {
			return d + "℃";
		}
	}

	/**
	 * 特性：触警
	 */
	public class FeatureOver extends Feature {

		public FeatureOver(int index) {
			super("SWITCH", true, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			if (over)
				return Status.THRESHOLD;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "超温";
		}

		@Override
		public int getValue() {
			return over ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			over = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return over ? "ON" : "OFF";
		}
	}

	/**
	 * 特性：风机
	 */
	public class FeatureFan extends Feature {

		public FeatureFan(int index) {
			super("SWITCH", true, false, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			if (fan)
				return Status.THRESHOLD;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "风机";
		}

		@Override
		public int getValue() {
			return fan ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			fan = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return fan ? "ON" : "OFF";
		}
	}

	/**
	 * 特性：跳闸
	 */
	public class FeatureTrip extends Feature {

		public FeatureTrip(int index) {
			super("SWITCH", true, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			if (trip)
				return Status.THRESHOLD;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "跳闸";
		}

		@Override
		public int getValue() {
			return trip ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			trip = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return trip ? "ON" : "OFF";
		}
	}

	/**
	 * 特性：传感器A
	 */
	public class FeatureSA extends Feature {

		public FeatureSA(int index) {
			super("SENSOR", false, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			if (sensorA)
				return Status.FAULT;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "传感器A";
		}

		@Override
		public int getValue() {
			return sensorA ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			sensorA = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return sensorA ? "OK" : "FAUL";
		}
	}

	/**
	 * 特性：传感器B
	 */
	public class FeatureSB extends Feature {

		public FeatureSB(int index) {
			super("SENSOR", false, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			if (sensorB)
				return Status.FAULT;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "传感器B";
		}

		@Override
		public int getValue() {
			return sensorB ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			sensorB = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return sensorB ? "OK" : "FAUL";
		}
	}

	/**
	 * 特性：传感器C
	 */
	public class FeatureSC extends Feature {

		public FeatureSC(int index) {
			super("SENSOR", false, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			if (sensorC)
				return Status.FAULT;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "传感器C";
		}

		@Override
		public int getValue() {
			return sensorC ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			sensorC = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return sensorC ? "OK" : "FAUL";
		}
	}

	/**
	 * 特性：传感器D
	 */
	public class FeatureSD extends Feature {

		public FeatureSD(int index) {
			super("SENSOR", false, true, index, 0, 1, 1,1);
		}

		@Override
		public Status getAlarm() {
			if (sensorD)
				return Status.FAULT;
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "传感器D";
		}

		@Override
		public int getValue() {
			return sensorD ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			sensorD = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return sensorD ? "OK" : "FAUL";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}
}