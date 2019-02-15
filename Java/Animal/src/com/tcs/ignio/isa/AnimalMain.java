package com.tcs.ignio.isa;

public class AnimalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tiger tiger = new Tiger();
//		System.out.println(tiger.eat());
		Animal animal=new Tiger();// program to super type
		System.out.println(animal.eat());
		// type casting
		Tiger tiger =(Tiger)animal;
		System.out.println(tiger.hunt());
		

	}

}
