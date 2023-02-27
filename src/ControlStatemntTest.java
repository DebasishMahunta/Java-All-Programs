
public class ControlStatemntTest {
	
	public static void main(String[] args) {
		//int datatype of size 4
		//x is a variable
		//y is a variable
		// z = x+y + is operator x,y operand
		int x =100;
		int y=200;
		int z = x+y;
		System.out.println(z);
		int a = 90;
		int b = 0; // assignment 
		// if b =0, c = a*1
		// els c = a*b
		if( b == 0 ) {// == Comparison
			int c = a*1;
			System.out.println(c);
		}else {
			int c = a*b;
			System.out.println(c);
		}
		System.out.println("Done");
		
	}
}
