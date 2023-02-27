package com.javabasics.inheritance;

public class Chinmay extends Student{
	
	private int rn;

	public static void main(String[] args) {
		Chinmay c = new Chinmay();
		c.name ="Chinmay";
		c.age = "20";
		c.rn=1;
		
		System.out.println(c.giveAttendance());

	}

	@Override
	public boolean giveAttendance() {
		
		return true;
	}

	public void method() {
		// TODO Auto-generated method stub
		
	}

	public void calculate(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
