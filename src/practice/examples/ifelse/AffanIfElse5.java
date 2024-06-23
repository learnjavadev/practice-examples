//If Else Practice
//Problem 5:
//Take the names and ages of three people as input from the user, determine the oldest and youngest among them, and print the results.


package javaTutorials;

import java.util.Scanner;

public class AffanIfElse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[3];
		String[] age = new String[3];
		
		
		
		System.out.println("Enter the names and age of 3 people : ");
		Scanner sc = new Scanner(System.in);
		
	
         for(int i=0;i<3;i++) {
        	 System.out.println("Enter the name : ");
        	 name[i] = sc.next();
        	 System.out.println("Enter the age: ");
        	 age[i] = sc.next();
        	 
         }
     	System.out.println("=============================================");
         for (int i=0 ;i<3; i++) {
        	 System.out.println("name : "+name[i]);
        	 System.out.println("age: "+age[i]);
         }
         }
         
       

}
