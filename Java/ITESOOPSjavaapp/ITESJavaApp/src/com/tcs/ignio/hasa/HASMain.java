package com.tcs.ignio.hasa;

public class HASMain {
	public static void main(String[] args) {
		//Address object
		Address address=new Address("156", "new city","new street","new area","tamilnadu", "6200002");
		Customer customer=new Customer(1,"shyamala", address);
		System.out.println("name "+ customer.getName());
		System.out.println("id "+ customer.getId());
		System.out.println("address" + customer.getAddress());
		
		
		// Using chaining pattern: recommended
		System.out.println("doorno " + customer.getAddress().getDoorno());
		System.out.println("street "+ customer.getAddress().getStreet());
		System.out.println("area " + customer.getAddress().getArea());
		System.out.println("city "+ customer.getAddress().getCity());
		System.out.println("state " + customer.getAddress().getState());
		System.out.println("zipcode " + customer.getAddress().getZipcode());
		
		
		
	}
}
