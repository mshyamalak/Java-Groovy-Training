


public class MainDate{
	
		def str = "28-02-1992 a b c 15-06-1982 15-apr-1982";
		def matcher =(strString =~(`\d{2}-\d{2}-\d{4}`)) 
			while(matcher.find()){
			println(matcher.group());
		}
		
	}
