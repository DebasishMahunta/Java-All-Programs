package Arrays;

public class DuplicateElement {
	public static void main(String args[]) {
		int a[]= {1,5,8,11,6,5,11,8,11};
		for(int i=1; i<a.length-1;i++) {
			for(int j=i+1; j<a.length;j++) {
				if((a[i]==a[j])&&(i!=j)) {
					System.out.print(a[j]+",");
				}
			}
		}
	}

}
