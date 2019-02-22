package com.tcs.ignio.groovy.cls

trait Like{
	private int count =0;
	int count(){
		count +=1; count
	}
}

trait TPerson{
	String fname;
	String lname;
}
class SuperMan implements TPerson,Like {

}