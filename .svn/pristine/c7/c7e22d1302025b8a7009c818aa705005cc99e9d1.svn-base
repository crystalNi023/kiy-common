package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 红外转发学习(东软载波)
 */
public class ESInfraredTransponderES0026 extends Device{

	private static final long serialVersionUID = 1L;

	/**
	 * 按钮控制指令
	 */
	public static final int LEARN_CODE = 2;/* 学习库码 */
	private static final int ONE = 1;/* 按键1 */
	private static final int TWO = 2;/* 按键2 */
	private static final int THREE = 3;/* 按键3 */
	private static final int FOUR = 4;/* 按键4 */
	private static final int FIVE = 5;/* 按键5 */
	private static final int SIX = 6;/* 按键6 */
	private static final int SEVEN = 7;/* 按键7 */
	private static final int EIGHT = 8;/* 按键8 */
	private static final int NINE = 9;/* 按键9 */
	private static final int TEN = 10;/* 按键10 */
	private static final int ELEVEN = 11;/* 按键11 */
	private static final int TWELVE = 12;/* 按键12 */
	private static final int THIRTEEN = 13;/* 按键13 */
	private static final int FOURTEEN = 14;/* 按键14 */
	private static final int FIFTEEN = 15;/* 按键15 */
	private static final int SIXTEEN = 16;/* 按键16 */
	private static final int SEVENTEEN = 17;/* 按键17 */
	private static final int EIGHTEEN = 18;/* 按键18 */
	private static final int NINETEEN = 19;/* 按键19 */
	private static final int TWENTY = 20;/* 按键20 */
	private static final int TWENTY_ONE = 21;/* 按键21 */
	private static final int TWENTY_TWO = 22;/* 按键22 */
	private static final int TWENTY_THREE = 23;/* 按键23 */
	private static final int TWENTY_FOUR = 24;/* 按键24 */
	// 机顶盒
	private static final int BOX_SWITCH = 25;/* 机顶盒开关键 */
	private static final int BOX_HOME = 26;/* 机顶盒主页键 */
	private static final int BOX_MENU = 27;/* 机顶盒菜单键 */
	private static final int BOX_RETURN = 28;/* 机顶盒返回键 */
	private static final int BOX_UP = 29;/* 机顶盒上键 */
	private static final int BOX_DOWN = 30;/* 机顶盒下键 */
	private static final int BOX_LEFT = 31;/* 机顶盒左键 */
	private static final int BOX_RIGHT = 32;/* 机顶盒右键 */
	private static final int BOX_ENSURE = 33;/* 机顶盒确定键 */
	private static final int BOX_CHANNEL_UPPER = 34;/* 机顶盒频道上键 */
	private static final int BOX_CHANNEL_BELOW = 35;/* 机顶盒频道下键 */
	// 音响(功放)
	private static final int VOICE_SWITCH = 36;/* 音响开关键 */
	private static final int VOICE_DVD = 37;/* 音响DVD键 */
	private static final int VOICE_BOX = 38;/* 音响机顶盒键 */
	private static final int VOICE_USB = 39;/* 音响USB键 */
	private static final int VOICE_TV = 40;/* 音响TV键 */
	private static final int VOICE_MENU = 41;/* 音响菜单键 */
	private static final int VOICE_RETURN = 42;/* 音响返回键 */
	private static final int VOICE_UP = 43;/* 音响上键 */
	private static final int VOICE_DOWN = 44;/* 音响下键 */
	private static final int VOICE_LEFT = 45;/* 音响左键 */
	private static final int VOICE_RIGHT = 46;/* 音响右键 */
	private static final int VOICE_ENSURE = 47;/* 音响确定键 */
	private static final int VOICE_VOLUME_UPPER = 48;/* 音响音量加键 */
	private static final int VOICE_VOLUME_BELOW = 49;/* 音响音量减键 */
	private static final int VOICE_SUSPEND_LEFT = 50;/* 音响模式左键 */
	private static final int VOICE_SUSPEND_RIGHT = 51;/* 音响模式右键*/
	// DVD
	private static final int DVD_SWITCH = 52;/* DVD开关键 */
	private static final int DVD_HOME = 53;/* DVD主页键 */
	private static final int DVD_MENU = 54;/* DVD菜单键 */
	private static final int DVD_RETURN = 55;/* DVD返回键 */
	private static final int DVD_UP = 56;/* DVD上键 */
	private static final int DVD_DOWN = 57;/* DVD下键 */
	private static final int DVD_LEFT = 58;/* DVD左键 */
	private static final int DVD_RIGHT = 59;/* DVD右键 */
	private static final int DVD_ENSURE = 60;/* DVD确定键 */
	private static final int DVD_PLAY = 61;/* DVD播放 */
	private static final int DVD_PAUSE = 62;/* DVD暂停 */
	private static final int DVD_SONG_LAST = 63;/* DVD上一首 */
	private static final int DVD_SONG_NEXT = 64;/* DVD下一首 */
	private static final int DVD_REWIND_DOWN = 65;/* DVD快退 */
	private static final int DVD_STOP = 66;/* DVD停止播放 */
	private static final int DVD_FAST_FORWARD = 67;/* DVD快进 */

	public ESInfraredTransponderES0026() {
		super(Vendor.EASTSOFT, Kind.INFRARED_TRANSPONDER, Model.ES_0026);
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
	 * 特性：红外控制feature 0为学习 1为控制
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
			return learn ? 0 : 1;
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
			super("SWITCH_INSTRUCT", true, false, index, 1, 67, 1, 1);
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
			//1-24  鱼缸灯
				case ONE:
					return "按键1";
				case TWO:
					return "按键2";
				case THREE:
					return "按键3";
				case FOUR:
					return "按键4";
				case FIVE:
					return "按键5";
				case SIX:
					return "按键6";
				case SEVEN:
					return "按键7";
				case EIGHT:
					return "按键8";
				case NINE:
					return "按键9";
				case TEN:
					return "按键10";
				case ELEVEN:
					return "按键11";
				case TWELVE:
					return "按键12";
				case THIRTEEN:
					return "按键13";
				case FOURTEEN:
					return "按键14";
				case FIFTEEN:
					return "按键15";
				case SIXTEEN:
					return "按键16";
				case SEVENTEEN:
					return "按键17";
				case EIGHTEEN:
					return "按键18";
				case NINETEEN:
					return "按键19";
				case TWENTY:
					return "按键20";
				case TWENTY_ONE:
					return "按键21";
				case TWENTY_TWO:
					return "按键22";
				case TWENTY_THREE:
					return "按键23";
				case TWENTY_FOUR:
					return "按键24";
				case BOX_SWITCH:
					return "机顶盒开关键";
				case BOX_HOME:
					return "机顶盒主页键";
				case BOX_MENU:
					return "机顶盒菜单键";
				case BOX_RETURN:
					return "机顶盒返回键";
				case BOX_UP:
					return "机顶盒上键";
				case BOX_DOWN:
					return "机顶盒下键";
				case BOX_LEFT:
					return "机顶盒左键";
				case BOX_RIGHT:
					return "机顶盒右键";
				case BOX_ENSURE:
					return "机顶盒确定键";
				case BOX_CHANNEL_UPPER:
					return "机顶盒频道上键";
				case BOX_CHANNEL_BELOW:
					return "机顶盒频道下键";
				case VOICE_SWITCH:
					return "音响开关键";
				case VOICE_DVD:
					return "音响DVD键";
				case VOICE_BOX:
					return "音响机顶盒键";
				case VOICE_USB:
					return "音响USB键";
				case VOICE_TV:
					return "音响TV键";
				case VOICE_MENU:
					return "音响菜单键";
				case VOICE_RETURN:
					return "音响返回键";
				case VOICE_UP:
					return "音响上键";
				case VOICE_DOWN:
					return "音响下键";
				case VOICE_LEFT:
					return "音响左键";
				case VOICE_RIGHT:
					return "音响右键";
				case VOICE_ENSURE:
					return "音响确定键";
				case VOICE_VOLUME_UPPER:
					return "音响音量加键";
				case VOICE_VOLUME_BELOW:
					return "音响音量减键";
				case VOICE_SUSPEND_LEFT:
					return "音响模式左键";
				case VOICE_SUSPEND_RIGHT:
					return "音响模式右键";
				case DVD_SWITCH:
					return "DVD开关键";
				case DVD_HOME:
					return "DVD主页键";
				case DVD_MENU:
					return "DVD菜单键";
				case DVD_RETURN:
					return "DVD返回键";
				case DVD_UP:
					return "DVD上键";
				case DVD_DOWN:
					return "DVD下键";
				case DVD_LEFT:
					return "DVD左键";
				case DVD_RIGHT:
					return "DVD右键";
				case DVD_ENSURE:
					return "DVD确定键";
				case DVD_PLAY:
					return "DVD播放";
				case DVD_PAUSE:
					return "DVD暂停";
				case DVD_SONG_LAST:
					return "DVD上一首";
				case DVD_SONG_NEXT:
					return "DVD下一首";
				case DVD_REWIND_DOWN:
					return "DVD快退";
				case DVD_STOP:
					return "DVD停止播放";
				case DVD_FAST_FORWARD:
					return "DVD快进";
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
			super("EQUIPMENT_TEMPERATURE", true, true, index, 0, 55, 1, 1);
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
