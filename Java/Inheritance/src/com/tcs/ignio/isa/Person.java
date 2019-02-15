package com.tcs.ignio.isa;

public class Person {
	private String fName, LName;
	
	public Person(){
		this.fName="";
		this.LName="";
	
	}
	

	
	public Person(String fName, String lName) {
		super();
		this.fName = fName;
		LName = lName;
	}



	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}
	
}
