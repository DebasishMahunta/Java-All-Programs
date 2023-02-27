
public class MethodOverloading {
	public int add (int a,int b) {
		return a+b;
	}
	public static void main(String [] args) {
		MethodOverloading m1 = new MethodOverloading();
		int result = m1.add(10,200);
		System.out.println(result);
		
		
	}

}
