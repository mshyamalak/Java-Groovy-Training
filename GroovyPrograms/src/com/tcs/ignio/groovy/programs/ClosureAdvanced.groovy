package com.tcs.ignio.groovy.programs

def add = {def a=0, def b=0 -> // closure syntax mutliple parameter
	def result = a.plus b;
	println "$result addition";
	
}
add(10,10)
add();

//closure no arg, only body
def greet ={->println "greet"};
	greet();

// closure no arg , only body, ski arrow
greet ={println "greet"};
greet();
// single parameter
def sayName // implicit arg name:it
//sayName = {def name -> println "$name"};
sayName = { println "$it"};
sayName ("john")

sayName = {println "$it"}
sayName ('john')

////////returing value
def counter;
counter = {return 10; }
println counter;
//without return statement
counter = {10};
println counter()
//// parameter + return

def LikeAction;
LikeAction = {like -> ++like}

println LikeAction(1);
LikeAction={++it}
println LikeAction(1);

//typed parameter
def isodd = {int i->i%2!=0}
println isodd(1)? "odd" : "even"

//without typs
def iseven = {it%2 ==0}
println iseven(10)? "even" : "odd"
/////multi line
def UserInput = {
	println "enter your name"
	def name = it.next()
	println "your sweet name is $name"
}
UserInput(new Scanner(System.in))
///////////////////////////////////////////////
// via variable closure
def hello = {println "hello"};
doIt (hello);
//directly we can pass closure
doIt({println "hai"});

