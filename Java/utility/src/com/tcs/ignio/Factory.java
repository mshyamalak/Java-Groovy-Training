package com.tcs.ignio;

public class Factory {
	private Factory(){
		System.out.println("factory is being created");
	}
	public static Factory getInstance(){
		return new Factory();
	}
	public String sayHello() {
		return "hello";
		
	}
	
	

}
