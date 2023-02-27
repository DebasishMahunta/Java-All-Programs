package com.javabasics;

public class People {
	String name;
	int age;
	int weight;
	double height;

	public People() {
		
	}
	public People(String n,int a,int w,double h) {
		name = n;
		age = a;
		height = h;
		weight = w;
	}
	public static void main(String [] args) {
		
		People p1=new People ("kiti",23,40,4.7);
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.print(p1.weight);
	}
}
 
