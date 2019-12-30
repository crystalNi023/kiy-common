package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 空调学习型控制器(东软载波)
 */
public class ESAirES0014 extends Device{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 按钮控制指令
	 */
	public static final int LEARN_CODE=0;/*学习库码*/
	private static final int OPEN = 1;/*开启*/
	private static final int OFF = 2;/*关闭*/
	private static final int WIND_SPEEN_LOW_16 = 3;/*温度16风速低*/
	private static final int WIND_SPEEN_LOW_17 = 4;/*温度17风速低*/
	private static final int WIND_SPEEN_LOW_18 = 5;/*温度18风速低*/
	private static final int WIND_SPEEN_LOW_19 = 6;/*温度19风速低*/
	private static final int WIND_SPEEN_LOW_20 = 7;/*温度20风速低*/
	private static final int WIND_SPEEN_LOW_21 = 8;/*温度21风速低*/
	private static final int WIND_SPEEN_LOW_22 = 9;/*温度22风速低*/
	private static final int WIND_SPEEN_LOW_23 = 10;/*温度23风速低*/
	private static final int WIND_SPEEN_LOW_24 = 11;/*温度24风速低*/
	private static final int WIND_SPEEN_LOW_25 = 12;/*温度25风速低*/
	private static final int WIND_SPEEN_LOW_26 = 13;/*温度26风速低*/
	private static final int WIND_SPEEN_LOW_27 = 14;/*温度27风速低*/
	private static final int WIND_SPEEN_LOW_28 = 15;/*温度28风速低*/
	private static final int WIND_SPEEN_LOW_29 = 16;/*温度29风速低*/
	private static final int WIND_SPEEN_LOW_30 = 17;/*温度30风速低*/
	private static final int WIND_SPEEN_MIDDLE_16 = 18;/*温度16风速中*/
	private static final int WIND_SPEEN_MIDDLE_17 = 19;/*温度17风速中*/
	private static final int WIND_SPEEN_MIDDLE_18 = 20;/*温度18风速中*/
	private static final int WIND_SPEEN_MIDDLE_19 = 21;/*温度19风速中*/
	private static final int WIND_SPEEN_MIDDLE_20 = 22;/*温度20风速中*/
	private static final int WIND_SPEEN_MIDDLE_21 = 23;/*温度21风速中*/
	private static final int WIND_SPEEN_MIDDLE_22 = 24;/*温度22风速中*/
	private static final int WIND_SPEEN_MIDDLE_23 = 25;/*温度23风速中*/
	private static final int WIND_SPEEN_MIDDLE_24 = 26;/*温度24风速中*/
	private static final int WIND_SPEEN_MIDDLE_25 = 27;/*温度25风速中*/
	private static final int WIND_SPEEN_MIDDLE_26 = 28;/*温度26风速中*/
	private static final int WIND_SPEEN_MIDDLE_27 = 29;/*温度27风速中*/
	private static final int WIND_SPEEN_MIDDLE_28 = 30;/*温度28风速中*/
	private static final int WIND_SPEEN_MIDDLE_29 = 31;/*温度29风速中*/
	private static final int WIND_SPEEN_MIDDLE_30 = 32;/*温度30风速中*/
	private static final int WIND_SPEEN_HIGH_16 = 33;/*温度16风速高*/
	private static final int WIND_SPEEN_HIGH_17 = 34;/*温度17风速高*/
	private static final int WIND_SPEEN_HIGH_18 = 35;/*温度18风速高*/
	private static final int WIND_SPEEN_HIGH_19 = 36;/*温度19风速高*/
	private static final int WIND_SPEEN_HIGH_20 = 37;/*温度20风速高*/
	private static final int WIND_SPEEN_HIGH_21 = 38;/*温度21风速高*/
	private static final int WIND_SPEEN_HIGH_22 = 39;/*温度22风速高*/
	private static final int WIND_SPEEN_HIGH_23 = 40;/*温度23风速高*/
	private static final int WIND_SPEEN_HIGH_24 = 41;/*温度24风速高*/
	private static final int WIND_SPEEN_HIGH_25 = 42;/*温度25风速高*/
	private static final int WIND_SPEEN_HIGH_26 = 43;/*温度26风速高*/
	private static final int WIND_SPEEN_HIGH_27 = 44;/*温度27风速高*/
	private static final int WIND_SPEEN_HIGH_28 = 45;/*温度28风速高*/
	private static final int WIND_SPEEN_HIGH_29 = 46;/*温度29风速高*/
	private static final int WIND_SPEEN_HIGH_30 = 47;/*温度30风速高*/

	public ESAirES0014() {
		super(Vendor.EASTSOFT, Kind.AIR_CONDITIONER,Model.ES_0014);
	}
	
	/**
	 * 判断是否为控制  true-学习  false-控制
	 */
	private boolean learn;
	
	/**
	 * 空调开关属性 0为开 1为关 2为无控制 
	 */
	private int open;
	
	/**
	 * 空调温度属性  (16-30)
	 */
	private int temperature = 16;
	
	/**
	 * 设备温度
	 */
	private float equipmentTemperature;
	
	/**
	 * 设备湿度
	 */
	private float equipmentHumidness;
	
	/**
	 * 空调风速属性 三档
	 */
	private int windSpeed;

	/**
	 * 获取是否为控制 true-学习  false-控制
	 */
	public boolean getLearn() {
		return learn;
	}

	/**
	 * 设置是否为控制 true-学习  false-控制
	 */
	public void setLearn(boolean learn) {
		this.learn = learn;
	}

	/**
	 * 获取是否打开 0为开 1为关 2为无控制 
	 */
	public int getOpen() {
		return open;
	}

	/**
	 * 设置是否为打开 true-开 false-关
	 */
	public void setOpen(int open) {
		this.open = open;
	}

	/**
	 * 获取温度
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * 设置温度
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	/**
	 * 获取风速
	 */
	public int getWindSpeed() {
		return windSpeed;
	}

	/**
	 * 设置风速
	 */
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
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

	/**
	 * 获取按钮指令
	 */
	public int getControl() {
		if (open == 0) {
			return OPEN;
		}else if(open == 1){
			return OFF;
		}else {
			if(windSpeed==0){/*风速为低或未选择风速默认为低*/
				switch (temperature) {
					case 16:
						return WIND_SPEEN_LOW_16;
					case 17:
						return WIND_SPEEN_LOW_17;
					case 18:
						return WIND_SPEEN_LOW_18;
					case 19:
						return WIND_SPEEN_LOW_19;
					case 20:
						return WIND_SPEEN_LOW_20;
					case 21:
						return WIND_SPEEN_LOW_21;
					case 22:
						return WIND_SPEEN_LOW_22;
					case 23:
						return WIND_SPEEN_LOW_23;
					case 24:
						return WIND_SPEEN_LOW_24;
					case 25:
						return WIND_SPEEN_LOW_25;
					case 26:
						return WIND_SPEEN_LOW_26;
					case 27:
						return WIND_SPEEN_LOW_27;
					case 28:
						return WIND_SPEEN_LOW_28;
					case 29:
						return WIND_SPEEN_LOW_29;
					case 30:
						return WIND_SPEEN_LOW_30;
					default:
						return WIND_SPEEN_LOW_24;
				}
			}else if(windSpeed==1){
				switch (temperature) {
					case 16:
						return WIND_SPEEN_MIDDLE_16;
					case 17:
						return WIND_SPEEN_MIDDLE_17;
					case 18:
						return WIND_SPEEN_MIDDLE_18;
					case 19:
						return WIND_SPEEN_MIDDLE_19;
					case 20:
						return WIND_SPEEN_MIDDLE_20;
					case 21:
						return WIND_SPEEN_MIDDLE_21;
					case 22:
						return WIND_SPEEN_MIDDLE_22;
					case 23:
						return WIND_SPEEN_MIDDLE_23;
					case 24:
						return WIND_SPEEN_MIDDLE_24;
					case 25:
						return WIND_SPEEN_MIDDLE_25;
					case 26:
						return WIND_SPEEN_MIDDLE_26;
					case 27:
						return WIND_SPEEN_MIDDLE_27;
					case 28:
						return WIND_SPEEN_MIDDLE_28;
					case 29:
						return WIND_SPEEN_MIDDLE_29;
					case 30:
						return WIND_SPEEN_MIDDLE_30;
					default:
						return WIND_SPEEN_MIDDLE_24;
				}
			}else {
				switch (temperature) {
					case 16:
						return WIND_SPEEN_HIGH_16;
					case 17:
						return WIND_SPEEN_HIGH_17;
					case 18:
						return WIND_SPEEN_HIGH_18;
					case 19:
						return WIND_SPEEN_HIGH_19;
					case 20:
						return WIND_SPEEN_HIGH_20;
					case 21:
						return WIND_SPEEN_HIGH_21;
					case 22:
						return WIND_SPEEN_HIGH_22;
					case 23:
						return WIND_SPEEN_HIGH_23;
					case 24:
						return WIND_SPEEN_HIGH_24;
					case 25:
						return WIND_SPEEN_HIGH_25;
					case 26:
						return WIND_SPEEN_HIGH_26;
					case 27:
						return WIND_SPEEN_HIGH_27;
					case 28:
						return WIND_SPEEN_HIGH_28;
					case 29:
						return WIND_SPEEN_HIGH_29;
					case 30:
						return WIND_SPEEN_HIGH_30;
					default:
						return WIND_SPEEN_HIGH_24;	
				}
			}
		}
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		if (open ==2) {
			return "温度 : "+temperature+" 风速 : "+windSpeed +" 模式 : 自动"+" 设备温度："+equipmentTemperature+" 设备湿度："+equipmentHumidness;
		}else if(open == 1){
			return "关";
		}else {
			return "开";
		}
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureControl(0), new FeatureOpen(1), new FeatureTemperature(2),new FeatureWindSpeed(3),new FeatureEquipmentTemperature(4),new FeatureEquipmentHumidness(5) };
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
			return learn? 0:1;/*0为学习  1位控制*/
		}

		@Override
		public void setValue(int value) {/*0为学习  1位控制*/
			learn = value==0?true:false;
		}

		@Override
		public String getText() {
			return learn? "学习":"控制";
		}
	}
	
	/**
	 * 特性：开关
	 */
	public class FeatureOpen extends Feature {

		public FeatureOpen(int index) {
			super("SWITCH_OPEN", true, false, index,0, 2, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开关";
		}

		@Override
		public int getValue() {
			return open;
		}

		@Override
		public void setValue(int value) {
			open = value;
		}

		@Override
		public String getText() {
			switch (open) {
				case 0:
					return "开";
				case 1:
					return "关";
				case 2:
					return "无控制";
			}
			return "无控制";
		}
	}

	
	/**
	 * 特性：温度
	 */
	public class FeatureTemperature extends Feature {

		public FeatureTemperature(int index) {
			super("SWITCH_TEMPERATURE", true, false, index, 16, 30, 1, 1);
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
			return temperature;
		}

		@Override
		public void setValue(int value) {
			temperature = value;
		}

		@Override
		public String getText() {
			return temperature+"℃";
		}
	}
	
	/**
	 * 特性：风速
	 */
	public class FeatureWindSpeed extends Feature {

		public FeatureWindSpeed(int index) {
			super("SWITCH_WIND_SPEED", true, false, index, 0, 2, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "风速";
		}

		@Override
		public int getValue() {
			return windSpeed;
		}

		@Override
		public void setValue(int value) {
			windSpeed = value;
		}

		@Override
		public String getText() {
			switch (windSpeed) {
				case 0:
					return "低";
				case 1:
					return "中";
				case 2:
					return "高";
			}
			return "低";
		
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
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
