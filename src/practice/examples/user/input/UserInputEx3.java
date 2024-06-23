//4_UserInputPractice
//Problem 3:
//Create a class with a main() function that takes a number as input from the user and prints the square of that number to the console.

package javaTutorials;

import java.util.Scanner;

public class UserInputEx3 {

	public static void main(String[] args) {
		

		System.out.println("Enter the Number : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int square = input * input;
		
		System.out.println("Entered No. is : "+input);
		System.out.println("Square of Entered No. is : "+square);
	}

}
