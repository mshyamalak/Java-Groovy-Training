package com.tcs.ignio.app;

public class BankTransaction {
	private double bal;

	public BankTransaction() {
		
	}

	public BankTransaction(double bal) {
	
		this.bal = bal;
	}
	public void withdraw(double amount)throws BalanceException{
		if (this.bal>amount ){
			this.bal= this.bal - amount;
			System.out.println(amount + "withdrawn and balance is "+ bal);
		} else 
			throw new BalanceException("balance not found");
	}
}
