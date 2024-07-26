package practice.examples.abstraction;

interface Vehicle{
	
	double PI = 3.14d;
	
	void start();
	void stop();
	
	default void brake() {
		System.out.println("This is brake() in Vehicle interface");
	}
}

class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("start() implemented by Car class");
	}

	@Override
	public void stop() {
		System.out.println("stop() implemented by Car class");
	}
	
}

public class InterfacesExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle v = new Vehicle(); // cannot instantiate the interface object

		Vehicle v = new Car();
		v.start();
		v.stop();
		v.brake();
//		Vehicle.PI = 10.2;
		System.out.println(Vehicle.PI);
		
	}

}
