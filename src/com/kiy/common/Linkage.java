package com.kiy.common;

import java.util.ArrayList;
import java.util.List;


/**
 * 联动
 * @date 2018年9月21日
 */
public class Linkage extends Unit{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 是否启用
	 */
	private boolean enable;
	
	/**
	 * 联动设备
	 */
	private List<LinkageDevice> linkageDevice;
	
	public Linkage() {
		linkageDevice = new ArrayList<>();
	}

	/**
	 * 判断联动是否启用（true为启用/false为停用）
	 * @return
	 */
	public boolean isEnable() {
		return enable;
	}

	/**
	 * 设置联动是否启用（true为启用/false为停用）
	 * @param enable
	 */
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	/**
	 * 获取联动设备
	 * @return 
	 */
	public List<LinkageDevice> getLinkageDevice() {
		return linkageDevice;
	}

	/**
	 * 设置联动设备
	 * @param linkageDevice
	 */
	public void setLinkageDevice(List<LinkageDevice> linkageDevice) {
		this.linkageDevice = linkageDevice;
	}
	
	/**
	 * 增加联动相关的设备
	 * @param linkageDevice
	 * @return true/false
	 */
	public boolean addLinkageDevice(LinkageDevice d){
		return linkageDevice.add(d);
	}
	
	/**
	 * 清空联动中LinkageDevice集合
	 */
	public void removeAllLinkageDevice() {
		linkageDevice.clear();
	}

}
