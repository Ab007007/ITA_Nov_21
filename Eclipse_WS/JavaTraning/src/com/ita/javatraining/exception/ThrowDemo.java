package com.ita.javatraining.exception;

import java.util.Scanner;

public class ThrowDemo {

	static double balance = 10000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "no";
		do {
			System.out.println("Welcome to account transaction.. Please enter the amount you want to withdraw");
			int amount  = sc.nextInt();
			
			double tempBal = balance - amount;
			
			if(tempBal < 0)
			{
				try {
					throw new BalanceInSufficientException(balance);
				}catch(Exception ex ) {
					System.out.println("ERROR : Transaction failed :\n Your balance is too low " + balance);
				}
			}
			else
			{
				balance = tempBal;
				System.out.println("your transaction is successfull you have " + balance + " left in your account");
			}
		
			System.out.println("do you want to continue ??? yes or no ???");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
	
		
		System.out.println("Thanks for using our Service");
	}

}
