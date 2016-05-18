package com.wangpeng.javaquestion;

public class BinarySearch {
	public static void binarySearcher(int[] data, int keyValue) {
		int left = 0;
		int right = data.length - 1;
		int middle = (left + right) / 2;
		System.out.println("left:" + left + "right:" + right + "middle:"
				+ middle);
		while (left <= right&&data[left]<=data[right]) {
			if (data[middle] == keyValue) {
				System.out.println("找到了" + data[middle]);
				return;
			} else if (data[middle] > keyValue) {
                if(middle==left){  // 防止在边缘重复的查找
                	System.out.println("未找到");
                	return;
				}
                System.out.println("去左边查找" + data[middle]);
				right = middle - 1;
				middle = (left + right) / 2;
			} else if (data[middle] < keyValue) {
				if(middle==right){  // 防止在边缘重复的查找
                	System.out.println("未找到");
                	return;
				}
				System.out.println("去右边查找" + data[middle]);
				left = middle + 1;
				middle = (left + right) / 2;
				System.out.println("去右边查找" + data[middle]);
			}
		}
		System.out.println("未找到");
	}

	public static void bubbleSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp;
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println("第" + i + "个:" + data[i]);
		}
	}

	public static void main(String[] args) {
		int dataArray[] = new int[] { 1, 22, 34, 23, 2, 5, 3, 7, 21, 16 };
		// 1,2,3,5,7,16,21,22,23,34
		BinarySearch.bubbleSort(dataArray);
		BinarySearch.binarySearcher(dataArray, 1);
	}
}
