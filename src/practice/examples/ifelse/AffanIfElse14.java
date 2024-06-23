//If Else Practice
//Problem 14:
//Take a number as input and print the corresponding day of the week.


package javaTutorials;

import java.util.Scanner;

public class AffanIfElse14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		          if(no==1) {
			    System.out.println("Monday");
		    }else if(no==2) {
				System.out.println("Tuesday");
			}else if(no==3) {
				System.out.println("Wednesday");
			}else if(no==4) {
				System.out.println("Thursday");
			}else if(no==5) {
				System.out.println("Friday");
			}else if(no==6) {
				System.out.println("Saturday");
			}else if(no==7) {
				System.out.println("Sunday");
			}else {
				System.out.println("Enter a valid no.");
			}
	}

}
