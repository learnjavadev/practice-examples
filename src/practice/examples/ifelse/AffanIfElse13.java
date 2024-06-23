//If Else Practice
//Problem 13:
//Write a Java program that reads a positive integer and counts the number of digits.

package javaTutorials;
import java.util.Scanner;
public class AffanIfElse13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 0;
		System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	  if(no>0) {
	while(no>0) {
		no /= 10;
		i++;
	}
	System.out.println("Number of digits in given number is "+i);}
	  
	  else {
		System.out.println("ERROR!!!!");
		System.out.println("Please enter positive Integer");
	}
	
	}

}
