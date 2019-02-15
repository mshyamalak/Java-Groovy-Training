package com.tcs.tra.core;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores=new int [5];
		scores[0] = 44;
		scores[1] = 88;
		scores[2] = 99;
		scores[3] = 59;
		scores[4] = 989;
		int size = scores.length;
		System.out.println("size " + size);
		System.out.println(scores[0]);
		//using loop get the values
		for(int i=0;i<size;i++){
			System.out.println(scores[i]);
		}
		//syntax 2
		double prices[]= {12,234,34,56,77};
		int priceSize = prices.length;
		System.out.println(priceSize);
		System.out.println("prices....");
		for(int i=0;i<priceSize;i++){
			System.out.println(prices[i]);
		}
	}

}
