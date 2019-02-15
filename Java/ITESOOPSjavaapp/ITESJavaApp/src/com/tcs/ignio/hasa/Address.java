package com.tcs.ignio.hasa;

public class Address {
	private String doorno;
	private String city;
	private String street;
	private String area;
	private String state;
	private String zipcode;
	public Address(){ // default constructor
		this.street= "default street";
		this.area="default area";
		this.city="default city";
		this.doorno="default doorno";
		this.state="default state";
		this.zipcode="default zipcode";
	}
	public Address(String doorno, String city, String street, String area,
			String state, String zipcode) { // parameterized constructor
		this.doorno = doorno;
		this.city = city;
		this.street = street;
		this.area = area;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
