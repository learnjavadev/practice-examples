//If Else Practice
//Problem 2:
//Write a program that takes two numbers as input from the console and prints the smaller number.


package javaTutorials;
import java.util.Scanner;
public class AffanIfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Enter no. 1 ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("Enter no. 2 ");
		int num2 = sc.nextInt();
		
		if(num1<num2) {
			System.out.println("Smaller No is "+num1);
		}else {
			System.out.println("Smaller No is "+num2);	
		}
		
	}

}
