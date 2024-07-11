package practice.example.breakkeyword.continuekeyword;
import java.util.Scanner;

public class BreakExample3 {

	public static void main(String[] args) {
		
		int[] array = {1,3,4,56,34,23,23,56,45,234,32,43,2,6,7,45,34,23,34,2,23,45,99,56,435,23};

		System.out.println("Please enter a number you want find the array:");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		System.out.println("finding "+input+" in array......");
		boolean isNumberPresent = false;
		
		for(int i=0; i < array.length ; i++) {
			if(array[i] == input) {
				System.out.println("index="+i+" value="+array[i]);
				isNumberPresent = true;
				break;
			}
		}
		
		if(!isNumberPresent) {
			System.out.println(input+" is not present in the array");
		}
	}
}
