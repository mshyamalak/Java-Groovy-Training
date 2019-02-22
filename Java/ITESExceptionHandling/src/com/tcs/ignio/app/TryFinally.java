package com.tcs.ignio.app;

public class TryFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTransaction bt =new BankTransaction(1000);
		try {
			bt.withdraw(500);
		} catch (BalanceException e) {
		e.printStackTrace();
		}finally {
			System.out.println("program ends");
		}

	}
                                                                                                                                                                        
}
