package practice.examples.functions.and.constructors;

class A{
	public A(){
		System.out.println("This is default constructor of class A");
	}
	
	public void doSomething(){
		System.out.println("doing something");
	}
	
	static {
		int a = 10;
		int b = 20;
		System.out.println("This is static block from class A");
		System.out.println(a+b);
	}
}

public class StatcBlockExample {

	public static void main(String[] args) {

		A a = new A();
		A a2 = new A();
	}

}
