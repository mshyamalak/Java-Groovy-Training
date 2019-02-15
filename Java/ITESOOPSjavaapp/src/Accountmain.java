import java.util.Scanner;


 class Accountmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		boolean valid;
		System.out.println("enter the account number");
		account.accountNo = scanner.nextInt();
		System.out.println("enter the name");
		account.name=scanner.next();
		System.out.println("enter the initail balance");
		account.balance=scanner.nextDouble();
		do
		{
		System.out.println("how much amount you want to withdraw");
		double amount=scanner.nextDouble();
		String balancestr = account.withdraw(amount);
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
