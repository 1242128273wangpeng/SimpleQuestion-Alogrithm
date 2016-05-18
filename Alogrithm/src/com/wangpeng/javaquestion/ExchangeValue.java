package com.wangpeng.javaquestion;

/**
 * 不利用中间数交换两个数值
 * 
 * @author 2014wang
 * 
 */
public class ExchangeValue {
	/**
	 * 数值相加减交换数值
	 * @param value_a
	 * @param value_b
	 */
	public static void exchangevalue1(int value_a, int value_b) {
		value_a = value_a + value_b;
		value_b = value_a - value_b;
		value_a = value_a - value_b;
		System.out.println("value_a的值:" + value_a);
		System.out.println("value_b的值:" + value_b);
	}
	/**
	 * 位移运算交换数值
	 * @param value_a
	 * @param value_b
	 */
	public static void exchangevalue2(int value_a, int value_b) {
		value_a = value_a ^ value_b;
		value_b = value_a ^ value_b;
		value_a = value_a ^ value_b;
		System.out.println("value_a的值:" + value_a);
		System.out.println("value_b的值:" + value_b);
	}
	/**
	 * 中间变量交换数值
	 * @param value_a
	 * @param value_b
	 */
	public static void exchangevalue3(int value_a, int value_b) {
		int value_c;
		value_c = value_a ;
		value_a = value_b;
		value_b = value_c;
		System.out.println("value_a的值:" + value_a);
		System.out.println("value_b的值:" + value_b);
	}
	public static void main(String[] args) {
		int a = 11;
		int b = 19;
		System.out.println("方法一");
		ExchangeValue.exchangevalue1(a, b);
		System.out.println("方法二");
		ExchangeValue.exchangevalue2(a, b);
		System.out.println("方法三");
		ExchangeValue.exchangevalue3(a, b);
	}
}
