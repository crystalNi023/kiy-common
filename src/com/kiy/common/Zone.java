package com.kiy.common;

import java.util.HashSet;
import java.util.Set;

/**
 * 基于用户视图的逻辑区域/组
 * 
 * @author Simon(ZhangXi TEL:13883833982)
 * @date 2016年12月23日
 */
public final class Zone extends Unit {

	private static final long serialVersionUID = 1L;

	/**
	 * 父区域ID
	 */
	private String parent_id;

	/**
	 * 获取父区域ID
	 */
	public String getParentId() {
		return parent_id;
	}

	/**
	 * 获取父区域对象
	 * 
	 * @return 如果不存在或未设置则为null
	 */
	public Zone getParent() {
		if (servo == null)
			throw new ContextException();

		return servo.getZone(parent_id);
	}

	/**
	 * 设置父区域ID
	 * 
	 * @param value 父区域id
	 */
	public void setParentId(String value) {
		parent_id = value;
	}

	/**
	 * 获取子区域（不包括子区域的子区域）
	 * 
	 * @return 包含子区域的集合,如果没有子区域则为空集合
	 */
	public Set<Zone> getZones() {
		if (servo == null)
			throw new ContextException();

		Set<Zone> set = new HashSet<Zone>();
		for (Zone z : servo.zones.values()) {
			if (id.equals(z.parent_id))
				set.add(z);
		}
		return set;
	}

	/**
	 * 获取区域中的设备(不包括子区域中的设备)
	 * 
	 * @return 包含子设备的集合,如果没有子设备则为空集合
	 */
	public Set<Device> getDevices() {
		if (servo == null)
			throw new ContextException();

		Set<Device> set = new HashSet<Device>();
		
		for (Device d : servo.devices.values()) {
			if (id.equals(d.zone_id))
				set.add(d);
		}
		if (this.getName().equals("东软测试")) {
			for (Device device : set) {
				System.err.println(device.getName());
			}
		}
		return set;
	}
}