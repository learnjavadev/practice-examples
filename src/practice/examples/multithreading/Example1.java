package practice.examples.multithreading;

public class Example1 {

	static int counter = 0;
	public static void main(String[] args) throws InterruptedException {
		
		function1();
		function2();
	}

	public static void function1() throws InterruptedException {
		for(int i= 0; i< 1000; i++) {
			System.out.println("in function1() value of i="+i);
			Thread.sleep(1000);
		}
	}
	
	public static void function2() {
		for(int j= 0; j< 1000; j++) {
			System.out.println("in function2() value of j="+j);
		}
	}
}
