package practice.example.ternary.operator;

public class TernaryOperatorExample {

	public static void main(String[] xyz) {

		// max number 
//		int a = 30;
//		int b = 50;
//		int max = 0;
//
//		//		if(a>b) {
//		//			max = a;
//		//		}else {
//		//			max = b;
//		//		}
//		max = a>b ? a : b; 
//
//		System.out.println("Larger numer is "+max);
		
		// find if give number is even or odd
		
//		int num = 2;
//		
//		String result = null;
		
//		
//		if(remainder ==0) {
//			result = "EVEN";
//		}else {
//			result = "ODD";
//		}
		
//		result = (num % 2 ==0) ? "EVEN" : "ODD";
//
//		System.out.println("Numer "+num+" is "+result);
		
		int a = 13;
		
		int result = a >= 0 ? a++ : --a;
		
		System.out.println(result);
		System.out.println(a);
	}

}
