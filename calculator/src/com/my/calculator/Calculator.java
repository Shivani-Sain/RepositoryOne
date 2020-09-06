package com.my.calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the two input number");
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("enter the action to be performed ");
		String action = s.next();
		if(action.equalsIgnoreCase("+")) {
			addition(x,y);
		}else if(action.equalsIgnoreCase("-")) {
			subtraction(x,y);
		}else if(action.equalsIgnoreCase("*")) {
			multiplication(x,y);
		}else if(action.equalsIgnoreCase("/")) {
			division(x,y);
		}else{
			System.out.println("wrong input");
		}
	}

	private static void division(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("division of two numbers is:"+(x/y));
	}

	private static void multiplication(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("multiplication of numbers is:"+(x*y));
	}

	private static void subtraction(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("subtraction of numbers is:"+ (x-y));
	}

	private static void addition(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("addition of numbers is:"+(x+y));
	}
}
