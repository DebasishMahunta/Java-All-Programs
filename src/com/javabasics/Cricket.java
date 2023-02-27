package com.javabasics;

public class Cricket {
	
	String name;
	int run;
	double runrate;
	
	public void totalRun () {
		System.out.println("Total Run");
		
	}
	public double SayMyRunRate() {
		return 140.85;
		
	}
	
	public static void main(String[] args) {
		
		Cricket p1 = new Cricket (); //p1->{}
		
		System.out.println(p1.name);
		System.out.println(p1.run);
		
		p1.name ="suraj";
		p1.run  = 88;
		p1.runrate= 140.85;
		
		System.out.println(p1.name);
		System.out.println(p1.run);
		System.out.println(p1.runrate);
		
		p1.SayMyRunRate();
		double runrate=p1.SayMyRunRate();
		System.out.println(runrate);
		
		
		
	}
	

}
