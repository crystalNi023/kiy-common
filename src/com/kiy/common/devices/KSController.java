package com.kiy.common.devices;

import java.util.Date;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Vendor;

/**
 * 电力载波优化器，陕西凯星电子
 * 型号 KS_0002
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class KSController extends Device {

	private static final long serialVersionUID = 1L;
	// 状态：内部时间
	private Date datetime;

	public KSController() {
		super(Vendor.KAISTAR, Kind.REPEATER,Model.KS_0002);
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

	/**
	 * 获取状态：内部时间
	 */
	public Date getDatetime() {
		return datetime;
	}

	/**
	 * 设置状态：内部时间
	 */
	public void setDatetime(long value) {
		if (datetime == null)
			datetime = new Date(value);
		datetime.setTime(value);
	}

	@Override
	public boolean getSwitchStatus() {
		return false;
	}
}