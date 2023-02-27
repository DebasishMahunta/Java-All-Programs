
public class MonthAndNumberOfDays {

	public static void main(String[] args) {
		 String month ="JAN";
		 int n = getNumberOfDays(month);
 		 System.out.println(n);
	}
	
	public static int getNumberOfDays(String month) {
		 if(month.equals("JAN")) {
			 return 31;
		 }
		 
		 if(month.equals("FEB")) {
			 return 28;
		 }
		 
		 if(month.equals("MAR")) {
			 return 30;
		 }
		 
		 if(month.equals("APR")) {
			 return 31;
		 }
		 if(month.equals("MAY")) {
			 return 30;
		 }
		 else {
			 return 0;
		 }
	}

}
