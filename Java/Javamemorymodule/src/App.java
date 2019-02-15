
public class App {
	public static void main(String[] args) {
		
		System.out.println(CustomerOne.INFO);
		CustomerOne o1 = new CustomerOne();
		o1.setId(10);
		o1.setname("A");
		System.out.println(Utility.sayhello() + " " + o1.getname());
		CustomerOne o2 = new CustomerOne();
		System.out.println(o2.getId());
		//// random numbers	
		System.out.println("random" + math.random());
		system.out.println("cos "+ Math.cos(10));
	
	}

}

