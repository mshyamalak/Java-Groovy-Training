package com.tcs.ignio.groovy.cls

trait SpeakingDuck {
	String speak(){
		quack()
	}

}
class Duck implements SpeakingDuck{
	String methodMissing(String name, args){
		"${name.capitalize()}!"
	}
	
}