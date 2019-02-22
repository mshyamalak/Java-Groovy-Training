package com.tcs.ignio.obj;

public class Customer {
	String name;
	int Id;
	public Customer(){
		
	}
	public Customer(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public boolean equals(Object obj){
		//1st customer obj and compare 2nd customer
		Customer secondcust = (Customer) obj;
		//both customer id
		int firstcustomerid = this.getId();
		int secondcustomerid = secondcust.getId();
		if (firstcustomerid == secondcustomerid)
			return true;
		return false;
	
		
	}

}
