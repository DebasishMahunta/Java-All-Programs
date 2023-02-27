 
public class iplteampoint {

	public static void main(String[]args) {
		String point = "RR";
		int y = getNumberOfTeam(point);
		System.out.println(y);
		
	}
	
	public static int getNumberOfTeam(String point) {
		switch(point) {
		case "GT":
		    return 20;
		case "RR":
		    return 16;
		case "LSG":
		    return 16;
		case "DC":
			return 14;
		case "RCB":
			return 14;
		case "KKR":
			return 12;
		case "PBKS":
			return 12;
		case "SRH":
			return 10;
		case "CSK":
			return 8;
		case "MI":
			return 6;
		default :
			return 0;
					
		
		}
	}
}	