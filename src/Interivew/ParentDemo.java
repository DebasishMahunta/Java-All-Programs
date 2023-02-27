package Interivew;

public class ParentDemo {
	static void test() {
		System.out.println("Parent");
	}

}
class Child extends ParentDemo{
	static void test() {
		System.out.println("Child");
	}
	public static void main(String args[]) {
		ParentDemo p = new Child();
		p.test();
	}
}
