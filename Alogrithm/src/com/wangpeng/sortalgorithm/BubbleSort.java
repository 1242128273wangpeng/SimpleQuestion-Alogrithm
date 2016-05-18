package com.wangpeng.sortalgorithm;

/**
 * ц╟ещеепР
 * 
 * @author 2014wang
 * 
 */
public class BubbleSort {
	public void sort(int intArray[]) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j + 1];
					intArray[j + 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
	}

	public void display(int intArray[]) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int intArray[] = new int[] { 18, 2, 8, 4, 3, 9, 1, 30, 6 };
		bubbleSort.sort(intArray);
		bubbleSort.display(intArray);
	}
}
