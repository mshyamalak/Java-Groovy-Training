void print(){
	println "hello java style print method "
}
print();

//with args return values
String printvalue(String name){
	return name;
}
println(printvalue("john"));

 //groovy style

def add(def a, def b){
	return a.plus(b);
}
println add(10,10)
println add(10.5 , 01.5)
println add(20.5f, 10.4f)
println add(10 as byte , 10 as int)

def getMessage(){
	"hello";
	
}
println getMessage();

//method with more body
//groovy method always return whether you return or not. Implicit return statement will be there last line, will be return

def calSal(){
	def basic = 1000 as double;
	def hra = 01110.42 as double;
	def totalsal = basic.plus hra
	"totalsalis $totalsal"
}
println calSal();

 def getDomain (def domain="msn"){
	 domain
}
println getDomain("tcs")
println getDomain()

// i want to take n - number of parameters but i dnot knw in advance how may paramaters i pass : use var...Args

def logger(def ...message){
	message
}
println logger('welcome')
println logger('hai','hello','welcome')

//postional paramaters
def save(String filename, int size, String author){
	"$filename $size $author"
	
}
println save ('customer.txt',10,"ram")
//changing position wil throw error
//println save(3,"test", "ram")

//named parameters: paramater can be passed any order based on name
//java.util.Map-data structure
def delete(Map args, location){
	"$args $location"
}
println delete('tcs',isAllowed:true, author:'ram', filename : 'customer.txt');










