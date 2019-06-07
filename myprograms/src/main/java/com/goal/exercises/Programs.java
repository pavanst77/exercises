package com.goal.exercises;

/**
 * Hello world!
 *
 */
public class Programs {
	public static void main(String[] args) {

		System.out.println(reverse("Hello World!"));
		
		System.out.println(reverse(1234));
		
	}
	
	/**
	 * String reverse
	 * 
	 * @param str
	 * @return
	 */
	private static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
	
	/**
	 * Number reverse
	 * 
	 * @param num
	 * @return
	 */
	private static int reverse(int num) {
		int reverse = 0;
		
		while (num > 0) {
			reverse = reverse * 10;
			reverse += num % 10;
			num /=10;
		}
		
		return reverse;
	}
}
