package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 联网型温控器(东软载波)
 */
public class ESNetworkedThermostatES0024 extends Device{
	
	private static final long serialVersionUID = 1L;
	
	public ESNetworkedThermostatES0024() {
		super(Vendor.EASTSOFT, Kind.NETWORKED_THERMOSTAT,Model.ES_0024);
	}
	
	/**
	 * 温控器状态  1-开-true  0-关-false
	 */
	private boolean powerOn;
	
	/**
	 * 温控器温度属性  (5-30)
	 */
	private int temperature = 16;
	
	/**
	 * 温控器风速【范围：0 auto 自动   ,1 low 低速 ,2 middle 中速 ,3 high高速】
	 */
	private int windSpeed ;
	
	/**
	 * 低温保护功能【范围：true使能 false不使能】
	 */
	private boolean lowTempEnable;
	
	/**
	 * 设置低温保护温度，【范围：5-30℃】
	 */
	private int lowTemp;
	
	/**
	 * 模式，【范围：0-fan通风 1-cold制冷  2-heat制热 】
	 */
	private int mode;
	
	/**
	 * 模式，【范围：cold制冷 heat制热 fan通风 】
	 */
	private boolean lockPane;
	
	/**
	 * 主动上报开关，【 范围：0-no（不上报）1-gateway（上报网关）2-device（上报设备）3-all(上报所有设备)】
	 */
	private int report;


	public boolean isPowerOn() {
		return powerOn;
	}

	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}

	public boolean isLowTempEnable() {
		return lowTempEnable;
	}

	public void setLowTempEnable(boolean lowTempEnable) {
		this.lowTempEnable = lowTempEnable;
	}

	public int getLowTemp() {
		return lowTemp;
	}

	public void setLowTemp(int lowTemp) {
		this.lowTemp = lowTemp;
	}


	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public boolean isLockPane() {
		return lockPane;
	}

	public void setLockPane(boolean lockPane) {
		this.lockPane = lockPane;
	}

	public int getReport() {
		return report;
	}

	public void setReport(int report) {
		this.report = report;
	}
	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return "温度 : "+temperature+"按键锁定: "+lockPane;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeaturePowerOn(0), 
				new FeatureTemperature(1),
				new FeatureWindSpeed(2),
				new FeatureLowTempEnable(3),
				new FeatureLowTemp(4),
				new FeatureMode(5),
				new FeatureLockPane(6),
				new FeatureReport(7)};
		return features;
	}
	/**
	 * 特性1：开关
	 */
	public class FeaturePowerOn extends Feature {

		public FeaturePowerOn(int index) {
			super("SWITCH_POWER_ON", true, false, index,0, 1, 1, 1);
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
			return powerOn ? 1:0;
		}

		@Override
		public void setValue(int value) {
			powerOn = value>0 ? true:false;
		}

		@Override
		public String getText() {
			if(powerOn)
				return "开";
			else
				return "关";
		}
	} 
	
	/**
	 * 特性2：温度5~30℃
	 */
	public class FeatureTemperature extends Feature {

		public FeatureTemperature(int index) {
			super("SWITCH_TEMPERATURE", true, false, index, 5, 30, 1, 1);
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
	 * 特性3：风速 0-auto 1-low 2-middle 3-high
	 */
	public class FeatureWindSpeed extends Feature {

		public FeatureWindSpeed (int index) {
			super("SWITCH_WindSpeed", true, false, index, 0, 3, 1, 1);
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
					return "自动";
				case 1:
					return "低速";
				case 2:
					return "中速";
				case 3:
					return "高速";
				default:
					break;
			}
			return "未知";
		}
	}
	
	/**
	 * 特性4：低温保护 1-true 0-false
	 */
	public class FeatureLowTempEnable extends Feature {

		public FeatureLowTempEnable(int index) {
			super("SWITCH_LOW_TEMP_ENABLE", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "低温保护";
		}

		@Override
		public int getValue() {
			return lowTempEnable ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			lowTempEnable = value>0 ? true : false;
		}

		@Override
		public String getText() {
			if(lowTempEnable)
				return "开启";
			else 
				return "关闭";
		}
	}
	
	/**
	 * 特性5：低温保护温度 
	 */
	public class FeatureLowTemp extends Feature {

		public FeatureLowTemp(int index) {
			super("SWITCH_LOW_TEMP", true, false, index, 5, 30, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "低温保护温度";
		}

		@Override
		public int getValue() {
			return lowTemp;
		}

		@Override
		public void setValue(int value) {
			lowTemp = value;
		}

		@Override
		public String getText() {
				return lowTemp+"℃";
		}
	}

	/**
	 * 特性6：设置模式 
	 */
	public class FeatureMode extends Feature {

		public FeatureMode(int index) {
			super("SWITCH_MODE", true, false, index, 0, 2, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "设置模式";
		}

		@Override
		public int getValue() {
			return mode;
		}

		@Override
		public void setValue(int value) {
			mode = value;
		}

		@Override
		public String getText() {
			switch (mode) {
				case 0:
					return "通风";
				case 1:
					return "制冷";
				case 2:
					return "制热";
				default:
					break;
			}
			return "未知";
		}
	}
	
	/**
	 * 特性7：按键锁定 
	 */
	public class FeatureLockPane extends Feature {

		public FeatureLockPane(int index) {
			super("SWITCH_LOCK_PANE", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "按键锁定";
		}

		@Override
		public int getValue() {
			return lockPane ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			lockPane = value>0 ? true : false;
		}

		@Override
		public String getText() {
			if (lockPane) 
				return "面板锁定";
			else 
				return "未锁定";	
		}
	}
	
	/**
	 * 特性8：主动上报模式 
	 */
	public class FeatureReport extends Feature {

		public FeatureReport(int index) {
			super("SWITCH_REPORT", true, false, index, 0, 3, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "主动上报模式";
		}

		@Override
		public int getValue() {
			return report;
		}

		@Override
		public void setValue(int value) {
			report = value;
		}

		@Override
		public String getText() {
			switch (report) {
				case 0:
					return "不上报";
				case 1:
					return "上报网关";
				case 2:
					return "上报设备";
				case 3:
					return "上报所有设备";

				default:
					break;
			}
			return "未知";
		}
	}
	
	
	@Override
	public boolean getSwitchStatus() {
		return false;
	}
	/**
	 *
	 * @return 风速映射发送mqtt  0 auto 自动   ,1 low 低速 ,2 middle 中速 ,3 high高速
	 */
	public String getWindSpeedToSend(){
		switch (windSpeed) {
			case 0:
				return "auto";
			case 1:
				return "low";
			case 2:
				return "middle";
			case 3:
				return "high";
			default:
				break;
		}
		return "auto";
	}
	/**
	 *
	 * @return 模式映射 发送mqtt 0-fan通风 1-cold制冷  2-heat制热 
	 */
	public String getModeToSend(){
		switch (windSpeed) {
			case 0:
				return "fan";
			case 1:
				return "cold";
			case 2:
				return "heat";
			default:
				break;
		}
		return "fan";
	}
	/**
	 *
	 * @return 主动上报开关映射 发送mqtt 0-no（不上报）1-gateway（上报网关）2-device（上报设备）3-all(上报所有设备) 
	 */
	public String getReportToSend(){
		switch (report) {
			case 0:
				return "no";
			case 1:
				return "gateway";
			case 2:
				return "device";
			case 3:
				return "all";
			default:
				break;
		}
		return "no";
	}
	/**
	 *
	 * @return 风速映射网关  0 auto 自动   ,1 low 低速 ,2 middle 中速 ,3 high高速
	 */
	public int getWindSpeedFromGateway(String str){
		switch (str) {
			case "auto":
				return 0;
			case "low":
				return 1;
			case "middle":
				return 2;
			case "high":
				return 3;
			default:
				break;
		}
		return 0;
	}
	/**
	 *
	 * @return 模式映射 网关 0-fan通风 1-cold制冷  2-heat制热 
	 */
	public int getModeFromGateway(String str){
		switch (str) {
			case "fan":
				return 0;
			case "cold":
				return 1;
			case "heat":
				return 2;
			default:
				break;
		}
		return 0;
	}
	
	/**
	 *
	 * @return 主动上报开关映射 网关 0-no（不上报）1-gateway（上报网关）2-device（上报设备）3-all(上报所有设备) 
	 */
	public int getReportFromGateway(String str){
		switch (str) {
			case "no":
				return 0;
			case "gateway":
				return 1;
			case "device":
				return 2;
			case "all":
				return 3;
			default:
				break;
		}
		return 0;
	}
}
