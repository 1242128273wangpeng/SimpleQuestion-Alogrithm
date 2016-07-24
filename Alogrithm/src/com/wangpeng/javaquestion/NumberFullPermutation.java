package com.wangpeng.javaquestion;

public class NumberFullPermutation {
	class FullPermutation {
		public void fullpermu(int arrays[], int start, int end) {
			if (start == end) {
				for (int i = 0; i < arrays.length; i++) {
					System.out.print("-" + arrays[i]);
				}
				System.out.println("");
			} else {
				for (int i = start; i < arrays.length; i++) {
					// ��ǰλ�ú�i����
					swap(arrays, start, i);
					// ȫ����
					fullpermu(arrays, start + 1, end);
					// ȫ��������ȥ
					swap(arrays, start, i);
				}
			}
		}

		public void swap(int arrays[], int a, int b) {
			int temp = arrays[a];
			arrays[a] = arrays[b];
			arrays[b] = temp;
		}
	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3 };
		FullPermutation fullPermutation = new NumberFullPermutation().new FullPermutation();
		fullPermutation.fullpermu(array, 0, array.length - 1);
	}
}
