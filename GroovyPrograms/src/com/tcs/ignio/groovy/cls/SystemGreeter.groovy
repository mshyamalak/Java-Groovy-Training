package com.tcs.ignio.groovy.cls

interface Greeter{
	void greet(String name)
}

class SystemGreeter implements Greeter{
	void greet(String name){
		println"$name"
	}
	def shutdown(){
		"system is shuting down"
	}

}
