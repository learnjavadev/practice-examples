//If Else Practice
//Problem 15:
//Take a number as input and check the following conditions:
//If it is positive and a multiple of 3, print "number is positive and multiple of 5".
//If it is greater than 50, print "number is also greater than 50", otherwise print "number is smaller than 50".
//If it is negative, print "number is negative".
//If it is zero, print "number is zero".

package javaTutorials;

import java.util.Scanner;

public class AffanIfElse15 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		if(no>0) {
			if(no%3==0) {
			System.out.println("number is positive and multiple of 5");
			} else {
				System.out.println("number is positive and  NOT multiple of 5");}
			if(no>50) {
				System.out.println("number is also greater than 50");
			} else {
				System.out.println("number is smaller than 50");
			}
		}else if (no<0) {
			System.out.println("number is negative");
		}else {
			System.out.println("number is zero");
		}
		
	}

}
