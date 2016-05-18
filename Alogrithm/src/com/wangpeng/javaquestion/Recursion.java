package com.wangpeng.javaquestion;
/**
 * 
 * @author 2014wang
 * use Recursion to get N!=n*(n-1)*(n-2)*...*2*1;
 */
public class Recursion {
	public static int recursion(int n) {
		if (n == 1 || n == 0) {
			return  1;
		} else {
			return  n * recursion(n - 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = Recursion.recursion(3);
		System.out.println("result-->"+result);
	}

}
