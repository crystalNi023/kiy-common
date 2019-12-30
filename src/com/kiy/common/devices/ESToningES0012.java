package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 调色控制模块(东软载波)
 * @author HLX Tel:18996470535 
 * @date 2018年6月26日 
 * Copyright:Copyright(c) 2018
 */
public class ESToningES0012 extends Device{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 开关
	 */
	private boolean feed;

	/**
	 * 光度
	 */
	private int luminosity;
	
	/**
	 * 色度
	 */
	private int color;
	
	

	public boolean isFeed() {
		return feed;
	}

	public void setFeed(boolean feed) {
		this.feed = feed;
	}

	public int getLuminosity() {
		return luminosity;
	}

	

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public ESToningES0012() {
		super(Vendor.EASTSOFT, Kind.TONING, Model.ES_0012);
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
		return "开关:"+(feed?"开":"关 ")+" 亮度:"+luminosity+"%"+" 颜色:"+color;
	}

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}

	@Override
	public Feature[] getFeatures() {
		if(features==null){
			features=new Feature[]{new FeatureFeed(0),new FeatureLuminosity(1),new FeatureColor(2)};
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
			super("LUMINOSITY", true, false, index, 0, 100, 1, 1);
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
	
	public class FeatureColor extends Feature{

		public FeatureColor(int index) {
			super("COLOR", true, false, index, 0, 1000000000, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "色度";
		}

		@Override
		public int getValue() {
			return color;
		}

		@Override
		public void setValue(int value) {
			color=value;
		}

		@Override
		public String getText() {
			return color+"";
		}
		
	}
}