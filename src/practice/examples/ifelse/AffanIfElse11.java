
//IF Else Practice
//Problem 11:
//Write a program in Java to input 5 numbers from the keyboard and calculate their sum and average.

package javaTutorials;

import java.util.Scanner;

public class AffanIfElse11 {

	public static void main(String[] args) {
		System.out.println("Enter 5 numbers");
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<5;i++) {
			num[i] = sc.nextInt();
		}
		int sum = num[0]+num[1]+num[2]+num[3]+num[4];
		
		int avg = sum/5;
		
		System.out.println("Sum is "+sum);
		
		System.out.println("Average is "+avg);
		
		
		
	}

}
