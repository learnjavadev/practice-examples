//4_UserInputPractice
//Problem 5:
//Create a class with a main() function that takes two numbers as input from the user and prints the result of their division to the console.

package javaTutorials;

import java.util.Scanner;

public class UserInputEx5 {

	public static void main(String[] args) {

		System.out.println("Enter the Dividend : ");
		Scanner sc = new Scanner(System.in);
		int divnd = sc.nextInt();
		System.out.println("Enter the Divisor : ");
		int divsr = sc.nextInt();
		
		float DIV = divnd / divsr;
		System.out.println("***DIVISION***");
		
		System.out.println(divnd+ " / "+divsr+ " = "+DIV);
	}

}
