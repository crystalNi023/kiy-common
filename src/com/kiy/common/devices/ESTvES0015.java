package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 电视学习型控制器(东软载波)
 */
public class ESTvES0015 extends Device{

	private static final long serialVersionUID = 1L;

	/**
	 * 按钮控制指令
	 */
	public static final int LEARN_CODE = 1;/* 学习库码 */
	private static final int POWER = 1;/* 开关机 */
	private static final int INPUT_SOURCE = 2;/* 输入源 */
	private static final int MENU = 3;/* 菜单 */
	private static final int HOMEPAGE = 4;/* 主页 */
	private static final int NUMERIC_KEY = 5;/* 数字键 */
	private static final int RETURN_KEY = 6;/* 返回键 */
	private static final int UPPER = 7;/* 上 */
	private static final int BELOW = 8;/* 下 */
	private static final int LEFT = 9;/* 左 */
	private static final int RIGHT = 10;/* 右 */
	private static final int OK = 11;/* OK键 */
	private static final int CHANNEL_UPPER = 12;/* 频道上键 */
	private static final int CHANNEL_BELOW = 13;/* 频道下键 */
	private static final int VOLUME_UPPER = 14;/* 音量上键 */
	private static final int VOLUME_BELOW = 15;/* 音量下键 */
	private static final int EXTEND = 16;/* 扩展键 */
	private static final int MUTE = 17;/* 静音键 */
	private static final int NUMBER_ONE = 18;/* 数字键1 */
	private static final int NUMBER_TWO = 19;/* 数字键2 */
	private static final int NUMBER_THREE = 20;/* 数字键3 */
	private static final int NUMBER_FORE = 21;/* 数字键4 */
	private static final int NUMBER_FIVE = 22;/* 数字键5 */
	private static final int NUMBER_SIX = 23;/* 数字键6 */
	private static final int NUMBER_SEVEN = 24;/* 数字键7 */
	private static final int NUMBER_EIGHT = 25;/* 数字键8 */
	private static final int NUMBER_NINE = 26;/* 数字键9 */
	private static final int NUMBER_ZERO = 27;/* 数字键0 */

	public ESTvES0015() {
		super(Vendor.EASTSOFT, Kind.TELEVISION, Model.ES_0015);
	}

	/**
	 * 判断是否为控制 true-学习 false-控制
	 */
	private boolean learn;

	/**
	 * 控制指令编号
	 */
	private int instruct = 1;
	
	/**
	 * 设备温度
	 */
	private float equipmentTemperature;
	
	/**
	 * 设备湿度
	 */
	private float equipmentHumidness;

	/**
	 * 获取是否为控制 true-学习 false-控制
	 */
	public boolean getLearn() {
		return learn;
	}

	/**
	 * 设置是否为控制 true-学习 false-控制
	 */
	public void setLearn(boolean learn) {
		this.learn = learn;
	}

	/**
	 * 获取控制指令编号
	 * 
	 * @return
	 */
	public int getInstruct() {
		return instruct;
	}

	/**
	 * 设置控制指令编号
	 * 
	 * @param instruct
	 */
	public void setInstruct(int instruct) {
		this.instruct = instruct;
	}
	
	public float getEquipmentTemperature() {
		return equipmentTemperature;
	}

	public void setEquipmentTemperature(float equipmentTemperature) {
		this.equipmentTemperature = equipmentTemperature;
	}

	public float getEquipmentHumidness() {
		return equipmentHumidness;
	}

	public void setEquipmentHumidness(float equipmentHumidness) {
		this.equipmentHumidness = equipmentHumidness;
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return " 设备温度："+equipmentTemperature+" 设备湿度："+equipmentHumidness;
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureControl(0), new FeatureInstruct(1),new FeatureEquipmentTemperature(2),new FeatureEquipmentHumidness(3) };
		return features;
	}

	/**
	 * 特性：空调控制feature 0为学习 1为控制
	 */
	public class FeatureControl extends Feature {

		public FeatureControl(int index) {
			super("SWITCH_CONTROL_LEARN", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "控制/学习";
		}

		@Override
		public int getValue() {
			return learn ? 0 : 1;/* 0为学习 1为控制 */
		}

		@Override
		public void setValue(int value) {
			learn = value == 0 ? true : false;/* 0为学习 1为控制 */
		}

		@Override
		public String getText() {
			return learn ? "学习" : "控制";
		}

	}
	
	public class FeatureInstruct extends Feature{

		
		public FeatureInstruct(int index) {
			super("SWITCH_INSTRUCT", true, false, index, 1, 27, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "指令";
		}

		@Override
		public int getValue() {
			return instruct;
		}

		@Override
		public void setValue(int value) {
			instruct = value;
		}

		@Override
		public String getText() {
			switch (instruct) {
				case POWER:
					return "开关";
				case INPUT_SOURCE:
					return "输入源";
				case MENU:
					return "菜单";
				case HOMEPAGE:
					return "主页";
				case NUMERIC_KEY:
					return "数字";
				case RETURN_KEY:
					return "返回";
				case UPPER:
					return "上";
				case BELOW:
					return "下";
				case LEFT:
					return "左";
				case RIGHT:
					return "右";
				case OK:
					return "OK";
				case CHANNEL_UPPER:
					return "频道上键";
				case CHANNEL_BELOW:
					return "频道下键";
				case VOLUME_UPPER:
					return "音量上键";
				case VOLUME_BELOW:
					return "音量下键";
				case EXTEND:
					return "扩展键";
				case MUTE:
					return "静音键";
				case NUMBER_ONE:
					return "数字键1";
				case NUMBER_TWO:
					return "数字键2";
				case NUMBER_THREE:
					return "数字键3";
				case NUMBER_FORE:
					return "数字键4";
				case NUMBER_FIVE:
					return "数字键5";
				case NUMBER_SIX:
					return "数字键6";
				case NUMBER_SEVEN:
					return "数字键7";
				case NUMBER_EIGHT:
					return "数字键8";
				case NUMBER_NINE:
					return "数字键9";
				case NUMBER_ZERO:
					return "数字键0";
				default:
					break;
			}
			return null;
		}
	}
	/**
	 * 特性：设备温度
	 */
	public class FeatureEquipmentTemperature extends Feature {

		public FeatureEquipmentTemperature(int index) {
			super("EQUIPMENT_TEMPERATURE", true, true, index, 0, 100, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "设备温度";
		}

		@Override
		public int getValue() {
			return (int) (equipmentTemperature * 10);
		}

		@Override
		public void setValue(int value) {
			equipmentTemperature = (float) (value / 10.00);
		}

		@Override
		public String getText() {
			return equipmentTemperature+"℃";
		}
	}
	
	/**
	 * 特性：设备湿度
	 */
	public class FeatureEquipmentHumidness extends Feature {

		public FeatureEquipmentHumidness(int index) {
			super("EQUIPMENT_HUMIDNESS", true, true, index, 0, 100, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "设备湿度";
		}

		@Override
		public int getValue() {
			return (int) (equipmentHumidness * 10);
		}

		@Override
		public void setValue(int value) {
			equipmentHumidness = (float) (value / 10.00);
		}

		@Override
		public String getText() {
			return equipmentHumidness+"%rh";
		}
	}

}
