package practice.examples.abstraction;

interface Showable{
	
	void show();
}

interface Scannable{
	
	void scan();
}

interface Printable{
	
	void print();
}

class Device implements Showable, Scannable, Printable{

	@Override
	public void show() {
		System.out.println("Showing something on Display");
	}

	@Override
	public void print() {
		System.out.println("Printing something on paper");
	}

	@Override
	public void scan() {
		System.out.println("Scanning....");
	}
	
}

public class MultipleInheritenceUsingInterfaces {

	public static void main(String[] args) {
		
		Device obj = new Device();
		obj.show();
		obj.print();
		obj.scan();

	}

}
