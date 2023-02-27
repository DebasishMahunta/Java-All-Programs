package Arrays;
import java.util.*;
public class DArrays {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int rows = Sc.nextInt();
		int cols = Sc.nextInt();
		int [][] numbers = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				numbers[i][j]= Sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
