package Interivew;

public class A {
	A(){
		System.out.println("A");
	}

}
class B extends A{
	B(){
		System.out.println("B");
		
	}
	public static void main(String [] a) {
		new B();
	}
}
