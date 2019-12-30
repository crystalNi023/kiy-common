package com.kiy.common.devices;

import java.util.Date;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 东软载波三相网关
 * @author HLX Tel:18996470535 
 * @date 2018年6月25日 
 * Copyright:Copyright(c) 2018
 */
public class ESGateWayES0002 extends Device{

	private static final long serialVersionUID = 1L;

	private Date datetime;

	public ESGateWayES0002() {
		super(Vendor.EASTSOFT, Kind.GATEWAY,Model.ES_0002);
	}

	@Override
	public Feature[] getFeatures() {
		return features = new Feature[0];
	}

	@Override
	public Status getFeatureStatus() {
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return "";
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date value) {
		datetime = value;
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}
	
}
