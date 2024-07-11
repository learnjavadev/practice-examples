package practice.example.ternary.operator;

public class TernaryOperatorExample1 {

	public static void main(String[] args) {

		// find lager number among two give numbers
		int a = 10;
		int b = 15;
		int result = 0;

//		// if-else way
//		if(a>b) {
//			result = a;
//		}else {
//			result = b;
//		}
		
		result = a>b ? (a*a) : (b*b);
		
		System.out.println("Lager number is "+result);
	}

}
