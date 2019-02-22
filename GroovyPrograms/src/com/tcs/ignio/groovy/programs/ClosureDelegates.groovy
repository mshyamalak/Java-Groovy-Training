package com.tcs.ignio.groovy.programs
//i want to write utility that must be used on any object
//usecase : i am going to create a closure that going to return a  variable name in uppercase, 
// variable name can be part of any object

//def upperCaseClosure = {"$name.toUppercase()"};
//class Employee {
//	String name;
//}
//def upperCaseClosure = {"this is uppercase closure"}; // for owner
def upperCaseClosure = {"this is uppercase closure $this"};
// list the relationship properties
println "owner = $upperCaseClosure.owner"
println "this = ${upperCaseClosure()} "
println"delegate = $upperCaseClosure.delegate"

class Utility{
	def convertUpperCase(){
		def upperCaseClosure ={ " this is upper case closure $this"};
		println "owner - Inside utility = $upperCaseClosure.owner"
	}
}
new Utility().convertUpperCase()
class Employee {
	String name;
}