package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 大华摄像头
 * @author HLX Tel:18996470535 
 * @date 2018年7月9日 
 * Copyright:Copyright(c) 2018
 */
public class DHCamera extends Device{

	private static final long serialVersionUID = 1L;

	public DHCamera() {
		super(Vendor.DAHUA, Kind.CAMERA, Model.DH_0001);
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
	public boolean getSwitchStatus() {
		return false;
	}

	@Override
	public Feature[] getFeatures() {
		return features = new Feature[0];
	}

}
