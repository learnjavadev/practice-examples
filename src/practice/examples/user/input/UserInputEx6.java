//4_UserInputPractice
//Problem 6:
//Create a class with a main() function that takes two fractional numbers as input from the user and prints the result of their multiplication to the console.

package javaTutorials;

import java.util.Scanner;

public class UserInputEx6 {

	public static void main(String[] args) {

		System.out.println("Enter first number : ");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		System.out.println("Enter second number : ");
		float num2 = sc.nextFloat();
		
		float mul = num1 * num2;
		System.out.println("***MULTIPLICATION***");
		
		System.out.println(num1+ " X "+num2+ " = "+mul);
	}

}
