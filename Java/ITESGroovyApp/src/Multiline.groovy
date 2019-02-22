//multiline : java style

def doc = "<html>"+
		  "<head>"+
		  "<title>"+
		  "groovy"+
		  "</title>"+
		  "</head>"+
		  "<body>"+
		  "<h1> welcome </h1>" +
		  "</body></html>"
	println doc;	  	
	
	doc = '''
		 <html>
		  <head>
		  <title>
		  welcome
		  </title>
		  </head>
		  <body>
		  <h1> welcome </h1>
		  </body></html>
''';
println doc
println doc instanceof java.lang.String

doc = """
		 <html>
		  <head>
		  <title>
		  welcome
		  </title>
		  </head>
		  <body>
		  <h1> welcome </h1>
		  </body></html>
""";

println doc
println doc instanceof java.lang.String

def name = "john"
def age = 33

//java

println name + " "+ age+ " years old";

//groovy

println "${name} ${age} years old";
println "$name $age years old"; // shortcut without {}

println "$name $age years old" instanceof groovy.lang.GString;// true

// difference btwn ''' vs """
def id = 1;
def ip = "169.1.2.3";
def mac = "344FGF"
def make = "IBM AX"

//Machine configuration : JSON Representation
// dynamic values
def machineconfigJSON = """
{
  "id" :$id,
  "ip" : "$ip",
  "mac" : "$mac",	
  "make" : "$make"
}		
""";

println machineconfigJSON;
//hardcoded values 
def machineconfigJSON1 = '''
{
  "id" :$id,
  "ip" : "$ip",
  "mac" : "$mac",	
  "make" : "$make"
}		
''';
	println machineconfigJSON1;


















