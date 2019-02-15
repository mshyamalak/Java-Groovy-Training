package com.tcs.ignio.hasa;

public class Customer {
	private int id;
	private String name;
	private Address address;// has-a : customer has a Address
	public Customer(){ // default constructor
		this.id=1;
		this.name="default";
		this.address = new Address();
	}
	public Customer(int id, String name, Address address){
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
