import java.util.Scanner;

public class SmallerNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter Second Number:");
		double num2 = scanner.nextDouble();
		
		
		if(num1<num2) {
			System.out.println("The smaller number is: "+num1);
			
		}else if(num2<num1) {
			System.out.println("The smaller number is:"+num2);
		}else {
			System.out.println("Both number is equal:");
			
		}
		
		scanner.close();

	}

}
