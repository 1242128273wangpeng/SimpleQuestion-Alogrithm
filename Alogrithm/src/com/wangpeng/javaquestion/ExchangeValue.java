package com.wangpeng.javaquestion;

/**
 * �������м�������������ֵ
 * 
 * @author 2014wang
 * 
 */
public class ExchangeValue {
	/**
	 * ��ֵ��Ӽ�������ֵ
	 * @param value_a
	 * @param value_b
	 */
	public static void exchangevalue1(int value_a, int value_b) {
		value_a = value_a + value_b;
		value_b = value_a - value_b;
		value_a = value_a - value_b;
		System.out.println("value_a��ֵ:" + value_a);
		System.out.println("value_b��ֵ:" + value_b);
	}
	/**
	 * λ�����㽻����ֵ
	 * @param value_a
	 * @param value_b
	 */
	public static void exchangevalue2(int value_a, int value_b) {
		value_a = value_a ^ value_b;
		value_b = value_a ^ value_b;
		value_a = value_a ^ value_b;
		System.out.println("value_a��ֵ:" + value_a);
		System.out.println("value_b��ֵ:" + value_b);
	}
	/**
	 * �м����������ֵ
	 * @param value_a
	 * @param value_b
	 */
	public static void exchangevalue3(int value_a, int value_b) {
		int value_c;
		value_c = value_a ;
		value_a = value_b;
		value_b = value_c;
		System.out.println("value_a��ֵ:" + value_a);
		System.out.println("value_b��ֵ:" + value_b);
	}
	public static void main(String[] args) {
		int a = 11;
		int b = 19;
		System.out.println("����һ");
		ExchangeValue.exchangevalue1(a, b);
		System.out.println("������");
		ExchangeValue.exchangevalue2(a, b);
		System.out.println("������");
		ExchangeValue.exchangevalue3(a, b);
	}
}
