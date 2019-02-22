package com.tcs.ignio.groovy.programs

//List : ordered collection of elements
//
def names = ["subramanian", "ram", "john", "peter"];
// traditional way
for (def name in names){
	println "$names"
}
//names.each({item->println "$item"})
//simple way
names.each{println "$it"}
//////////////////////////////////////////////////////////////////////////////

