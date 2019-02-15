
public class Weekday {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int day = 3;
		String weekday;
	switch(day){
	case 1:
		
		weekday = "monday";
		//break;
		System.out.println("1");
	case 2:
		weekday = "tuesday";
		//break;
		System.out.println("2");
	case 3:
		weekday = "wednesday";
		//break;
		System.out.println("3");
	case 4:
		weekday = "thursday";
		//break;
		System.out.println("4");
	default: 
		weekday = "invalid day";
		//break;
	}
	System.out.println("day "+ day + " weekday " + weekday);
	}

}
