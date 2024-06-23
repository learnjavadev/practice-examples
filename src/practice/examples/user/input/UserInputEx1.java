//4_UserInputPractice
//Problem 1:
//Create a class with a main() function that takes input from the user and prints it to the console.

package javaTutorials;

import java.util.Scanner;

public class UserInputEx1 {

	public static void main(String[] args) {

		System.out.println("Enter the Data : ");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println("Entered data is : "+input);
	}

}
