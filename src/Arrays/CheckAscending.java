package Arrays;

public class CheckAscending {

	public static void main(String[] args) {
		int arr[] = {0, 1, 3, 6, 5};
		boolean flag = false;
		for(int i =0; i< arr.length-1; i++) {
			if(arr[i]< arr[i+1]) {
				flag = true;
			}else {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Ascending");
		}else {
			System.out.println(" Not Ascending");
		}
	}

}
