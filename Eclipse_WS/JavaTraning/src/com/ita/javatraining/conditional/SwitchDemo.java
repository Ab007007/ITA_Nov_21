package com.ita.javatraining.conditional;

public class SwitchDemo {
	public static void main(String[] args) {

		String grade = "A";

		switch (grade) {
			case "A":
				System.out.println("You have got Grade-A");
				break;
			case "B":
				System.out.println("You have got Grade-B");
				break;
			case "C":
				System.out.println("You have got Grade-C");
				break;
			case "D":
				System.out.println("You have got Grade-D");
				break;
				
			default:
				System.out.println("You have got Grade-" + grade + " which is not supported");

		}
	}

}
