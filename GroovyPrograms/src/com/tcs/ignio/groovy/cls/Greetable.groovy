package com.tcs.ignio.groovy.cls
//interface and Trait
trait Greetable implements InterfaceAndTrait {
	String greeting() { "Hello, ${name()}!" }

}
