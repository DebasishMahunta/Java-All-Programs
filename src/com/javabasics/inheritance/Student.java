package com.javabasics.inheritance;

public abstract class Student {
	
	protected String name;
	protected String age;
	
	public abstract boolean giveAttendance();
	// It has declaration but no implementation

}

// Student o1 = new Student();
// If a class has an abstract method then the class must be abstract
// We can have an abstract class without any abstract method in it.
// abstract means not complete
// You cannot create object of abstract class
