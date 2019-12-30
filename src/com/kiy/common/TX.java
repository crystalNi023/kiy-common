/**
 * 2017年4月28日
 */
package com.kiy.common;

/**
 * @author Simon(ZhangXi TEL:13883833982)
 *
 */
public final class TX {

	private static char[] chars = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static String toString(long value) {

		while (value > chars.length) {
			System.out.print(chars[(int) (value % chars.length)]);
			value = value / chars.length;
		}
		System.out.print(chars[(int) (value % chars.length)]);
	
		return "";
	}
}
