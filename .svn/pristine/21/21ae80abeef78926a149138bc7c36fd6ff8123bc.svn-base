package com.kiy.common;

/**
 * 通知 
 */
public class Notice extends Unit {

	private static final long serialVersionUID = 1L;

	// 触发源(设备)
	private String device_id;
	// 用户
	private String user_id;
	// 通知内容
	private String content;

	/**
	 * 获取设备ID
	 * @return 设备ID
	 */
	public String getDeviceId() {
		return device_id;
	}

	/**
	 * 设置设备ID
	 * @param value 设备ID
	 */
	public void setDeviceId(String value) {
		device_id = value;
	}

	/**
	 * 获取用户ID
	 * @return 用户ID
	 */
	public String getUserId() {
		return user_id;
	}

	/**
	 * 设置用户ID
	 * @param value 用户ID
	 */
	public void setUserId(String value) {
		user_id = value;
	}

	/**
	 * 获取通知内容
	 * @return 通知内容
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 设置通知内容
	 * @param value 通知内容
	 */
	public void setContent(String value) {
		content = value;
	}
 
	/**
	 * 获取通知关联用户
	 * @return 通知关联用户
	 */
	public User getUser() {
		if (servo == null) {
			throw new NullPointerException();
		}

		if (user_id != null) {
			return servo.getUser(user_id);
		} else {
			return null;
		}
	}

	/**
	 * 获取通知关联设备
	 * @return 通知关联设备
	 */
	public Device getDevice() {
		if (servo == null) {
			throw new NullPointerException();
		}

		if (device_id != null) {
			return servo.getDevice(device_id);
		} else {
			return null;
		}
	}
}