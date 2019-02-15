import java.util.Scanner;


public class AccountmainConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		boolean valid;
		System.out.println("enter the account number");
		int acc= scanner.nextInt();
		System.out.println("enter the name");
		String nm=scanner.next();
		System.out.println("enter the initail balance");
		double bal=scanner.nextDouble();
		Account account1 = new Account(acc, nm, bal);
		do
		{
		System.out.println("how much amount you want to withdraw");
		double amount=scanner.nextDouble();
		String balancestr = account1.withdraw(amount);
		System.out.println(balancestr);
		System.out.println("do you want to start the transaction");
		String status = scanner.next();
		if(status.equals("yes")){
			valid=true;
		}
		else{ 
			valid=false;
			System.out.println("thank you. Your transaction is completed");
			
		}
		}while(valid);
			
		
		
		
		


	}

}
