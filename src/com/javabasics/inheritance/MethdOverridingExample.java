package com.javabasics.inheritance;

public class MethdOverridingExample {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		a.calculate(10, 20);
		B b = new B();
		b.method();
		b.calculate(10, 20);
		
		A aNew = new B();
		aNew.calculate(40, 30);
	}
}

class A{
	
	public void method() {
		System.out.println("A class method");
	}
	
	public void calculate(int a, int b) {
		System.out.println(a+b);
	}
}

class B extends A{
	
	public void method() {
		System.out.println("B class method");
	}
	
	@Override
	public void calculate(int a, int b) {
		System.out.println(a-b);
	}
}

// Method overriding is a concept where Child class provides a 
//different implementation of the parent class method 