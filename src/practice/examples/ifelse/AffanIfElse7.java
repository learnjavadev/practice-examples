
//If Else Practice
//Problem 7:
//Write a program that takes a number as input from the console and checks if it is fully divisible by 2.

package javaTutorials;

import java.util.Scanner;

public class AffanIfElse7 {

	public static void main(String[] args) {
		
		System.out.println("Enter the no. ");
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		  if(num%2==0) {
		    	System.out.println("Number is Fully divisible by 2");
		    }else {
		    	System.out.println("Number is not divisible by 2");
		    }
	}

}
