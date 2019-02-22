
public trait Duck {
	String speak(){
		return "quack";
	}
	
	}
class QuackMain implements Duck{
	
}
def qd = new QuackMain();
println qd.speak();
		