import java.util.Scanner;


public class Customermain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		//data initialization : write
//		cust.id =1;
//		cust.firstname ="ram";
//		cust.middlename = "kumar";
//		cust.lastname ="M";
//		cust.gender = 'M';
//		cust.address="chennai";
//		cust.mobileno = "98xxxxx";
//		cust.email = "test@example.com";
//		cust.amount = 1000.98;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter custome id ");
		cust.setId(scanner.nextInt());
		System.out.println("Enter custome Firstname");
		String firstName = scanner.next();
//		cust.setFirstname(scanner.next());
		System.out.println("Enter custome middlename");
		String middleName = scanner.next();
//		cust.setMiddlename(scanner.next());
		System.out.println("Enter custome lastname");
		String lastName = scanner.next();
//		cust.setLastname(scanner.next());
		System.out.println("Enter custome gender");
		cust.setGender(scanner.next().charAt(0));		
		System.out.println("Enter custome address");
		cust.setAddress(scanner.next());
		System.out.println("Enter custome mobilenumber");
		cust.setMobileno(scanner.next());
		System.out.println("Enter custome email");
		cust.setEmail(scanner.next());
		System.out.println("Enter custome amount");
		cust.setAmount(scanner.nextDouble());
		Customer cust1 = new Customer(firstName,middleName,lastName); //constructor
		
		
		//read operation
		System.out.println("ID " + cust.getId());
//		System.out.println("firstname "+ cust.getFirstname());
//		System.out.println("middlename "+ cust.getMiddlename());
//		System.out.println("lastname " + cust.getLastname());
		System.out.println("gender " + cust.getGender());
		System.out.println("address " + cust.getAddress());
		System.out.println("mobileno " + cust.getMobileno());
		System.out.println("email " + cust.getEmail());
		System.out.println("amount "+ cust.getAmount());
		
		

	}

}
