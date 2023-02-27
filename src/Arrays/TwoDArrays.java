package Arrays;
import java.util.*;

public class TwoDArrays {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int rows = Sc.nextInt();
		int cols = Sc.nextInt();
		int [][] numbers = new int [rows][cols];
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				numbers[i][j]= Sc.nextInt();
				
			}
		}                                
		int x = Sc.nextInt();
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if (numbers[i][j]==x) {
					System.out.println("x found at location("+i+","+j+")");
				}
			}
		}

	}

}
