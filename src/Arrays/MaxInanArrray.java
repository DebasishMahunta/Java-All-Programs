package Arrays;

public class MaxInanArrray {

	public static void main(String[] args) {
		int[] arr = {1, 9, 0, 3, -1, 12};
		int max = arr[0];

		for(int i=1; i< arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Max is "+ max);
		int min = arr[0];
		
		for(int i=1;i <arr.length ;i++ ) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Min is "+ min);
		
	}

}
