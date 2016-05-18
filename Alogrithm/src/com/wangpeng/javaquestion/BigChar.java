package com.wangpeng.javaquestion;

public class BigChar {
	/**
	 * this is a bug ==> This Is A Bug
	 */
	public static void toBigChar(String str) {
		StringBuffer buffer = new StringBuffer();
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char temp = 0;
			if (i == 0||flag) {
				temp = (char) (str.charAt(i)-32);
				 flag = false;
			} else {
				temp = str.charAt(i);
				System.out.println("String.valueOf(temp):"+String.valueOf(temp));
				if (String.valueOf(temp).equals(" ")) {
					System.out.println("char 为 空");
                     flag = true;
				}
			}
			buffer.append(temp);
		}
		System.out.println("变大写为:" + buffer.toString());
	}

	public static void main(String[] args) {
		String s = "this is a bug";
		BigChar.toBigChar(s);
	}
}
