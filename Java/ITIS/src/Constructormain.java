
public class Constructormain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(4,2);
		System.out.println("x "+ circle.getX());
		System.out.println("y "+circle.getY());
		
		circle.setX(6);
		circle.setY(9);
		System.out.println("x "+circle.getX());
		System.out.println("y "+circle.getY());
		
		System.out.println(circle.colour());
		
		
	}

}
