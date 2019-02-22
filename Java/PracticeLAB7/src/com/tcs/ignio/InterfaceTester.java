package com.tcs.ignio;

public class InterfaceTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable flybehaviour;
		flybehaviour=new Bird();
		System.out.println(flybehaviour.fly());
		
		flybehaviour= new Flight();
		System.out.println(flybehaviour.fly());
		

	}

}
