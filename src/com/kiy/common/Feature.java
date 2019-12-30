/**
 * 2017年6月8日
 */
package com.kiy.common;

import com.kiy.common.Types.Status;

/**
 * 功能特性
 * 
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public abstract class Feature {

	/**
	 * 特性类型标识
	 */
	public final String TYPE;
	/**
	 * 特性是否是主要特性
	 */
	public final boolean PRIMARY;
	/**
	 * 特性只读/可写标识
	 */
	public final boolean READ_ONLY;
	/**
	 * 特性索引号
	 */
	public final int INDEX;
	/**
	 * 特性步长值
	 */
	public final int STEP;
	/**
	 * 特性最大值
	 */
	public final int MAXIMUM;
	/**
	 * 特性最小值
	 */
	public final int MINIMUM;
	/**
	 * 特性小数省略值
	 */
	public final int OMITTED_VALUE;
	
	public Feature(String type, boolean primary, boolean read_only, int index, int min, int max, int step,int omitted) {
		this.TYPE = type;
		this.PRIMARY = primary;
		this.READ_ONLY = read_only;
		this.INDEX = index;
		this.STEP = step;
		this.MAXIMUM = max;
		this.MINIMUM = min;
		this.OMITTED_VALUE = omitted;
	}

	/**
	 * 获取告警状态
	 */
	public abstract Status getAlarm();

	/**
	 * 获取特性名称
	 */
	public abstract String getName();

	/**
	 * 获取特性值/状态
	 */
	public abstract int getValue();

	/**
	 * 设置特性值/状态
	 */
	public abstract void setValue(int value);

	/**
	 * 获取特性值可读文本(含单位)
	 */
	public abstract String getText();
}