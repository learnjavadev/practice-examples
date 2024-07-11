package practice.examples.functions.and.constructors;

public class MethodOverloadingExample07Jul_2024 {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = 40;
//
//		int result = doAddition(a, b, c);
		
//		double temp1 = 3.4d;
//		double temp2 = 5.5d;
//		double result = doAddition(temp1, temp2);
//		System.out.println(result);
		
//		doAddition("abdulhamid", 10, 20);
		doAddition(10, 20, "alex");

	}

	public static void doAddition(int a, int b, String str) {
		System.out.println("Hello "+str+" I am doing addition");
		System.out.println("Addition is="+(a+b));
	}
	
	public static void doAddition(String str, int a, int b) {
		System.out.println("Hello "+str+" I am doing addition");
		System.out.println("Addition is="+(a+b));
	}
	
	// doAddition(10,20)
	// addition 2 int
	public static int doAddition(int a, int b) {
		return a+b;
	}
	
	// addition of 3 int
	public static int doAddition(int a, int b, int c) {
		return a+b+c;
	}

	// addition 2 int
	public static double doAddition(double a, double b) {
		return a+b;
	}
	
	public static void doAddition(String str) {
		System.out.println("Hello "+str+" I am doing addition");
	}
	
	public static void doAddition() {
		System.out.println("Hello  I am doing addition");
	}
}
