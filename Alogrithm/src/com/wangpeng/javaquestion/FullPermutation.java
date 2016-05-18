package com.wangpeng.javaquestion;

import java.util.ArrayList;
import java.util.List;
/**
 * 字符的全排列
 * @author 2014wang
 *
 */
public class FullPermutation {
	private static List<String> result = new ArrayList<String>();

	public static List<String> list(String base, String buff) {
		List<String> result = new ArrayList<String>();
		if (base.length() <= 0) {
			result.add(buff);
		}
		for (int i = 0; i < base.length(); i++) {
			List<String> temp = list(new StringBuffer(base).deleteCharAt(i)
					.toString(), buff + base.charAt(i));
			result.addAll(temp);
		}
		return result;
	}

	public static void display(List<String> strlist) {
		for (int i = 0; i < strlist.size(); i++) {
			System.out.println("第" + i + "个  " + strlist.get(i));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Str = "abcd";
		List<String> strresult = FullPermutation.list(Str, "");
		FullPermutation.display(strresult);
	}

}
