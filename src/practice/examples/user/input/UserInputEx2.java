//4_UserInputPractice
//Problem 2:
//Create a class with a main() function that takes a number as input from the user and prints it to the console.

package javaTutorials;

import java.util.Scanner;

public class UserInputEx2 {

	public static void main(String[] args) {


		System.out.println("Enter the Integer Data : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println("Entered No. is : "+input);
	
		
	}

}
