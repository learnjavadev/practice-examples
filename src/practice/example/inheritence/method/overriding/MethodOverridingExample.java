package practice.example.inheritence.method.overriding;

class Animal{
	public void makeSound() {
		System.out.println("Some generic sound!");
	}
}

class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("woof woof!");
	}
}

class Sheep extends Animal{
	@Override
	public void makeSound() {
		System.out.println("ba ba");
	}
}

class Cat extends Animal{
	
	public void makeSound() {
		System.out.println("meow meow!");
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		
		Animal cat = new Dog();
		doSound(cat);
		
		int s = 10;
		Integer s1 = new Integer(10);
		
	}
	
	public static void doSound(Animal animal) {
		animal.makeSound();
	}
	
	

}
