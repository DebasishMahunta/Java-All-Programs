package com.javabasics;

public class MethodOverloadingTest {
	public double sum(double a,double b) {
		return a+b;
	}
	public double sum(int c,double d) {
		return c+d;
	}
	public static void main(String [] args) {
		MethodOverloadingTest m1 = new MethodOverloadingTest();
		
		double result = m1.sum(1.0,2.0);
		System.out.println(result);
		double result2 = m1.sum(20,2.0);
		System.out.println(result2);
		

	}

}
