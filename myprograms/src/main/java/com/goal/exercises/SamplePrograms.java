package com.goal.exercises;

/**
 * Hello world!
 *
 */
public class SamplePrograms {
	public static void main(String[] args) {

		System.out.println(reverse("Hello World!"));
		
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
}
