package com.wangpeng.sortalgorithm;
/**
 * —°‘Ò≈≈–Ú
 * @author 2014wang
 *
 */
public class SelectSort {
	public void sort(int intArray[]){
		for (int i = 0; i < intArray.length; i++) {
			int tempminflag = i;
			for (int j = i+1; j < intArray.length; j++) {
				if(intArray[tempminflag]>intArray[j]){
					tempminflag = j;
				}
			}
			int temp = intArray[i];
			intArray[i]= intArray[tempminflag];
			intArray[tempminflag] = temp;
		}
	}
	
	public void display(int intArray[]) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void main(String[] args) {
		SelectSort selectSort = new SelectSort();
		int intArray[] = new int[] { 18, 2, 8, 4, 3, 9, 1, 30, 6 };
		selectSort.sort(intArray);
		selectSort.display(intArray);
	}
}
