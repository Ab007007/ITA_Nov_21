package com.ita.javatraining.conditional;

public class IfElseDemo {

	public static void main(String[] args) {
		int num1 = 20, num2 = 40, num3 = 40;

		if (num1 > num2 && num1 > num3) {
			System.out.println("Number1 is greater " + num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("Number2 is greater " + num2);
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("Number3 is greater " + num3);
		}
		else
		{
			System.out.println("Numbers may be same");
		}

	}
}
