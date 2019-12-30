package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Tool;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

public class ESCurtainES0013_01 extends Device{

	private static final long serialVersionUID = 1L;
	
	// 窗帘控制方式 (true状态控制/false百分比控制)
	private boolean control;
	// 窗帘状态数据
	private int feed;
	// 开启百分比
	private int percent;
	

	public ESCurtainES0013_01() {
		super(Vendor.EASTSOFT, Kind.CURTAIN_CONTROLLER,Model.ES_0013_01);
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureControl(0),new FeatureFeed(1),new FeaturePercent(2)};
		return features;
	}
	
	public boolean isControl() {
		return control;
	}

	public void setControl(boolean control) {
		this.control = control;
	}

	public int getFeed() {
		return feed;
	}

	public void setFeed(int feed) {
		this.feed = feed;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}



	/**
	 * 特性:控制方式
	 */
	public class FeatureControl extends Feature {
		
		public FeatureControl(int index) {
			super("Control", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "控制方式";
		}

		@Override
		public int getValue() {
			return control?0:1;
		}

		@Override
		public void setValue(int value) {
			control = value>0?false:true;
		}

		@Override
		public String getText() {
			return control?"开关控制":"百分比控制";
		}
	}


	/**
	 * 特性：窗帘开关
	 */
	public class FeatureFeed extends Feature {

		public FeatureFeed(int index) {
			super("SWITCH", true, false, index, 0, 2, 1, 1);
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
			return feed;
		}

		@Override
		public void setValue(int value) {
			feed = value;
		}

		@Override
		public String getText() {
			switch (feed) {
				case 0:
					return "关闭";
				case 1:
					return "开启";
				case 2:
					return "暂停";
				default:
					return Tool.EMPTY;
			}
		}
	}
	
	/**
	 * 特性：窗帘开启百分比
	 */
	public class FeaturePercent extends Feature {

		public FeaturePercent(int index) {
			super("Percent", true, false, index, 0, 100, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开启百分比";
		}

		@Override
		public int getValue() {
			return percent ;
		}

		@Override
		public void setValue(int value) {
			percent = value;
		}

		@Override
		public String getText() {
			return percent +"%";
		}
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return percent+"%";
	}

	@Override
	public boolean getSwitchStatus() {   
		return false;
	}
	
}
