//If Else Practice
//Problem 1:
//Write a program that takes two numbers as input from the console and prints the larger number.


package javaTutorials;
import java.util.Scanner;
public class AffanIfElse1 {

	public static void main(String[] args) {
		

		System.out.println("Enter no. 1 ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("Enter no. 2 ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Larger No is "+num1);
		}else {
			System.out.println("Larger No is "+num2);	
		}
		
		
	}

}
