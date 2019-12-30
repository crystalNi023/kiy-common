/**
 * 2017年6月12日
 */
package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class Other extends Device {

	private static final long serialVersionUID = 1L;

	public Other() {
		super(Vendor.OTHER, Kind.OTHER,Model.NONE);
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return "";
	}

	@Override
	public Feature[] getFeatures() {
		return features = new Feature[0];
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}
}
