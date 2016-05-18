package com.wangpeng.sortalgorithm;

public class InsertSort {

	public void sort(int intArray[]) {
		for (int i = 1; i < intArray.length; i++) {
			int tempvalue = intArray[i];
			int tempflag = i;
		    while(tempflag>0&&intArray[tempflag-1]>tempvalue){
		    	intArray[tempflag] = intArray[tempflag-1];
		    	tempflag = tempflag-1;
		    }
			intArray[tempflag] = tempvalue;
		}
	}

	public void display(int intArray[]) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void main(String[] args) {
		InsertSort insertSort = new InsertSort();
		int intArray[] = new int[] { 18, 2, 8, 4, 3, 9, 1, 30, 6 };
		insertSort.sort(intArray);
		insertSort.display(intArray);
	}
}
