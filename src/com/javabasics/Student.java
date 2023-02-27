package com.javabasics;

public class Student {
	
	// Member Variables
	 String name;
	 int rollNo;
	 double mark;
	 char grade;
	 
	 // Constructor 
	 // Constructor is a special kind of method to initialize objects which doesnt have a return type and its name will b same as Class name
	 
	 // Default Constructor
	 public Student() {
		 
	 }
	 
	 // Parameterzied Constructor
	 public Student(String n, int r, double m, char g) {
		 name = n;
		 rollNo = r;
		 mark = m;
		 grade = g;
	 }
	 
	 // Method
	 
	 public void takeExam() {
		 System.out.println("Taking exam");
	 }
	 
	 public double sayYourMark() {
		 return 30.5;
	 }

	public static void main(String[] args) {
		
		// Creating Objects
		Student kiti = new Student("Pinku", 30, 50.5, 'C');
		
		Student s1 = new Student(); // s1-> {}
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		
		// Value assignment
		s1.name = "Kiti";
		s1.rollNo = 10;
		s1.mark  = 30.5;
		s1.grade = 'A';
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		
		// Student 2
		Student s2 = new Student();
		
		s2.name ="pinku";
		s2.rollNo = 20;
		s2.mark = 40.5;
		s2.grade = 'B';
		
		
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		System.out.println(s2.mark);
		System.out.println(s2.grade);
		
		// Calling Mthods
		s1.takeExam();
		double mark = s1.sayYourMark();
		System.out.println(mark);
	}
}
