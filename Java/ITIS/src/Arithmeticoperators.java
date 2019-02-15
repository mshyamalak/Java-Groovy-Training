import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.spi.DateFormatProvider;
import java.time.format.DateTimeParseException;


public class Arithmeticoperators {
	public static void main(String[] args){
		int x =10, y =20;
		int addresult = x + y;
		int subtract = x - y;
		int multiply = x * y;
		int divide = x / y;
		int remainder = x % y;
		String firstname ="shyamala";
		String lastname ="M";
		String fullname =firstname + lastname;
		System.out.println("Full name " + fullname);
		System.out.println("add result is " + addresult);
		System.out.println("subtract "+ subtract);
		System.out.println("Multiply " + multiply);
		System.out.println("divide " + divide);
		System.out.println("remainder " + remainder);
		int like = 1;
		int totallikes = ++like;
		int totaldislikes = --totallikes;
		System.out.println("total likes " + totallikes);
		System.out.println("total likes " + totaldislikes);
		int counter = 1;
		counter += 1;
		System.out.println("counter " + counter);
		counter -= 1;
		System.out.println("counter " + counter);
		double price =34.75;
		float totalprice = ((float)price*10/100); //type casting double to float
		System.out.println("total price " + totalprice);
		System.out.println("total price " + Math.round(totalprice*100.0)/100.0);
		DecimalFormat df =new DecimalFormat("##.###");
		double f=12345.67545343598406;
		System.out.println("decimalnumber" + df.format(f) );
		
	}

}
