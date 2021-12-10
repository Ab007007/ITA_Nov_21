package com.ita.javatraining.exception;

public class BalanceInSufficientException extends Exception
{

	public BalanceInSufficientException() {
		System.out.println("your balance is insufficient to make the transaction ");
		// TODO Auto-generated constructor stub
	}
	
	
	public BalanceInSufficientException(double balance) {
		System.out.println("your balance is insufficient to make the transaction, Please try with in  " + balance);
		
	}
}
