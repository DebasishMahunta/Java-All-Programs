 
package com.javabasics.inheritance;


public class Cat extends Animal{
	
	private String color;
	
	protected String value ="200";
	
	
	public Cat() {
		System.out.println("Cat class Constructor");
	}
	
	
	public Cat(String color, String noOfLegs) {
		super(noOfLegs);
		this.color= color;
	}
	
	public void eat() {
		System.out.println("Cat eats");
	}

	public static void main(String[] args) {
		Cat cat = new Cat("White","4");
		System.out.println(cat.noOfLegs);
		System.out.println(cat.color);
		Animal an = new Animal();
		Cat c1 = new Cat();
		an.eat();
		
		cat.eat();
		
		System.out.println(cat.value);
		
		
	
	}

}
