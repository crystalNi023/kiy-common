/**
 * 2017年6月9日
 */
package com.kiy.common.devices;

import java.util.Date;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 电力载波数据集中器，陕西凯星电子 型号KS_0001
 * 
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class KSConcentrator extends Device {

	private static final long serialVersionUID = 1L;

	/**
	 * 集中器时间
	 */
	private Date datetime;

	public KSConcentrator() {
		super(Vendor.KAISTAR, Kind.CONCENTRATOR,Model.KS_0001);
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