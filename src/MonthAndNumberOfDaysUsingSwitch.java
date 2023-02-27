
public class MonthAndNumberOfDaysUsingSwitch {

	public static void main(String[] args) {
		 String month ="MAY";
		 int n = getNumberOfDays(month);
		 System.out.println(n);
                    	}
	
	public static int getNumberOfDays(String month) {
		
		switch(month) {
		    case "JAN":
		    	return 30;
		    case "FEB":
		        return 28;
		    case "MAR":
		        return 31;
		    case "APR":
		    	return 30;
		    case "MAY":
		        return 31;
		    default: 
		       return 0;
		}
	}

}
