package com.goal.sortings;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {3,2,6,5,8,1,9};
		
		int length = a.length;
		
		for (int i = 0 ; i < length - 1 ; i ++) {
			for (int j = 0 ; j < length - i - 1 ; j ++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a [j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		System.out.println(a);
	}
}
