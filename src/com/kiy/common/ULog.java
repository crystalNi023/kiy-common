/**
 * 2017年3月13日
 */
package com.kiy.common;

/**
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class ULog extends Unit {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户唯一标识
	 */
	private String user_id;
	/**
	 * 指令
	 */
	private int command;
	/**
	 * 执行后状态
	 */
	private int result;
	/**
	 * 参数
	 */
	private String parameter;
	/**
	 * 耗时
	 */
	private int time;

	/**
	 * 获取用户ID
	 * 
	 * @return String/null
	 */
	public String getUserId() {
		return user_id;
	}

	/**
	 * 设置用户ID
	 * 
	 * @param String/null
	 */
	public void setUserId(String value) {
		user_id = value;
	}

	/**
	 * 获取消息指令
	 * 
	 * @return Command
	 */
	public Integer getCommand() {
		return command;
	}

	/**
	 * 设置消息指令
	 * 
	 * @param Command 消息指令
	 */
	public void setCommand(Integer value) {
		command = value;
	}

	/**
	 * 获取指令处理状态
	 * 
	 * @return Status
	 */
	public int getStatus() {
		return result;
	}

	/**
	 * 设置指令处理状态
	 * 
	 * @param Result 指令处理状态
	 */
	public void setStatus(int value) {
		result = value;
	}

	/**
	 * 获取参数(JSON字符串表示)
	 * 
	 * @return String/null
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * 设置参数(JSON字符串表示)
	 * 
	 * @param String/null 参数(JSON字符串表示)
	 */
	public void setParameter(String value) {
		parameter = value;
	}

	/**
	 * 获取指令执行耗时(毫秒)
	 * 
	 * @return the time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * 设置指令执行耗时(毫秒)
	 * 
	 * @param value the time to set
	 */
	public void setTime(int value) {
		time = value;
	}
}