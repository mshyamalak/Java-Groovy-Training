package com.tcs.ignio;

public class FactoryMain {
	public static void main(String[] args) {
		Factory factory = factory.getInstance();
		System.out.println(factory.sayHello());
		JSONBuilder builder = JSONBuilder.build();
		System.out.println(builder.parse());
	}
}
