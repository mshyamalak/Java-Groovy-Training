package com.tcs.ignio;

import com.google.gson.Gson;

public class JSONProject {
	public static void main(String[] args) {
		//address
		Address address = new Address("RK street", "suite" , "trichy", "652025", new Geolocation(45.26,26.39));
		Company company = new Company("tcs","cccc pppp", "bbb zzz");		 
		UserDetails userdetails = new UserDetails(15, "shyamala", "shyam", "test@example.com",
				"59862", "test.com");
		
		//convert into JSON
		//1.Create Gson Parser Object
		Gson parser = new Gson();
		//convert customer object into JSON
		String json=parser.toJson(Address.class);
		// conert existing json into java object
		Address comp=(Address) parser.fromJson(json, Address.class);
		System.out.println(company.getName());
		
	}}
