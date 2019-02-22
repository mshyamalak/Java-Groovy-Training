
import java.util.regex.Matcher
import java.util.regex.Pattern

public class RegularExpression{
	public static void main(String[] args){
		println "regular expression - java implementation"
		String regex= "\\d+"; 
		String input = "hey | hello 0 1, how subramanian , 7m3";
		Matcher digitMatcher = Pattern.compile(regex).matcher(input);
		while(digitMatcher.find()){
			println(digitMatcher.group());
		}
		
	}
}
//Regular expression in Groovy
//step 1: declare input string
String input = "hey | hello 0 1, how subramanian , 7m3";
//Step 2: declare string slashy string
//String regex = /\d+/
//step 3 : compile
//String regex = ~/\d+/;
//step 4: compile and match
def matcher = (inputString =~/\d+/)
while(matcher.find()){
	println(matcher.group());
}