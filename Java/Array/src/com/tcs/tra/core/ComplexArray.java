package com.tcs.tra.core;

import com.google.gson.Gson;

public class ComplexArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		;
		// TODO Auto-generated method stub
		Address add1 = new Address("ststst", "trichy","562489");
		Customer cust1 = new Customer("fnfnfn", "lnlnln", "mnmnmn",add1 );
		Address add2 = new Address("2ststst", "2trichy","2562489");
		Customer cust2 = new Customer("2fnfnfn", "2lnlnln", "2mnmnmn",add2 );
		Address add3 = new Address("3ststst", "3trichy","3562489");
		Customer cust3 = new Customer("3fnfnfn", "3lnlnln", "3mnmnmn",add3 );
		// complex array
		Customer[] customerARR ={cust1, cust2, cust3};
		for (int i=0;i<customerARR.length;i++){
		//for (Customer customer: customerARR){
			Customer customer = customerARR[i];
			System.out.println("1STNAME :"+ customer.getFirstname());
			System.out.println("MNAME "+ customer.getMiddlename());
			System.out.println("LNAME "+ customer.getLastname());
			System.out.println("STREET "+ customer.getAdd().getStreet());
			System.out.println("city "+ customer.getAdd().getCity());
			System.out.println("zipcode "+ customer.getAdd().getZipcode());
			
		}
		Gson parser = new Gson();
		String json = parser.toJson(Customer.class);
		
		
		
		

	}	
}
