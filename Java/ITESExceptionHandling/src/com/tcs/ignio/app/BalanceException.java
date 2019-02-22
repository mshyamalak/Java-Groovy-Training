package com.tcs.ignio.app;

//public class BalanceException extends RuntimeException{ // not recommended
	// adding runtime checked exception will converted into unchecked, JVM will handle the error.
	public class BalanceException extends Exception{  //checked exception
	String errorMsg;
	public  BalanceException(){
		
	}
	public BalanceException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}
	

}
