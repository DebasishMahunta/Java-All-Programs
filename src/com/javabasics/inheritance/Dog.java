package com.javabasics.inheritance;

public class Dog extends Animal{
	
	private String color;
	
	public Dog() {
		System.out.println("Dog class constructor");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.color="Black";
		dog.noOfLegs="4";
		System.out.println(dog.noOfLegs);
		System.out.println(dog.color);
		
		dog.eat();
		
	}

}
