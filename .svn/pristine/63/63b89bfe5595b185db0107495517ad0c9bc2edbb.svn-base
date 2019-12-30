package com.kiy.protocol;

import java.util.Date;
import java.util.List;

import com.kiy.common.Tool;
import com.kiy.protocol.Messages.CreateScene;
import com.kiy.protocol.Messages.Message;
import com.kiy.protocol.Units.MScene;
import com.kiy.protocol.Units.MSceneDevice;

/**
 * 
 * @author HLX Tel:18996470535 
 * @date 2018年4月13日 
 * Copyright:Copyright(c) 2018
 */
public class Test {
	public static void main(String[] args) {
		/**
		 * Test Scene MessageCreated
		 */
		Message.Builder msg = Message.newBuilder();
		msg.setUserId("00323293-076b-4406-992c-fe7090ea3f99");
		msg.setKey(1);
		CreateScene.Builder createScene = CreateScene.newBuilder();
		MScene.Builder mScene = createScene.getItemBuilder();
		mScene.setId("00323293-076b-4406-992c-fe7090ea3f99");
		mScene.setName("测试场景");
		mScene.setRemark("备注");
		mScene.setSwitch(false);
		mScene.setCreated(System.currentTimeMillis());
		mScene.setUpdated(System.currentTimeMillis());
		for (int i = 0; i < 5; i++) {
			MSceneDevice.Builder mSBuilder = MSceneDevice.newBuilder();
			mSBuilder.setDeviceId("00323293-076b-4406-992c-fe3210ea3f99");
			mSBuilder.setSwitch(true);
			mSBuilder.setFeatureIndex(i);
			mSBuilder.setFeatureValue(10);
			mScene.addOpenDevices(mSBuilder.build());
		}
		for (int i = 0; i < 5; i++) {
			MSceneDevice.Builder mSBuilder = MSceneDevice.newBuilder();
			mSBuilder.setDeviceId("11323293-076b-4406-992c-fe3210ea3f99");
			mSBuilder.setSwitch(false);
			mSBuilder.setFeatureIndex(i);
			mSBuilder.setFeatureValue(10);
			mScene.addOffDevices(mSBuilder.build());
		}
		createScene.setItem(mScene);
		msg.setCreateScene(createScene).build();
//		System.err.println(msg.toString());
		
		/**
		 * Test Scene Message Analyze
		 */
		System.err.println("msg.UserId: "+msg.getUserId());
		System.err.println("msg.key: "+msg.getKey());
		CreateScene createScene2 = msg.getCreateScene();
		MScene item = createScene2.getItem();
		System.err.println("scene ID: "+item.getId());
		System.err.println("scene NAME: "+item.getName());
		System.err.println("scene REMARK: "+item.getRemark());
		System.err.println("scene CREATED: "+Tool.dateFormat(new Date(item.getCreated())));
		System.err.println("scene UPDATED: "+Tool.dateFormat(new Date(item.getUpdated())));
		List<MSceneDevice> offDevicesList = item.getOffDevicesList();
		for (MSceneDevice mSceneDevice : offDevicesList) {
			System.err.println("scene off device ID: "+mSceneDevice.getDeviceId());
			System.err.println("scene off device switch: "+mSceneDevice.getSwitch());
			System.err.println("scene off device FeatureIndex: "+mSceneDevice.getFeatureIndex());
			System.err.println("scene off device FeatureValue: "+mSceneDevice.getFeatureValue());
		}
		List<MSceneDevice> openDevicesList = item.getOpenDevicesList();
		for (MSceneDevice mSceneDevice : openDevicesList) {
			System.err.println("scene open device ID: "+mSceneDevice.getDeviceId());
			System.err.println("scene open device switch: "+mSceneDevice.getSwitch());
			System.err.println("scene open device FeatureIndex: "+mSceneDevice.getFeatureIndex());
			System.err.println("scene open device FeatureValue: "+mSceneDevice.getFeatureValue());
		}
	}
}
