import java.util.regex.Matcher
import java.util.regex.Pattern

public class RegexProgram{
	public static void main(String[] args){
		println "regular expression - java implementation"
		String regex = "\\d+";
		String input = "hey | hello 0 1, HOW subramanian , 7m3";
		Matcher digitMatcher = Pattern.compile(regex).matcher(input);
		while(digitMatcher.find()){
			println(digitMatcher.group());
		}
		println "regular expression - java implementation"
		String regex1 = "[^A-z 0-9]";
		Matcher textMatcher = Pattern.compile(regex1).matcher(input);
		while(textMatcher.find()){
			println(textMatcher.group());
		}
	}
}
	