package com.tcs.ignio.obj;

public class Wrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//integer
		System.out.println("max range "+Integer.MAX_VALUE);
		System.out.println("min range "+Integer.MIN_VALUE);
		// create integer object
		Integer one = new Integer(1);
		System.out.println(one.intValue());// object to primitive
		//integer object
		//boxing
		Integer two = 2; // OBJECT o =primitive
		System.out.println(two);
		// unboxing
		int x=two;
		System.out.println(x);
		//integer- primitive double -->vdouble = double
		//double d = two.doubleValue();
		
		String a ="100";
		String b = "300";
		int num = Integer.parseInt(a)*Integer.parseInt(b);
		System.out.println(num);

	}

}
