package com.tcs.ignio.app;

public class BankApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTransaction bt = new BankTransaction(1000);
		//surround with try catch
		try {
			bt.withdraw(500);
			double result = 10/10;
			String name =null;
			System.out.println(name.toLowerCase());
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // to print complete error msg
			//System.out.println(e.errorMsg);
		}catch (ArithmeticException ae){
			ae.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
//		}catch (BalanceException | ArithmeticException e){ //multicatch expression
//			e.printStackTrace();
		}
		//bt.withdraw(500);
	}

}
