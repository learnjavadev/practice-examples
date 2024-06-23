//If Else Practice
//Problem 12:
//Write a Java program that accepts three numbers and checks if all numbers are equal or not.


package javaTutorials;

import java.util.Scanner;

public class AffanIfElse12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] name = new int[3];
		
		System.out.println("Enter  3 numbers : ");
		Scanner sc = new Scanner(System.in);
		
	
         for(int i=0;i<3;i++) {
        	 System.out.println("Enter the numbers : ");
        	 name[i] = sc.nextInt();
        	
         }
         
         if(name[0]==name[1] && name[1]==name[2]) {
        	 System.out.println("Three nos are EQUAL");
         }else
         {
        	 System.out.println("Three numbers are NOT equal");
         }
        	 
        
        	 
	}

}
