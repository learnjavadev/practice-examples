//If Else Practice
//Problem 6:
//Write a program that checks whether a number is even or odd.


package javaTutorials;

import java.util.Scanner;

public class AffanIfElse6 {

	public static void main(String[] args) {
		
		System.out.println("Enter the no. ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
    if(num%2==0) {
    	System.out.println("Number is Even");
    }else {
    	System.out.println("Number is Odd");
    }
	}

}
