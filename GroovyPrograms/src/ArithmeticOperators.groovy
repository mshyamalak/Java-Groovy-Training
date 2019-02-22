import java.util.regex.Matcher


// arithmetic operators
def (a,b)=[10,10];
def c =a+b;
def add =a.plus b;
def min=a.minus b;
def div=a.div b;
def mul=a.multiply b;
def pow = a**b;
def powres=a.power b;
println "add $c"
println "minus $min"
println "divide $div"
println "mutliply $mul"
println "power $pow"
println "powerresult $powres"

//relational operators similar to java

def i=10;
def j=10;
println i==j;
println i>j;
println i<j;

//logical operators
 def isActive = true
 def isEnabled = true
 println "&& = " + isActive&&isEnabled; //true
 println "|| = " + isActive||isEnabled; //true
 println "! = " +!isEnabled; //false
 
 def name = "fdbfds" //true
 def city = "jfkdjgkfsg" // true
 println name&&city; 
 
 def start =0; // false
 def stop =10;// true
 println start || stop; //true
 
 def isEmpty; //false
 println !isEmpty; //true

 //ternary operator
 
 //elvis operator - used for default value
 def counter;
 println counter ?: 1;
 
 //Regualr expression
 
 def text = "mytext"
 def matcher = (text =~/\d+/);
 println matcher instanceof Matcher
 
 def mynum = "1 hai";
 def numfound = (mynum ==~/\d+/)
 println numfound? "number found" : "no not found";
 
 


