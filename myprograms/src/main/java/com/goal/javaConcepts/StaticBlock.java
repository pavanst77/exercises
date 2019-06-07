package com.goal.javaConcepts;

public class StaticBlock {

	/**
	 * In Java static block is used to initialize the static data members. Important
	 * point to note is that static block is executed before the main method at the
	 * time of class loading.
	 */
	static {

		System.out.println("Static Block !!!");

	}

	public static void main(String[] args) {

		System.out.println("Main Block !!!");
		
	}
}
