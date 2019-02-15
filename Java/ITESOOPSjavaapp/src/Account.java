
class Account {
	int accountNo;
	String name;
	double balance;
	
	public Account(){
		
		
		this.accountNo=1;
		this.name="default name";
		this.balance=10000.00;
	}
public Account(int accountNo, String name, double balance){
		
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
	}
	
	// transactions
	public String withdraw(double amount){
		//logic
		balance= balance - amount;
		return "the balance after withdraw " + balance;
	}

}
