package com.tcs.ignio.groovy.programs

trait ServerGreeter{
	String greet(){
		"hello $name"

	}
	abstract String getName() //name - getName
}
// ServerGreeter greet = new ServerGreeter();
//println greet.greet()
ServerGreeter greeter = { ' john ' }
println greeter.greet();
