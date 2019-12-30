package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 调光控制模块(2路可控硅2)(东软载波)
 */
public class ESDimmingES0019_02 extends Device{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 开关
	 */
	private boolean feed;

	/**
	 * 光度
	 */
	private int luminosity;
	
	

	public boolean isFeed() {
		return feed;
	}

	public void setFeed(boolean feed) {
		this.feed = feed;
	}

	public int getLuminosity() {
		return luminosity;
	}

	
	
	public ESDimmingES0019_02() {
		super(Vendor.EASTSOFT, Kind.DIMMING, Model.ES_0019_02);
	}

	public void setLuminosity(int luminosity) {
		this.luminosity = luminosity;
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return "开关:"+(feed?"开":"关 ")+"亮度:"+luminosity+"%";
	}

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}

	@Override
	public Feature[] getFeatures() {
		if(features==null){
			features=new Feature[]{new FeatureFeed(0),new FeatureLuminosity(1)};
		}
		return features;
	}
	
	public class FeatureFeed extends Feature{

		public FeatureFeed(int index) {
			super("Switch", true, false, index, 0, 1, 1, 1);
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
			return feed?1:0;
		}

		@Override
		public void setValue(int value) {
			feed=value>0?true:false;
		}

		@Override
		public String getText() {
			return feed?"开启":"关闭";
		}
		
	}
	
	public class FeatureLuminosity extends Feature{

		public FeatureLuminosity(int index) {
			super("Luminosity", true, false, index, 0, 100, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "光度";
		}

		@Override
		public int getValue() {
			return luminosity;
		}

		@Override
		public void setValue(int value) {
			luminosity=value;
		}

		@Override
		public String getText() {
			return luminosity+"%";
		}
		
	}
	
	
}