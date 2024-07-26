package practice.example.inheritence.polymprphism;

class Vehicle{
	String engineCapacity;
	String speedometer;
	int noOfWheels;
	String brandName;
	
	public Vehicle() {
		 System.out.println("This is constructor in Vehicle class");
	}
	
	// start
	public void start() {
		System.out.println("Vehicle is starting");
	}
	
	public void stop() {
		System.out.println("Vehicle is stopping");
	}
	
	public void brake() {
		System.out.println("Applying brake..........");
	}
}

class TwoWheeler extends Vehicle{
	
   public TwoWheeler(){
	   System.out.println("This is constructor in TwoWheeler class");
	   noOfWheels = 2;
   }
}

class Hero extends TwoWheeler {
	public Hero() {
		super();
		System.out.println("This is constructor in Hero class");
		brandName = "HERO";
	}
	
	@Override
	public int hashCode() {
		System.out.println("My custom implementation of hashcode method()");
		return super.hashCode();
	}
}

public class InheritenceExample {

	public static void main(String[] args) {
		Vehicle v1 = new Hero();
		Vehicle v2 = new Hero();
//		System.out.println(v.brandName);
//		System.out.println(v.noOfWheels);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());

	}

}
