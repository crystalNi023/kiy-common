/**
 * 2017年7月31日
 */
package com.kiy.common;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 实体对象集合，提供可复用的临时集合
 * 
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class UList {

	private static BlockingQueue<UList> queue = new ArrayBlockingQueue<>(64);

	private int index = -1;
	private List<Unit> units;

	private UList() {
		units = new ArrayList<Unit>();
	}

	public UList getInstance() {
		if (queue.isEmpty())
			return new UList();
		return queue.poll();
	}

	public void release() {
		clear();
		queue.offer(this);
	}

	public Boolean hasUnit() {
		return units != null || units.size() > 0;
	}

	public void addUnit(Unit u) {
		if (units.add(u))
			index++;
	}

	public void setUnit(Unit u) {
		units.set(index, u);
	}

	public Unit getUnit() {
		return units.get(index);
	}

	public User getUser() {
		Unit unit = units.get(index);
		if (unit instanceof User)
			return (User) unit;
		return null;
	}

	public Role getRole() {
		Unit unit = units.get(index);
		if (unit instanceof Role)
			return (Role) unit;
		return null;
	}

	public Device getDevice() {
		Unit unit = units.get(index);
		if (unit instanceof Device)
			return (Device) unit;
		return null;
	}

	public Zone getZone() {
		Unit unit = units.get(index);
		if (unit instanceof Zone)
			return (Zone) unit;
		return null;
	}

	public Task getTask() {
		Unit unit = units.get(index);
		if (unit instanceof Task)
			return (Task) unit;
		return null;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public int getCount() {
		return units.size();
	}

	public boolean next() {
		if (index < units.size())
			index++;
		return index > -1 && index < units.size();
	}

	public void reset() {
		index = -1;
	}

	public void clear() {
		units.clear();
		index = -1;
	}
}