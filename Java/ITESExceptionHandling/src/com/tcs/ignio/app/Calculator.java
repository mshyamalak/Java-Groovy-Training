package com.tcs.ignio.app;

public class Calculator {
	public double divide(int a , int b){
		double result =0.0;
		try{
			result =a/b;
			
		}catch(ArithmeticException ae){
			System.out.println("something went wrong");
			System.exit(1);
		}
		return result;
	}

	
}
