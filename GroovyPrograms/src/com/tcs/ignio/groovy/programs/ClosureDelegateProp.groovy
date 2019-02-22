package com.tcs.ignio.groovy.programs

def upperCaseClosure = { "$it ${delegate.name.toUpperCase()}"};
class Employe{
	String name;
}
def emp = new Employe(name:'closure')
//i am going to bind emp.name property to upperCaseClosure
//Employee object is going to borrow the closure
upperCaseClosure.delegate=emp;
println "upperCaseClosure delegate is ${upperCaseClosure.delegate}"
println upperCaseClosure("welcome to")

/////////////////////////////////////////////////////////////////////////////////////////////
//Binding method dynamically with help of resolveStrategy

def writer={
	append('hello\n')// append ('hello')
	append('john\n')// append ('john')
	
};
def append(String str){
	"fake append"
}
StringBuilder sb = new StringBuilder();
//i am going to  bind writter's append mthod to StringBuilder object
writer.resolveStrategy = Closure.OWNER_FIRST
writer.delegate =sb;
println writer();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
this.food="wife food";
def selectFood = {"today my food choice is $food"};
class Hotel{
	String food;
}
def hotel = new Hotel(food: 'hotel food');
selectFood.resolveStrategy = Closure.DELEGATE_FIRST;
selectFood.delegate=hotel;
println selectFood()
