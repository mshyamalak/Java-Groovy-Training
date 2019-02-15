import java.sql.Date;
import java.text.DateFormatSymbols;
import java.time.format.DateTimeFormatter;


public class Equalitytester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10, y=10;
		boolean result1 = x==y;
		System.out.println("the == result " + result1);
		String name = "shyamala";
		String regname = "shyamala";
		boolean result2 = name == regname;
		System.out.println("name " + result2);
		int counter =0;
		int like=counter;
		boolean result3 = like==counter;
		System.out.println("result 3" + result3);
		boolean isenabled = true;
		boolean isvalid = false;
		boolean result4 = isenabled == isvalid;
		System.out.println("result4" + result4);
		double todayprice = 10.34;
		double yesterdayprice = 45.35;
		boolean result5 = todayprice != yesterdayprice;
		System.out.println("result 5 "+ result5);
		

	}

}
