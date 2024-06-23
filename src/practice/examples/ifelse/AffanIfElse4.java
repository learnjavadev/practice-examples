//If Else Practice
//Problem 4:
//Write a Java program that checks if a given integer is a multiple of 5.

package javaTutorials;

import java.util.Scanner;

public class AffanIfElse4 {

	public static void main(String[] args) {
		System.out.println("Enter the no. ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%5==0) {
			System.out.println("The no is Multiple of 5");
		}else {
			System.out.println("The no  is NOT the Multiple of 5");
		}
	}

}
