
public class InterfaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalInterface ani;
		ani = new Tiger();
	
		System.out.println(ani.eats());
		System.out.println(ani.run());
		System.out.println(ani.sleeps());
		
		ani = new Dog();
		System.out.println(ani.eats());
		System.out.println(ani.run());
		System.out.println(ani.sleeps());
		
		ani = new Cat();
		System.out.println(ani.eats());
		System.out.println(ani.run());
		System.out.println(ani.sleeps());
	}

}
