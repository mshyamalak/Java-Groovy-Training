package com.tcs.ignio.usecase;

public class AbstractTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani;
		ani = new Dog();
		System.out.println(ani.eats());
		System.out.println(ani.save());
		ani = new Tiger();
		System.out.println(ani.eats());
		System.out.println(ani.save());
		

	}

}
