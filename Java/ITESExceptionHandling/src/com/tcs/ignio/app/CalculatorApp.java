package com.tcs.ignio.app;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		System.out.println(c.divide(a, b));
	}

}
