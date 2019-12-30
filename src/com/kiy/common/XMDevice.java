package com.kiy.common;


/**
 * 雄迈设备实体
 * @author Administrator
 *
 */
public class XMDevice extends Unit{

	private static final long serialVersionUID = 1105094943109198655L;
	/**
	 * 关联用户编号
	 */
	private String userId;
	/**
	 * 设备序列号
	 */
	private String deviceMac;
	/**
	 * 设备名称
	 */
	private String deviceName;
	/**
	 * 登录名称
	 */
	private String loginName;
	/**
	 * 登陆密码
	 */
	private String loginPsw;
	/**
	 * 设备ip
	 */
	private String deviceIp;
	/**
	 * 设备在线状态
	 */
	private int state;
	/**
	 * 设备端口号
	 */
	private int nPort;
	/**
	 * 设备类型
	 */
	private int nType;
	/**
	 * 扩展
	 */
	private int nId;
	/**
	 * 获取关联用户编号
	 * @return
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置关联用户编号
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取设备序列号
	 * @return
	 */
	public String getDeviceMac() {
		return deviceMac;
	}
	/**
	 * 设置设备序列号
	 * @param deviceMac
	 */
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}
	/**
	 * 获取设备名称
	 * @return
	 */
	public String getDeviceName() {
		return deviceName;
	}
	/**
	 * 设置设备名称
	 * @param deviceName
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	/**
	 * 获取登陆名称
	 * @return
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * 设置登陆名称
	 * @param loginName
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * 获取登陆密码
	 * @return
	 */
	public String getLoginPsw() {
		return loginPsw;
	}
	/**
	 * 设置登陆密码
	 * @param loginPsw
	 */
	public void setLoginPsw(String loginPsw) {
		this.loginPsw = loginPsw;
	}
	/**
	 * 获取设备ip
	 * @return
	 */
	public String getDeviceIp() {
		return deviceIp;
	}
	/**
	 * 设置设备ip
	 * @param deviceIp
	 */
	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}
	/**
	 * 获取设备在线状态
	 * @return
	 */
	public int getState() {
		return state;
	}
	/**
	 * 设置设备在线状态
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * 获取端口号
	 * @return
	 */
	public int getNPort() {
		return nPort;
	}
	/**
	 * 设置端口号
	 * @param nPort
	 */
	public void setNPort(int nPort) {
		this.nPort = nPort;
	}
	/**
	 * 获取设备类型
	 * @return
	 */
	public int getNType() {
		return nType;
	}
	/**
	 * 设置设备类型
	 * @param nType
	 */
	public void setNType(int nType) {
		this.nType = nType;
	}
	/**
	 * 获取扩展
	 * @return
	 */
	public int getNId() {
		return nId;
	}
	/**
	 * 设置扩展
	 * @param nID
	 */
	public void setNId(int nId) {
		this.nId = nId;
	}
}
