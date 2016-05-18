package com.wangpeng.javaquestion;
/**
 * ×Ö·ûµÄ·´ÐòÊä³ö
 * @author 2014wang
 *
 */
public class ReverseString {
	public static void reverse(String str) {
		StringBuffer sbuff = new StringBuffer("");
		for (int i = str.length()-1; i >= 0; i--) {
           sbuff.append(str.charAt(i));
		}
		System.out.println(sbuff.toString());
	}

	public static void main(String[] args) {
          ReverseString.reverse("wang");
	}
}
