package com.tcs.ignio.hasa;

public class HASSetterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address =new Address();
		address.setDoorno("156");
		address.setArea("rk nagar");
		address.setCity("chennai");
		address.setState("tamilnadu");
		address.setStreet("new street");
		address.setZipcode("125986");
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("shyamala");
		customer.setAddress(address);
		System.out.println("name "+ customer.getName());
		System.out.println("id "+ customer.getId());
		System.out.println("address" + customer.getAddress());
		
		/*Address add = customer.getAddress(); // assigning new variable, not recommended
		
		System.out.println("doorno "+ add.getDoorno());
		System.out.println("Area "+ add.getArea());
		System.out.println("city "+ add.getCity());
		System.out.println("state "+ add.getState());
		System.out.println("street "+add.getStreet());
		System.out.println("zipcode" + add.getZipcode());*/
		
		//chaining method - recommended
		System.out.println("doorno "+ customer.getAddress().getDoorno());
		System.out.println("Area "+ customer.getAddress().getArea());
		System.out.println("city "+ customer.getAddress().getCity());
		System.out.println("state "+ customer.getAddress().getState());
		System.out.println("street "+customer.getAddress().getStreet());
		System.out.println("zipcode" + customer.getAddress().getZipcode());
	}
	
	
	
	

}
