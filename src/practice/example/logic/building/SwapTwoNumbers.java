package practice.example.logic.building;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// input a = 10 & b = 20
		// output => a = 20 & b = 10;

		int a = 1;
		int b = 2;
		System.out.println("Before swap: a="+a+" b="+b);
		
//		// using a third variable
//		int temp = 0;
//		
//		// swap
//		temp = a;
//		a = b;
//		b = temp;
		
		a = a + b; // a=3  b=2 
		b = a - b; // a=3  b=1
		a = a - b; // a=2  b=1
		
		System.out.println("After swap: a="+a+" b="+b);
	}

}
