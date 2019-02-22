//java style
def quote = "Hi ! How are you? \\ i am fine";
println quote;
def path = "c:\\groovy\\training\\demos";
println path;

//Slashy String Groovy Style
def myquote = /how are you?\i am fine\;/;
println myquote;
def mynewPath = /c:groovy\training\demo\ /;
println mynewPath;

//dollar Slashy
def birthday = "april, 10th"
def dollarSlashy= $/''' 
		hello $name,
		today we are | ${birthday}.
		$ dollar sign
		$$ escaped dollar sign
		\ back slash
		/ forward slash
		$/ escaped forward slash
		$$$/ escaped opening dollar slashy
		$/$$ escaped closing dollar slashy
		''' /$
println dollarSlashy;