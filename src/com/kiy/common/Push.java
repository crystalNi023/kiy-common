package com.kiy.common;

import java.io.Serializable;

/**
 * 消息推送
 * @author Administrator
 *
 */
public class Push extends Unit implements Serializable{

	private static final long serialVersionUID = -6074611216509349856L;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 设备token
	 */
	private String deviceTokens="default null";
	/**
	 * 设备类型 1：android 2：ios
	 */
	private int deviceType;
	
	/**
	 * 获取标识id
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置标识id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取用户id
	 * @return 用户id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置用户id
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取设备token
	 * @return
	 */
	public String getDeviceTokens() {
		return deviceTokens;
	}
	/**
	 * 设置设备token
	 * @param deviceTokens
	 */
	public void setDeviceTokens(String deviceTokens) {
		this.deviceTokens = deviceTokens;
	}
	/**
	 * 获取设备类型
	 * @return
	 */
	public int getDeviceType() {
		return deviceType;
	}
	/**
	 * 设置设备类型
	 * @param deviceType
	 */
	public void setDeviceType(int deviceType) {
		this.deviceType = deviceType;
	}
	
}
