package practice.example.inheritence.method.overriding;

public class OverloadingExampleWIthVariablesOverloading {

	static String name = "CONSTANT";
	
	public static void main(String[] abc) {
		
		System.out.println("name="+name);
		
		method1();
		System.out.println("name="+name);
		
		method2();
		System.out.println("name="+name);
	}
	
	public static void method1() {
		name = "ABC";
	}
	
	public static void method2() {
		name = "XYZ";
	}
}
