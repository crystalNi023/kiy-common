/**
 * 2017年1月13日
 */
package com.kiy.common;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.kiy.common.Types.Day;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Month;
import com.kiy.common.Types.Week;

/**
 * 计划任务/策略
 * 
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class Task extends Unit {

	private static final long serialVersionUID = 1L;
	/**
	 * 一天的秒数
	 */
	public static final int DAY_SECOND = 86400 /* (60 * 60 * 24) */;

	// 开始时间
	private Date start;
	// 结束时间
	private Date stop;
	// 月聚合值
	private int month;
	// 周聚合值
	private int week;
	// 天聚合值
	private int day;
	// 间隔天（天）
	private int interval;
	// 重复间隔（秒）
	private int repeat;
	// 读取值的设备型号
	private Model read_model;
	// 被控制的设备型号
	private Model write_model;
	// 接收消息的角色
	private String role_id;
	// 检测的设备feature下标
	private int readFeature;
	// 控制的设备feature下标
	private int writeFeature;
	// 阈值上限（大于则触发）
	private int limit_upper;
	// 阈值下限（小于则触发）
	private int limit_lower;
	// 默认动作
	private int feed;
	// 控制（上限时）
	private int feed_upper;
	// 控制（下限时）
	private int feed_lower;
	// 是否禁用
	private boolean enable;
	// 检测的设备
	private Set<String> readDevices;
	// 控制的设备
	private Set<String> writeDevices;
	// 通知操作指令
	private int operationStatus;
	// 上一次推送时间
	private long lastPush;
	// 第一次检测到报警的时间 检测到正常时改为0
	private long fristPush;
	/**
	 * 检测时为正常状态
	 */
	public static final int NORMAL = 0;
	/**
	 * 检测时为触发阈值上限
	 */
	public static final int ALARM_UPPER = 1;
	/**
	 * 检测时为触发阈值下限
	 */
	public static final int ALARM_LOWER = 2;

	/**
	 * 保存了上一次状态的设备集合
	 */
	public Map<String, Device> deviceCache;

	/**
	 * 获取任务开始时间
	 * 
	 * @return the date of start
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * 设置任务开始时间
	 * 
	 * @param value the start date to set
	 */
	public void setStart(Date value) {
		start = value;
	}

	/**
	 * 获取任务结束时间
	 * 
	 * @return the stop date
	 */
	public Date getStop() {
		return stop;
	}

	/**
	 * 设置任务结束时间
	 * 
	 * @param value the stop date to set
	 */
	public void setStop(Date value) {
		stop = value;
	}

	/**
	 * 获取月聚合值
	 * 
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * 设置月聚合值
	 * 
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * 聚合月
	 * 
	 * @param m the month to marge
	 */
	public void margeMonth(Month m) {
		month = Types.marge(month, m);
	}

	/**
	 * 分离月
	 * 
	 * @param m the month to separate
	 */
	public void separateMonth(Month m) {
		month = Types.separate(month, m);
	}

	/**
	 * 是否包含月
	 * 
	 * @param m the month to contains
	 * @return true/false
	 */
	public boolean containsMonth(Month m) {
		return Types.contains(month, m);
	}

	/**
	 * 获取周聚合值
	 * 
	 * @return the week
	 */
	public int getWeek() {
		return week;
	}

	/**
	 * 设置周聚合值
	 * 
	 * @param the week to set
	 */
	public void setWeek(int week) {
		this.week = week;
	}

	/**
	 * 聚合周
	 * 
	 * @param w the week to marger
	 */
	public void margeWeek(Week w) {
		week = Types.marge(week, w);
	}

	/**
	 * 分离周
	 * 
	 * @param w the week to separateWeek
	 */
	public void separateWeek(Week w) {
		week = Types.separate(week, w);
	}

	/**
	 * 是否包含周
	 * 
	 * @param w the week to contains
	 * @return true/false
	 */
	public boolean containsWeek(Week w) {
		return Types.contains(week, w);
	}

	/**
	 * 获取天聚合值
	 * 
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * 设置天聚合值
	 * 
	 * @param the day to set
	 */
	public void setDay(int value) {
		day = value;
	}

	/**
	 * 聚合天
	 * 
	 * @param m the day tomarge
	 */
	public void margeDay(Day d) {
		day = Types.marge(day, d);
	}

	/**
	 * 分离天
	 * 
	 * @param m the day to separate
	 */
	public void separateDay(Day d) {
		day = Types.separate(day, d);
	}

	/**
	 * 是否包含天
	 * 
	 * @param d the day to contains
	 * @return true/false
	 */
	public boolean containsDay(Day d) {
		return Types.contains(day, d);
	}

	/**
	 * 获取任务触发间隔时间（天）;如果是每天/每周执行则间隔为0天
	 * 
	 * @return 间隔天数
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * 设置任务触发间隔时间（天）;如果是每天/每周执行则间隔为0天
	 * 
	 * @param 设置天数
	 */
	public void setInterval(int value) {
		interval = value;
	}

	/**
	 * 获取任务在一天内重复执行间隔（秒）;最大不能超过12小时
	 * 
	 * @return 重复间隔（秒）
	 */
	public int getRepeat() {
		return repeat;
	}

	/**
	 * 设置任务在一天内重复执行间隔（秒）
	 * 
	 * @param value 重复间隔（秒）
	 */
	public void setRepeat(int value) {
		repeat = value;
	}

	/**
	 * 获取接收消息的角色ID
	 * 
	 * @return 接收消息的角色ID
	 */
	public String getRoleId() {
		return role_id;
	}

	/**
	 * 获取接收消息的角色
	 * 
	 * @return 接收消息的角色
	 */
	public Role getRole() {
		if (servo == null)
			throw new ContextException();

		return servo.getRole(role_id);
	}

	/**
	 * 设置接收消息的角色ID（隶属此角色的所有用户都将收到提示消息）
	 * 
	 * @param value 接收消息的角色ID
	 */
	public void setRoleId(String value) {
		role_id = value;
	}

	/**
	 * 获取监测设备型号
	 * 
	 * @return Model
	 */
	public Model getReadModel() {
		return read_model;
	}

	/**
	 * 设置监测设备型号
	 * 
	 * @param Model
	 */
	public void setReadModel(Model value) {
		read_model = value;
	}

	/**
	 * 获取控制设备型号
	 * 
	 * @return Model
	 */
	public Model getWriteModel() {
		return write_model;
	}

	/**
	 * 设置控制设备型号
	 * 
	 * @param Model
	 */
	public void setWriteModel(Model value) {
		write_model = value;
	}

	/**
	 * 获取阈值上限
	 * 
	 * @return 阈值上限
	 */
	public int getLimitUpper() {
		return limit_upper;
	}

	/**
	 * 设置阈值上限
	 * 
	 * @param value 阈值上限
	 */
	public void setLimitUpper(int value) {
		limit_upper = value;
	}

	/**
	 * 获取阈值下限
	 * 
	 * @return int
	 */
	public int getLimitLower() {
		return limit_lower;
	}

	/**
	 * 设置阈值下限
	 * 
	 * @param value 阈值下限
	 */
	public void setLimitLower(int value) {
		limit_lower = value;
	}

	/**
	 * 获取检测设备feature下标
	 * 
	 * @return 检测设备feature下标
	 */
	public int getReadFeature() {
		return readFeature;
	}

	/**
	 * 设置检测设备feature下标
	 * 
	 * @param readFeature 检测设备feature下标
	 */
	public void setReadFeature(int readFeature) {
		this.readFeature = readFeature;
	}

	/**
	 * 获取控制设备feature下标
	 * 
	 * @return 控制设备feature下标
	 */
	public int getWriteFeature() {
		return writeFeature;
	}

	/**
	 * 设置控制设备feature下标
	 * 
	 * @param writeFeature 控制设备feature下标
	 */
	public void setWriteFeature(int writeFeature) {
		this.writeFeature = writeFeature;
	}

	/**
	 * 获取默认动作
	 * 
	 * @return 默认动作
	 */
	public int getFeed() {
		return feed;
	}

	/**
	 * 设置默认动作
	 * 
	 * @param 默认动作
	 */
	public void setFeed(int feed) {
		this.feed = feed;
	}

	/**
	 * 获取设备上限动作
	 * 
	 * @return 设备上限动作
	 */
	public int getFeedUpper() {
		return feed_upper;
	}

	/**
	 * 设置设备上限动作
	 * 
	 * @param feedUpper 设备上限动作
	 */
	public void setFeedUpper(int feedUpper) {
		this.feed_upper = feedUpper;
	}

	/**
	 * 获取设备下限动作
	 * 
	 * @return 设备下限动作
	 */
	public int getFeedLower() {
		return feed_lower;
	}

	/**
	 * 设置设备下限动作
	 * 
	 * @param feed_lower 设备下限动作
	 */
	public void setFeedLower(int feedLower) {
		this.feed_lower = feedLower;
	}

	/**
	 * 获取计划策略是否被禁用
	 * 
	 * @return 是否禁用
	 */
	public boolean getEnable() {
		return enable;
	}

	/**
	 * 设置计划策略是否为禁用 （true禁用）
	 * 
	 * @param enable 是否为禁用 （true禁用）
	 */
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	/**
	 * 获取检测的设备ID
	 * 
	 * @return 检测的设备ID集合
	 */
	public Set<String> getReadDeviceIds() {
		return readDevices;
	}

	/**
	 * 设置控制的设备ID
	 * 
	 * @return 控制的设备ID集合
	 */
	public Set<String> getWriteDeviceIds() {
		return writeDevices;
	}

	/**
	 * 获取到检测的设备
	 * 
	 * @return 检测的设备集合
	 */
	public Set<Device> getReadDevices() {
		if (servo == null)
			throw new ContextException();

		Set<Device> set = new HashSet<>();
		if (readDevices == null || readDevices.isEmpty()) {
			return null;
		}

		for (String deviceId : readDevices) {
			Device device = servo.getDevice(deviceId);
			if (device != null) {
				set.add(device);
			}
		}

		return set;
	}

	/**
	 * 获取控制的设备
	 * 
	 * @return 控制的设备集合
	 */
	public Set<Device> getWriteDevices() {
		if (servo == null)
			throw new ContextException();

		if (writeDevices == null || writeDevices.isEmpty()) {
			return null;
		}

		Set<Device> set = new HashSet<>();
		for (String deviceId : writeDevices) {
			Device device = servo.getDevice(deviceId);
			if (device != null) {
				set.add(device);
			}
		}

		return set;
	}

	/**
	 * 添加检测的设备
	 * 
	 * @param d 检测的设备
	 */
	public void addReadDevice(Device d) {
		if (d.getModel() != read_model) {
			throw new IllegalArgumentException();
		}

		if (readDevices == null)
			readDevices = new HashSet<>();

		readDevices.add(d.getId());
	}

	/**
	 * 添加检测的设备
	 * 
	 * @param deviceId 检测的设备ID
	 */
	public void addReadDeviceById(String deviceId) {
		if (deviceId == null)
			throw new IllegalArgumentException();

		if (readDevices == null)
			readDevices = new HashSet<>();

		readDevices.add(deviceId);

	}

	/**
	 * 添加检测的设备
	 * 
	 * @param deviceId 检测的设备ID
	 */
	public void addWriteDeviceById(String deviceId) {
		if (deviceId == null)
			throw new IllegalArgumentException();

		if (writeDevices == null)
			writeDevices = new HashSet<>();

		writeDevices.add(deviceId);
	}

	/**
	 * 移除检测的设备
	 * 
	 * @param d 检测的设备
	 */
	public void removeReadDevice(Device d) {
		if (readDevices == null)
			readDevices = new HashSet<>();

		readDevices.remove(d.getId());
	}

	/**
	 * 添加控制的设备
	 * @param d 控制的设备
	 */
	public void addWriteDevice(Device d) {
		if (d.getModel() != write_model) {
			throw new IllegalArgumentException();
		}

		if (writeDevices == null)
			writeDevices = new HashSet<>();

		writeDevices.add(d.getId());
	}

	/**
	 * 移除检测的设备
	 * @param d 检测的设备
	 */
	public void removeWriteDevice(Device d) {
		if (writeDevices == null)
			writeDevices = new HashSet<>();

		writeDevices.remove(d.getId());
	}

	/**
	 * 移除所有的检测设备
	 */
	public void removeAllReadDevices() {
		if (readDevices != null)
			readDevices.clear();
	}

	/**
	 * 移除所有的检测设备
	 */
	public void removeAllWriteDevices() {
		if (writeDevices != null)
			writeDevices.clear();
	}

	/**
	 * 获取操作指令状态 0-正常 1-阈值上限报警 2-阈值下限报警
	 * @return 操作指令状态
	 */
	public int getOperationStatus() {
		return operationStatus;
	}

	/**
	 * 设置操作指令状态 0-正常 1-阈值上限报警 2-阈值下限报警
	 * @param operationStatus 操作指令状态
	 */
	public void setOperationStatus(int operationStatus) {
		this.operationStatus = operationStatus;
	}

	/**
	 * 获取最近一次发送通知时间
	 * @return 最近一次发送通知时间
	 */
	public long getLastPush() {
		return lastPush;
	}

	/**
	 * 设置最近一次推送时间
	 * @param lastPush 最近一次推送时间
	 */
	public void setLastPush(long lastPush) {
		this.lastPush = lastPush;
	}
	/**
	 * 获取最近一次发送短信的时间
	 */
	public long getFristPush() {
		return fristPush;
	}

	/**
	 * 设置最近一次发送短信的时间
	 */
	public void setFristPush(long fristPush) {
		this.fristPush = fristPush;
	}

	/**
	 * 获取保存上一次读取设备状态的缓存集合
	 * @return 上一次读取设备状态的缓存集合
	 */
	public Map<String, Device> getDeviceCache() {
		return deviceCache;
	}

	/**
	 * 设置保存上一次读取设备状态的缓存集合
	 * @param devices 上一次读取设备状态的缓存集合
	 */
	public void setDeviceCache(Set<Device> devices) {
		if (devices == null) {
			return;
		}

		deviceCache = new HashMap<>();

		for (Device device : devices) {
			Device d = Device.instance(device.getVendor(), device.getKind(), device.getModel());
			d.setId(device.getId());
			deviceCache.put(device.getId(), d);
		}
	}

	/**
	 * 判断设备状态缓存集合是否为空
	 * @return true/false
	 */
	public boolean isEmptyForDeviceCache() {
		return deviceCache == null;
	}

	/**
	 * 更新设备缓存
	 * @param device 设备
	 */
	public void updateDeviceCache(Device device) {
		if (device == null) {
			return;
		}
		Device d = Device.instance(device.getVendor(), device.getKind(), device.getModel());
		d.setStatus(device.getStatus());
		for (int i = 0; i < device.getFeatureCount(); i++) {
			d.getFeature(i).setValue(device.getFeature(i).getValue());
		}

		deviceCache.put(device.getId(), d);
	}
 
	/**
	 * 判断设备状态是否有更新
	 * @param device 设备
	 * @return true/false true：改变   false：没变
	 */
	public boolean isUpdateDeviceStatus(Device device) {
		if (device == null) {
			return false;
		}

		Device d = deviceCache.get(device.getId());

		if (d == null) {
			return true;
		}

		if (d.getStatus() == device.getStatus()) {
			for (int i = 0; i < device.getFeatureCount(); i++) {
				if (d.getFeature(i).getValue() == device.getFeature(i).getValue()) {
					continue;
				} else {
					return true;
				}
			}
		} else {
			// 设备状态改变
			return true;
		}

		return false;
	}

}