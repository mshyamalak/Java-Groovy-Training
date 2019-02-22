package com.tcs.ignio.groovy.programs

def productlist = [
	new Product(id:1,name :'A', price : 4545.64),
	new Product(id:1,name :'B', price : 7896.64),
	new Product(id:1,name :'C', price : 1652.64),
	new Product(id:1,name :'D', price : 5411.64),
	new Product(id:1,name :'E', price : 6456.64),
	]
	productlist.each{
		println "$it.id $it.name $it.price"
	}
	/////////////////////////////////////////////////////////
	
	def addItem(item){
		def items=[]//Empty list : falsy
		//println items ? "items " : :no items
		items.add(item)
		items
	}
	for(int i=1;i<=10;i++){
		addItem(i).each {println "$it" };
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	def counters = [1,2,3,4,5,6,7,8]
	println counters instanceof java.util.ArrayList
	// converting list to arry
	def counterArray = counters.toArray();
	println counterArray;
	
	def uniqueNum =  [1,2,3,4,4,5,5,6,1,2];
	//list
	uniqueNum.each{println "#it"};
	//set
	println "set operations"
	def setitems = uniqueNum as Set;
	setitems.each{println "$it"};
	
	////////////////////////////////////////////////////////////////
	// set list array - by default one dimension
	
	// map - dictionary hashtable > key :value
	
	def emptyMap =[:] // empty map
	println emptyMap ? "not empty" : "empty"
	// emp details in map
	def empDetails = [
		id:1,
		name:"john",
		salary : 524521.214
		];
		
		println "${empDetails.id} $empDetails.name $empDetails.salary"
		
//
		empDetails.each{ key, value->
			println "$key - $value"
		}
		def save(key, value){
			def details =[:];
			details.putAt(key, value)
			println "$key $value"
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////		
//// range : which implements list
def range = 0..100;
range.each {println "$it"}

def letters = 'a'..'g'
letters.each {println "$it"}
		

		