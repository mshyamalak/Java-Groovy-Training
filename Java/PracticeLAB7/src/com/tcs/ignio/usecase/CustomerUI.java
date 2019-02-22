package com.tcs.ignio.usecase;

public class CustomerUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Repository repository;
		repository = new SQLRepository();
		CustomerService cs= new CustomerService(repository);
		
		System.out.println(" save " + cs.save());
		System.out.println(" findall " + cs.findAll());
		System.out.println(" findbyid " + cs.findById());
		System.out.println(" remove " + cs.remove());
		System.out.println(" update " + cs.update());
		System.out.println(" Authentication  " + cs.auth());
		
	}

}
