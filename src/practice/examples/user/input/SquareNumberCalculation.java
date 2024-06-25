import java.util.Scanner;
public class SquareNumberCalculation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		double number =sc.nextDouble();
		
		double square = number*number;
		
		System.out.println("square of the number"+number+"is:" +square);
		
		sc.close();
		
		
	}

}
