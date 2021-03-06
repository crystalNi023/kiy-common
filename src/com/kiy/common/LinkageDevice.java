package com.kiy.common;

import java.io.Serializable;
import java.util.Date;
/**
 * 联动设备
 * @date 2018年9月21日
 */
public class LinkageDevice implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 标识id
	 */
	private String id;
	
	/**
	 * 联动id
	 */
	private String linkageId;
	
	/**
	 * 设备id
	 */
	private String deviceId;
	
	/**
	 * 优先级
	 */
	private int priority;
	
	/**
	 * feature_index
	 */
	private int featureIndex;

	/**
	 * feature_value
	 */
	private int featureValue;

	/**
	 * 创建时间
	 */
	private Date created;
	
	/**
	 * 最后更新时间
	 */
	private Date updated;
	/**
	 * 延迟执行时间（单位：秒）
	 */
	private int secs;
	/**
	 * 获取id
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取联动id
	 * @return
	 */
	public String getLinkageId() {
		return linkageId;
	}

	/**
	 * 设置联动id
	 * @return
	 */
	public void setLinkageId(String linkageId) {
		this.linkageId = linkageId;
	}

	/**
	 * 获取设备id()
	 * @return
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * 设置设备id
	 * @param deviceId
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * 获取优先级
	 * @return
	 */
	public int getPriority() {
		return priority;
	}
	
	/**
	 * 设置优先级
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * 获取feature下标
	 * @return
	 */
	public int getFeatureIndex() {
		return featureIndex;
	}

	/**
	 * 设置feature下标
	 * @param featureIndex
	 */
	public void setFeatureIndex(int featureIndex) {
		this.featureIndex = featureIndex;
	}

	/**
	 * 获取feature值
	 * @return
	 */
	public int getFeatureValue() {
		return featureValue;
	}

	/**
	 * 设置feature值
	 * @param featureValue
	 */
	public void setFeatureValue(int featureValue) {
		this.featureValue = featureValue;
	}

	/**
	 * 获取创建时间
	 * @return
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * 设置创建时间
	 * @param created
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * 获取更新时间
	 * @return
	 */
	public Date getUpdated() {
		return updated;
	}

	/**
	 * 设置更新时间
	 * @param updated
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	/**
	 * 获取延迟时间
	 * @return
	 */
	public int getSecs() {
		return secs;
	}
	/**
	 * 设置延迟时间
	 */
	public void setSecs(int secs) {
		this.secs = secs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((deviceId == null) ? 0 : deviceId.hashCode());
		result = prime * result + featureIndex;
		result = prime * result + featureValue;
		result = prime * result
				+ ((linkageId == null) ? 0 : linkageId.hashCode());
		result = prime * result + priority;
		result = prime * result + secs;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkageDevice other = (LinkageDevice) obj;
		if (deviceId == null) {
			if (other.deviceId != null)
				return false;
		} else if (!deviceId.equals(other.deviceId))
			return false;
		if (featureIndex != other.featureIndex)
			return false;
		if (featureValue != other.featureValue)
			return false;
		if (linkageId == null) {
			if (other.linkageId != null)
				return false;
		} else if (!linkageId.equals(other.linkageId))
			return false;
		if (priority != other.priority)
			return false;
		if (secs != other.secs)
			return false;
		return true;
	}
	
}
