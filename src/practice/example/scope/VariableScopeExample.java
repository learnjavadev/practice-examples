package practice.example.scope;

public class VariableScopeExample {

	static String name = "global"; // instance variable\
	
	// function declaration
	public static void function1() {
		String name = "local"; // local variable
		System.out.println(name);
	}

	// function declaration
	public static void function2() {
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {

		// function call
//		function1();
//		function1();
//		function2();
//		function1();
		int i = 10;
		for(i=0; i<10 ;i++) {
			System.out.println(i);
		}
		
		System.out.println(i);

	}

}
