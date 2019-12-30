package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 人体红外感应器 (东软载波)
 */
public class ESHumanInfraredES0023 extends Device {

	private static final long serialVersionUID = 1L;

	private boolean people;
	private int light;
	private int illumination;
	
	

	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public int getIllumination() {
		return illumination;
	}

	public void setIllumination(int illumination) {
		this.illumination = illumination;
	}

	public void setPeople(boolean people) {
		this.people = people;
	}

	public boolean getPeople() {
		return people;
	}

	public ESHumanInfraredES0023() {
		super(Vendor.EASTSOFT, Kind.HUMAN_INFRARED, Model.ES_0023);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return ((people ? " 有人 " : " 无人 ") + " 光照强度：" + light + "% 光照度：" + illumination + "lux");
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeaturePeople(0) , new FeatureLight(1), new FeatureIllumination(2)};
		return features;
	}

	/**
	 * 检测是否有人
	 */
	public class FeaturePeople extends Feature {

		public FeaturePeople(int index) {
			super("PEOPLE", true, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "是否有人";
		}

		@Override
		public int getValue() {
			return people ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			people = value > 0 ? true : false;

		}

		@Override
		public String getText() {
			return people ? "有人" : "无人";
		}
	}
	/**
	 * 光照强度
	 */
	public class FeatureLight extends Feature{

		public FeatureLight(int index) {
			super("LIGHT", true, true, index, 0, 100, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "光照强度";
		}

		@Override
		public int getValue() {
			return light;
		}

		@Override
		public void setValue(int value) {
			light = value;
		}

		@Override
		public String getText() {
			return light+"%";
		}
	}
	public class FeatureIllumination extends Feature{

		public FeatureIllumination( int index) {
			super("ILLUMINATION", true, true, index, 0, 10000, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "光照度";
		}

		@Override
		public int getValue() {
			return illumination;
		}

		@Override
		public void setValue(int value) {
			illumination = value;
		}

		@Override
		public String getText() {
			return illumination+"lux";
		}
		
	}
	
}
