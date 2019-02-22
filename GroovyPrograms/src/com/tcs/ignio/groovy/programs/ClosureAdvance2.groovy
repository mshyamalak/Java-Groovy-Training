package com.tcs.ignio.groovy.programs

//closure as parameter with args
def login(def validate){
	validate('admin', 'admin')
}
login({name,password->println "$name $password"})
////////////////////////////////////////////////////////////////////////////////////////////////////////
//Closure as paramater with args and return
def register(def validate){
	def userInfo = validate('admin','admin');
	println userInfo;
}
register({name,password->"$name $password"})

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//return a closure from a method
/* 
closure must be returned by usin return statement only. the reason is to avoid  confusion of {}
*/
def getInfo(){
	return{ println "info" }
}
def info = getInfo()
info();
//shortcut
getInfo()()
////////////////////////////////////////////////////////////////////////////////////////////////////
// when closure returns : parms, returns
def getMachineInfo(def info){
	return {def newInfo ->
		println "$info $newInfo"
	}
	//return {"$info $it"}
}
getMachineInfo('IBM')('mainframe')
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//closure within closure
def outter = {
	println "outer"
	def inner ={
		println "inner"
		def innerMost = {println "innerMost" }
		innerMost();
	}
	inner()
		}
	outter();
	
	//////////////////////////////////////////////////////////////////////////////////
	//// can i call nestedclosure outside?
	def suite = {
		//println "suite" method 2
		println "$it"
		//def unit = {println "unit"} //method 1
		//return unit				  //method 1
		return {
			//println "unit"; //method 2
			println "$it";
			return { //println "atomic"; // method 2
				println "$it";
			}
		}};
			//def unit =suite(); // method 1
	//unit()();					 //method 1
		//suite()()()  // method 2
	suite ("suite")("unit")("atomic")
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////
//// closure inside a class
	class Shape{
		def getCordinate(){
			return {x,y,z->
				"$x $y $z"
			}
		}
	}
	def s =new Shape()
	def result = s.getCordinate()
	println result(1,2,3)
				
