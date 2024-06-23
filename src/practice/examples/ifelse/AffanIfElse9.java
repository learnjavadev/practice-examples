//If Else Practice
//Problem 9:
//A school has the following grading system rules:
//
//Below 25: F
//25 to 45: E
//45 to 50: D
//50 to 60: C
//60 to 80: B
//Above 80: A
//Ask the user to enter marks and print the corresponding grade.


package javaTutorials;

import java.util.Scanner;

public class AffanIfElse9 {

	public static void main(String[] args) {

		System.out.println("Enter the obtained marks : ");
	    Scanner sc =new Scanner(System.in);
	    int input = sc.nextInt();
	    
	    if(input>80) {
	    	System.out.println("A");
	    }else if(60 <= input && input<=80) {
	    	System.out.println("B");
	    }else if(50<=input && input<=60) {
	    	System.out.println("C");
	    }else if(45<=input && input<=50) {
	    	System.out.println("D");
	    }else if(25<=input && input<45) {
	    	System.out.println("E");
	    }else {
	    	System.out.println("F");
	    }
	
	}

}
