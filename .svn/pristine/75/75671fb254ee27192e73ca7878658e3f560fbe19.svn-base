package com.kiy.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 场景
 * 
 * @author HLX Tel:18996470535
 * @date 2018年4月13日 Copyright:Copyright(c) 2018
 */
public class Scene extends Unit {

	private static final long serialVersionUID = 1L;

	/**
	 * 场景控制属性 true为开,false为关
	 */
	private boolean switchStatu;

	/**
	 * 保存场景开启时执行的设备
	 */
	private List<SceneDevice> openDevice;
	
	/**
	 * 场景图片id
	 */
	private int image;

	/**
	 * 保存场景关闭时执行的设备
	 */
	private List<SceneDevice> offDevices;

	public Scene() {
		openDevice = new ArrayList<>();
		offDevices = new ArrayList<>();
	}

	/**
	 * 获取场景开关状态
	 * 
	 * @return true为开/false为关
	 */
	public boolean getSwitchStatu() {
		return switchStatu;
	}

	/**
	 * 设置场景开关状态
	 * 
	 * @param switchStatu true为开/false为关
	 */
	public void setSwitchStatu(boolean switchStatu) {
		this.switchStatu = switchStatu;
	}

	/**
	 * 获取场景开启时执行的SceneDevice集合
	 * 
	 * @return 场景开启时执行的SceneDevice集合
	 */
	public List<SceneDevice> getOpenDevices() {
		return openDevice;
	}

	/**
	 * 设置场景开启时执行的SceneDevice集合
	 * 
	 * @param openDevice 场景开启时执行的SceneDevice集合
	 */
	public void setOpenDevice(List<SceneDevice> openDevice) {
		this.openDevice = openDevice;
	}

	/**
	 * 获取场景关闭时执行的SceneDevice集合
	 * 
	 * @return 场景关闭时执行的SceneDevice集合
	 */
	public List<SceneDevice> getOffDevices() {
		return offDevices;
	}

	/**
	 * 设置场景关闭时执行的SceneDevice集合
	 * 
	 * @param offDevices 场景关闭时执行的SceneDevice集合
	 */
	public void setOffDevices(List<SceneDevice> offDevices) {
		this.offDevices = offDevices;
	}

	/**
	 * 添加场景开启时执行的SceneDevice
	 * 
	 * @param sceneDevice 场景开启时执行的SceneDevice
	 * @return true/false
	 */
	public boolean addOpenSceneDevice(SceneDevice sceneDevice) {
		return openDevice.add(sceneDevice);
	}

	/**
	 * 添加场景关闭时执行的SceneDevice
	 * 
	 * @param sceneDevice 场景关闭时执行的SceneDevice
	 * @return true/false
	 */
	public boolean addOffSceneDevice(SceneDevice sceneDevice) {
		return offDevices.add(sceneDevice);
	}

	/**
	 * 移除场景开启时执行的SceneDevice
	 * 
	 * @param SceneDevice 场景开启时执行的SceneDevice
	 * @return true/false
	 */
	public boolean removeOpenSceneDevice(SceneDevice sceneDevice) {
		return openDevice.remove(sceneDevice);
	}

	/**
	 * 移除场景关闭时执行的SceneDevice
	 * 
	 * @param sceneDevice 场景关闭时执行的SceneDevice
	 * @return true/false
	 */
	public boolean removeOffSceneDevice(SceneDevice sceneDevice) {
		return offDevices.remove(sceneDevice);
	}

	/**
	 * 清空场景开启时执行的SceneDevice集合
	 */
	public void removeAllOpenSceneDevice() {
		openDevice.clear();
	}

	/**
	 * 清空场景关闭时执行的SceneDevice集合
	 */
	public void removeAllOffSceneDevice() {
		offDevices.clear();
	}

	/**
	 * 获取场景图片id
	 * @return 图片id
	 */
	public int getImage() {
		return image;
	}

	/**
	 * 设置场景图片id
	 * @param image 场景图片id
	 */
	public void setImage(int image) {
		this.image = image;
	}

	
}
