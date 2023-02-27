package com.javabasics;

public class Person {
	String Name;
	int Age;
	double Height;
	
	public Person() {
		
	}
 
	public Person(String n, int A, double H ) {
		Name = n;
		Age = A;
		Height = H;
		
		
	}
	public static void main(String [] args) {
		Person p1 = new Person("kiti",23,4.5);
		System.out.println(p1.Name);
		System.out.println(p1.Age);
		System.out.println(p1.Height);
		
	}
}
