package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 豪力士智能锁 (TCP/IP)
 *
 * @author Crystal Ni
 * @date 2019年5月27日
 *
 */
public class TcpSmartLockT0001 extends Device{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 开关锁状态
	 */
	private boolean feed;
	
	public boolean isFeed() {
		return feed;
	}

	public void setFeed(boolean feed) {
		this.feed = feed;
	}

	public TcpSmartLockT0001() {
		super(Vendor.TCPIP, Kind.SMART_LOCK, Model.T_0001);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return "开锁";
	}

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFeed(0)};
		return features;
	}

	public class FeatureFeed extends Feature {

		public FeatureFeed(int index) {
			super("Feed", true, false, index, 1, 1, 0, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return feed ? "开锁" : "关锁";
		}

		@Override
		public int getValue() {
			return feed ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			feed = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return feed ? "开锁" :"关锁";
		}
		
	}
}
