// If Else Practice
//Problem 8:
//Take the length and breadth of a rectangle as input from the user and check if it is a square.

package javaTutorials;

import java.util.Scanner;

public class AffanIfElse8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length of rectangle : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter breadth of rectangle : ");
		int num2 = sc.nextInt();
		
		
		  if(num1==num2) {
		    	System.out.println("It is a SQUARE");
		    }else {
		    	System.out.println("Its a "+num1+"X"+num2+" Rectangle");
		    }
	}

}
