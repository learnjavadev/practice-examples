//4_UserInputPractice
//Problem 7:
//Create a class with a main() function that takes a boolean input as input from the user and print to the console.

package javaTutorials;

import java.util.Scanner;

public class UserInputEx7 {

	public static void main(String[] args) {

		System.out.println("Enter the boolean Data : ");
		
		Scanner sc = new Scanner(System.in);
		boolean input = sc.nextBoolean();
		
		System.out.println("Entered Boolean data is : "+input);
	

	}

}
