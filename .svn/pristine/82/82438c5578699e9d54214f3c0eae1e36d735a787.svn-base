/**
 * 2017年8月1日
 */
package com.kiy.common;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("START TEST");
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		for (int index = 0; index < 100000; index++) {
			map.put(Integer.toString(index), Integer.toHexString(index));
		}

		long time = System.currentTimeMillis();

		for (int index = 0; index < 1000; index++) {
			for (String s : map.values()) {
				if (s == null)
					;
			}
		}

		System.out.println(System.currentTimeMillis() - time);
		time = System.currentTimeMillis();

		for (int index = 0; index < 1000; index++) {
			for (Enumeration<String> e = map.elements(); e.hasMoreElements();) {
				if (e.nextElement() == null)
					;
			}
		}
		
		System.out.println(System.currentTimeMillis() - time);
	}

}
