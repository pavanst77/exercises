package com.goal.sortings;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = { 3, 2, 6, 5, 8, 1, 9 };

		int length = a.length;
		int minimum;

		for (int i = 0; i < length; i++) {
			minimum = i;

			for (int j = i + 1; j < length; j++) {
				if (a[j] < a[minimum]) {
					minimum = j;
				}
			}
			
			int temp = a[minimum];
			a[minimum] = a[i];
			a[i] = temp;
		}
		System.out.println("Done!");
	}
}
