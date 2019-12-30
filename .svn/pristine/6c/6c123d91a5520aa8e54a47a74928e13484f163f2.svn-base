/**
 * 2017年1月12日
 */
package com.kiy.common;

import java.util.HashSet;
import java.util.Set;

/**
 * 角色
 * 
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class Role extends Unit {

	private static final long serialVersionUID = 1L;

	// 权限列表
	private HashSet<Integer> commands;

	/**
	 * 获取隶属的用户
	 * 
	 * @return Set<User> 包含隶属的所有用户，如果没有任何用户则返回空集合
	 */
	public Set<User> getUsers() {
		if (servo == null)
			throw new ContextException();

		HashSet<User> set = new HashSet<>();
		for (User u : servo.users.values()) {
			if (u.role_id != null && u.role_id.contains(id))
				set.add(u);
		}
		return set;
	}

	/**
	 * 获取所有指令集合
	 * 
	 * @return 指令集合，更改此集合会影响权限中的指令集合
	 */
	public Set<Integer> getCommands() {
		if (commands == null)
			commands = new HashSet<>();

		return commands;
	}

	/**
	 * 赋予指令到角色
	 * 
	 * @param c 具体指令
	 */
	public void addCommand(Integer c) {
		if (c == null)
			throw new NullPointerException();

		if (commands == null)
			commands = new HashSet<>();

		commands.add(c);
	}

	/**
	 * 测试角色是否已有指定的指令
	 * 
	 * @param c 具体指令
	 * @return true/false
	 */
	public boolean hasCommand(Integer c) {
		if (commands == null)
			return false;

		return commands.contains(c);
	}

	/**
	 * 移除指令从角色
	 * 
	 * @param c 具体指令
	 */
	public void offCommand(Integer c) {
		if (commands == null)
			return;

		commands.remove(c);
	}

	/**
	 * 移除已赋予角色的所有指令
	 */
	public void offAllCommands() {
		if (commands == null)
			return;

		commands.clear();
	}
}