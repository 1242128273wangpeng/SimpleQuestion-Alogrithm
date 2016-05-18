package com.wangpeng.javaquestion;
/**
 * 
 * @author 2014wang
 * This is a test----->tset a si sihT
 * 
 */
public class ReverseWords {
	public static String reverse(String str) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			stringBuffer.append(str.charAt(i));
		}
		String result = stringBuffer.toString();
		return result;
	}

	public static void main(String[] args) {
		String myresult = ReverseWords.reverse("This is a test");
		System.out.println("myresult-->" + myresult);
	}

}
