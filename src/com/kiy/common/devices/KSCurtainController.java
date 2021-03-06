package com.kiy.common.devices;

import com.kiy.common.Device;
import com.kiy.common.Feature;
import com.kiy.common.Types.Kind;
import com.kiy.common.Types.Model;
import com.kiy.common.Types.Status;
import com.kiy.common.Types.Vendor;

/**
 * 窗帘控制器，陕西凯星电子
 * 型号 KS_0016
 * @author HLX Tel:18996470535 
 * @date 2018年5月29日 
 * Copyright:Copyright(c) 2018
 */
public class KSCurtainController extends Device{

	private static final long serialVersionUID = 1L;
	
	// 状态：窗帘开关
	private boolean feed;
	// 状态：运动暂停
	private boolean stop;
	// 状态:开合度
	private int degree;
	// 状态：ROM
	private boolean rom;
	// 状态：信号
	private boolean signal;
	// 状态：时钟
	private boolean clock;

	public KSCurtainController() {
		super(Vendor.KAISTAR, Kind.CURTAIN_CONTROLLER,Model.KS_0016);
	}

	@Override
	public Status getFeatureStatus() {
		if (!rom || !signal || !clock)
			return Status.FAULT;
		return Status.NONE;
	}

	@Override
	public String getIndicate() {
		return degree+"%";
	}

	@Override
	public Feature[] getFeatures() {
		if (features == null)
			features = new Feature[] { new FeatureFeed(0), new FeatureStop(1),new FeatureDegree(2), new FeatureROM(3), new FeatureSignal(4), new FeatureClock(5) };
		return features;
	}

	/**
	 * 获取开关状态
	 */
	public boolean isFeed() {
		return feed;
	}

	/**
	 * 设置开关状态
	 */
	public void setFeed(boolean feed) {
		this.feed = feed;
	}

	/**
	 * 获取状态：ROM
	 */
	public boolean isRom() {
		return rom;
	}

	/**
	 * 设置状态：ROM
	 */
	public void setRom(boolean value) {
		rom = value;
	}

	/**
	 * 获取状态：信号
	 */
	public boolean isSignal() {
		return signal;
	}

	/**
	 * 设置状态：信号
	 */
	public void setSignal(boolean value) {
		signal = value;
	}

	/**
	 * 获取状态：时钟
	 */
	public boolean isClock() {
		return clock;
	}

	/**
	 * 设置状态：时钟
	 */
	public void setClock(boolean value) {
		clock = value;
	}

	/**
	 * 获取停止状态,true停止
	 */
	public boolean isStop() {
		return stop;
	}

	/**
	 * 设置停止状态，true停止 
	 */
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	/**
	 * 获取开合度
	 */
	public int getDegree() {
		return degree;
	}

	/**
	 * 设置开合度
	 */
	public void setDegree(int degree) {
		this.degree = degree;
	}

	/**
	 * 特性：窗帘开关
	 */
	public class FeatureFeed extends Feature {

		public FeatureFeed(int index) {
			super("SWITCH", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开关";
		}

		@Override
		public int getValue() {
			return feed ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			feed = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return feed ? "开启" : "关闭";
		}
	}
	
	/**
	 * 特性：窗帘开关
	 */
	public class FeatureStop extends Feature {

		public FeatureStop(int index) {
			super("STOP", true, false, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "运行状态";
		}

		@Override
		public int getValue() {
			return stop ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			stop = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return stop ? "暂停" : "运动";
		}
	}
	
	/**
	 * 特性：窗帘开关
	 */
	public class FeatureDegree extends Feature {

		public FeatureDegree(int index) {
			super("DEGREE", true, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			return Status.NONE;
		}

		@Override
		public String getName() {
			return "开合度";
		}

		@Override
		public int getValue() {
			return degree ;
		}

		@Override
		public void setValue(int value) {
			degree = value;
		}

		@Override
		public String getText() {
			return degree +"%";
		}
	}
	
	
	/**
	 * 特性：ROM
	 */
	public class FeatureROM extends Feature {

		public FeatureROM(int index) {
			super("ROM", false, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			if (rom)
				return Status.NONE;
			return Status.FAULT;
		}

		@Override
		public String getName() {
			return "存储";
		}

		@Override
		public int getValue() {
			return rom ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			rom = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return rom ? "OK" : "FAUL";
		}
	}

	/**
	 * 特性：信号
	 */
	public class FeatureSignal extends Feature {

		public FeatureSignal(int index) {
			super("SIGNAL", false, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			if (signal)
				return Status.NONE;
			return Status.FAULT;
		}

		@Override
		public String getName() {
			return "信号";
		}

		@Override
		public int getValue() {
			return signal ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			signal = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return signal ? "OK" : "FAUL";
		}
	}

	/**
	 * 特性：时钟
	 */
	public class FeatureClock extends Feature {

		public FeatureClock(int index) {
			super("CLOCK", false, true, index, 0, 1, 1, 1);
		}

		@Override
		public Status getAlarm() {
			if (clock)
				return Status.NONE;
			return Status.FAULT;
		}

		@Override
		public String getName() {
			return "时钟";
		}

		@Override
		public int getValue() {
			return clock ? 1 : 0;
		}

		@Override
		public void setValue(int value) {
			clock = value > 0 ? true : false;
		}

		@Override
		public String getText() {
			return clock ? "OK" : "FAUL";
		}
	}

	@Override
	public boolean getSwitchStatus() {
		return feed;
	}

}
