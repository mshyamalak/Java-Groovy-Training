package com.tcs.ignio.isa;

public class Customer extends Person {
	int customerid;
	
	/*public  Customer(){
		super();
	}
	*/
	public Customer(){
		this(1,"jjjj","hhhhh");
	}

	public Customer(int customerid, String fName, String LName) {
		super(fName, LName);
		this.customerid = customerid;
		//this.fName=fName; // PROTECTED IN PERSON CLASS
		//this.LName=LName; // PROTECTED IN PERSON CLASS
	}


	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	
}
