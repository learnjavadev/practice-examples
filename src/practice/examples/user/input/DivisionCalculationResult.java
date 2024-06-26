import java.util.Scanner;
public class DivisionCalculationResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The First Number:");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter The Second Number:");
		double num2 = scanner.nextDouble();
		
		scanner.close();
		
		if(num2 != 0) {
			
		Double result = num1/ num2;
		System.out.println("Division  result of two number is:" +result);
			
		}else {
			
			System.out.println("Division by zero is not allowed");
		}
		
	}

}
