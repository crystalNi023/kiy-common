/**
 * 
 */
package com.kiy.client;

import java.util.Map;

import com.kiy.common.Unit;
import com.kiy.protocol.Messages.Message;

/**
 * 客户端处理接口
 * 
 * @author Simon(ZhangXi TEL:13883833982)
 * @date 2017年1月2日
 */
public interface CtrClientHandler {
	/**
	 * 连接建立
	 * 
	 * @param client 连接成功的客户端
	 */
	public void connected(CtrClient client);

	/**
	 * 发出消息
	 * 
	 * @param client 客户端
	 * @param msg 消息
	 */
	public void sent(CtrClient client, Message msg);

	/**
	 * 收到信息
	 * 
	 * @param client 客户端
	 * @param msg 收到的消息
	 * @param units 收到的消息相对应的实体类集合
	 */
	public void received(CtrClient client, Message msg, Map<Message, Unit> units);

	/**
	 * 连接断开
	 * 
	 * @param client 客户端
	 */
	public void disconnected(CtrClient client);

	/**
	 * 捕获异常
	 * 
	 * @param client 客户端
	 * @param cause 捕获的异常
	 */
	public void excepted(CtrClient client, Throwable cause);

}