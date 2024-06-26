import java.util.Scanner;

public class FractionMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first fractional number:");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter the second fractional number: ");
		double num2 =scanner.nextDouble();
		
		
		scanner.close();
		
		
		double result = num1*num2;
		System.out.println("Result of multiplication:"+result);
		
			
	}

}
