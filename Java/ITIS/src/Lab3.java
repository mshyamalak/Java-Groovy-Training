import java.util.Scanner;


public class Lab3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the product number");
		int pn = sc.nextInt();
		System.out.println("enter the quantity sold");
		int qs = sc.nextInt();
		double retailvalue;
		double price = 0;
		switch(pn)
		{
		case 1:
			price=22.50;
			break;
		case 2:
			price=44.50;
			break;
		case 3:
			price=9.98;
			break;
		default: System.out.println("invalid product");
			break;
		}
		retailvalue = qs * price;
		System.out.println(retailvalue);
	}
}
		
		

