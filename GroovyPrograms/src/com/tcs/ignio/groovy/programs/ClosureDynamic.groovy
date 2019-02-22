package com.tcs.ignio.groovy.programs

def greet = { println "$it" }
//calling
greet('hay') /// ---- greet.call()
greet.call('hello');
println greet instanceof groovy.lang.Closure
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Typed closure ; closure can be typed: closure parameters, return values can be fixed with type
Closure<Boolean> isActive = {status ->
	status 
} 
println isActive(true)

//Functional Programming apis
//curry: partial functions
def log={
	String type ,Date createdOn, String msg ->
	println "$type $createdOn $msg"
};
//log('Info', new Date(), 'the record is deleted ')
//curry
def typeLog = log.curry("info")
//typeLog(new Date(), 'the record is deleted')

//curry
def dateLog = typeLog.curry(new Date());
	dateLog('the record is deleted')
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// left curry : pass from left to right (default)
	def nCopies = {int n, String str -> str*n}
	def twice =nCopies.curry(2)
	println twice('tcs')
///////////////////////////////////////////////////////////////////////////////////////////////////////
///// left curry: pass from left to right
	def threetimes = nCopies.rcurry('tcs')
	println threetimes(3)
////////////////////////////////////////////////////////////////////////////////////////////////////////
	///Index based currying
	//in case a  closure accepts more than 2 paramters 
	// it is possible to set an arbitary paramater using ncurry
def volume ={double l,double w, double h ->l*w*h }
def fixedWidthVolume = volume.ncurry(1,2d,4d)
println fixedWidthVolume(2d)

///////////////////////////////////////////////////////////////////////////////////////////////////////////
///composition
def plus2 ={it +2}
def times3 = {it *3}
def times3plus2 = plus2 << times3
println times3plus2(3)

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//Trampoline: Recursive algorithms are often restricted  by a physical limit: the maximun length 