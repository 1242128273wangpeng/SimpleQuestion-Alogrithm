package com.wangpeng.sortalgorithm;

public class QuickSort {
	public void sort(int n[], int left, int right) {
		int dp;
		if (left < right) {
			dp = partition(n, left, right);
			sort(n, left, dp - 1);
			sort(n, dp + 1, right);
		}
	}

	public int partition(int n[], int left, int right) {
		int pivot = n[left];
		while (left < right) {
			while (left < right && n[right] >= pivot) {
				--right;
			}
			n[left] = n[right];
			while (left < right && n[left] <= pivot) {
				++left;
			}
			n[right] = n[left];
		}
		n[left] = pivot;
		return left;
	}

	public void display(int intArray[]) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	/**
	 * ¿ìËÙÅÅÐò
	 * 
	 * @author 2014wang
	 * @param args
	 */
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int intArray[] = new int[] { 49, 38, 65, 97, 76, 13, 27, 49 };
		quickSort.sort(intArray, 0, intArray.length - 1);
		quickSort.display(intArray);
		// (49) 38 65 97 76 13 27 49
		//  27 38 65 97 76 13 27 49        -49-
	}

}
