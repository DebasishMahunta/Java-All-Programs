package com.javabasics.inheritance;

public class Animal {
	
	protected String noOfLegs;
	
	protected String value ="100";
	
	public Animal() {
		System.out.println("Parent class constructor");
	}
	
	public Animal(String noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	public void eat() {
		System.out.println("Every Animal eats");
	}

}
