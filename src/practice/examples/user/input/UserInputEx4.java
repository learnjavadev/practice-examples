//4_UserInputPractice
//Problem 4:
//Create a class with a main() function that takes two numbers as input from the user and prints the square of each number to the console.


package javaTutorials;

import java.util.Scanner;

public class UserInputEx4 {

	public static void main(String[] args) {
		
		System.out.println("Enter First Number :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number :");
		int num2 = sc.nextInt();
		
		int sqr1 = num1 * num1;
		int sqr2 = num2 * num2;
		
		System.out.println("Square of first no. is : "+sqr1);
		System.out.println("        --------        ");
		System.out.println("Square of second no. is : "+sqr2);
	}

}
