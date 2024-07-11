package practice.examples.forloop;
import java.util.Scanner;

public class FucntionExample1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter two numbers");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int addition = doAddition(a, b);
//		
//		System.out.println("Addition is="+addition);
		
//		System.out.println(doSquare(10));
		
//		double a = 20.5d;
//		double b = 7.2d;
//		double result = doDivision(a, b);
//		System.out.println(result);
		
		String name = "Abdulhamid";
		sayHello(name);

	}

	public static int doAddition(int x, int y) {
		return x + y;
	}
	
	public static int doSquare(int x) {
		return x * x;
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello "+name+" Welcome!");
	}
	
	public static double doDivision(double divisor, double divident) {
		double result = divisor/divident;
		return  result; // 10/2 -> 5    10%2 -> 0
	}
}
