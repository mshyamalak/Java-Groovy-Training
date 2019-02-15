package com.tcs.ignio;

public class UserDetails {
	private int id;
	private String name;
	private String userName;
	private String email;
	private String phone;
	private String website;
	private Address add;
	private Company comp;
public UserDetails(){
	this.id=0;
	this.name="";
	this.userName="";
	this.email="";
	this.phone="";
	this.website="";
	
}
public UserDetails(int id, String name, String userName, String email,
		String phone, String website) {
	this.id = id;
	this.name = name;
	this.userName = userName;
	this.email = email;
	this.phone = phone;
	this.website = website;
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
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}

}
