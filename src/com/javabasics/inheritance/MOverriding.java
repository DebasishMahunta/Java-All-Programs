package com.javabasics.inheritance;

public class MOverriding {

	public static void main(String[] args) {
	Chinmay p = new Chinmay();
	p.method();
	p.calculate(20,30);
	Chinmay k = new Chinmay();
	k.method();
	k.calculate(30, 40);
	Chinmay p1 = new Chinmay();
	p1.calculate(20, 100);
	

	}
}

class Pinku{
	public void method () {
		System.out.println("pinku is parent");
	}
	public void calculate(int a , int b) {
		System.out.println(a+b);
	}
}
class Kiti extends Chinmay{
	public void method() {
		System.out.println("kiti is child");
	}
	public void calculate(int a,int b) {
		System.out.println(a-b);
	}
}
