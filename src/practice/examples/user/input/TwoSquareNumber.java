import java.util.Scanner;
public class TwoSquareNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The first Number");
		double number1 = sc.nextDouble();
		
		
		System.out.println("enter The second Number");
		double number2 = sc.nextDouble();
		
		double square1= number1*number1;
		double square2 = number2*number2;
		
		System.out.println("Square of"+number1+ "is:"+square1);
		System.out.println("square of"+number2+ "is" +square2);
		
		

	}

}
