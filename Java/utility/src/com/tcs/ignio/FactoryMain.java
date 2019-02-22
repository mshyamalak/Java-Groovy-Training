package com.tcs.ignio;

public class FactoryMain {
	public static void main(String[] args) {
		Factory factory = Factory.getInstance();
		System.out.println(factory.sayHello());
		////
		JSONBuilder builder = JSONBuilder.build();
		System.out.println(builder.parse());
		double salary = 10000.969;
		System.out.println(Math.round(salary));
	}
}
