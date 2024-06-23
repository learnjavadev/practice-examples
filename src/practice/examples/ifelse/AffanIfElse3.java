//If Else Practice
//Problem 3:
//Write a program that checks whether a number is negative, positive, or zero.


package javaTutorials;

import java.util.Scanner;

public class AffanIfElse3 {

	public static void main(String[] args) {

		System.out.println("Enter the no. ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Number is Positive");
		}else if(num<0) {
			System.out.println("Number is Negative");	
		}else {
			System.out.println("ZERO");
		}
		
	}

}
