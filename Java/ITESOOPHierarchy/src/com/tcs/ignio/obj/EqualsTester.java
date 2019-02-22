package com.tcs.ignio.obj;

public class EqualsTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1= new Customer("ram", 1);
		Customer cust2= new Customer("ram", 1);
		Customer cust3 = cust1;
		int a= 10;
		int b= 10;
		boolean r= a==b;
		System.out.println(r);
		
		
		boolean cr = cust1 == cust2;
		boolean cr2 = cust1 == cust3;
		System.out.println(cr);
		System.out.println(cr2);
		// equals method
		boolean eqr = cust1.equals(cust2);
		if(eqr){
			System.out.println("the customers are same");
		}
		else{
			System.out.println("not same");
		}
	}

}
