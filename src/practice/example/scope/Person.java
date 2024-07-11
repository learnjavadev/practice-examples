package practice.example.scope;

public class Person {

	public String name;
	public int age;
	public void printPersonDetails() {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("---------------------------");
		
	}
	public static void staticFunction() {
		System.out.println("This is static function");
		System.out.println("You don't need an object to call this function");
		System.out.println("It can be called by using ClassName.functionName()");
		
	}

}
