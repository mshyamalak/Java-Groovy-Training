boolean isEnabled =true;
if(isEnabled){
	println "enabled"
}else{
	println "disabled";
	}
	//short cut to if
	isEnabled ? println ("enabled") : println ("disabled");
	
	boolean isBig = 10>1;
	if(isBig)
	{
		println "big"
	}else {
		println "small"
	}
	isBig ? println ("big") : println ("small");
	//truthy or falsy value
	def name = "john"
	if (name){
		println "hey $name"
	}else {
		println "sorry no name"
	}
	
	def count =10;
	def result = count ? "you have counter" : "you have no counter";
	println result
	
	def customer = null
	def a = customer ? "customer found" : "customer not found"
	println a;
	
	def code =(byte) 20
	println code instanceof Byte
	
	def i=100 as short;
	println i instanceof Short
	
	println " decimal value"
	def var = 96.25
	println "is double ${var instanceof Double}"
	println "is float ${var instanceof Float}"
	println "is BigDecimal ${var instanceof BigDecimal}"
	
	// FLOAT Representation
	def fvalue = var as float;
	def fvalue1= 10.54f;
	println "is float ${fvalue instanceof Float}"
	println "is float ${fvalue1 instanceof Float}"
	def fvalue2= 10.54d;
	println "is double${fvalue2 instanceof Double}"
	
	//equals and ==
	//def x=y=100;
	//== compare values//equals compare type of objects
	
	def x = 100 as Byte;
	def y = 100;
	def res = (x==y)? "equal" : "not equal"
	def r = x.equals(y) ? "equal" : "not equal"
	println res
	println r
	
	
	
	