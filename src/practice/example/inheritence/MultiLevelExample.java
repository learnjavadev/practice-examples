package practice.example.inheritence;

class Vehicle{
	
	public void start() {
		System.out.println("Starting a vehicle");
	}
}

class Car extends Vehicle{
	
	public void steer() {
		System.out.println("Steering a car");
	}
}

class SportsCar extends Car {
	
	public void race() {
		System.out.println("Racing....vooom voooom");
	}
}

class Porsche extends SportsCar{

	public void writeAnEssay() {
		System.out.println("Writing an essay");
	}
}

public class MultiLevelExample {

	public static void main(String[] args) {
		Porsche sc = new Porsche();
		sc.start(); // vehicle 
		sc.steer(); // car
		sc.race(); // sports car
		sc.writeAnEssay();
	}

}
