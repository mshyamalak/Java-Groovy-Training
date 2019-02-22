package com.tcs.ignio.usecase;

public interface Greeter {
	String greet();// abstract method
	
	default String sayHello(){
		return "hello";
	}
}
