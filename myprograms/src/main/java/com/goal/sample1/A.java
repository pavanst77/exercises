package com.goal.sample1;

public class A {

	int a;
	public int b;
	protected int c;
	private int d;
	
	public void method1() {
		System.out.println("A ===> Public ");
	}
	
	private void method2() {
		System.out.println("A ===> Private ");
	}
	
	protected void method3() {
		System.out.println("A ===> Protected ");
	}
}