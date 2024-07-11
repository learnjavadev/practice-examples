package practice.example.breakkeyword.continuekeyword;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {

		System.out.println("Please enter number");
		System.out.println("Please enter 0 to stop");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int number = sc.nextInt();
			System.out.println("input is="+number);
			
			if(number == 0) {
				break;
			}
			
		}
		
		System.out.println("End of the program, user entered 0");
	}

}
