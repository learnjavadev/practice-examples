package practice.examples.abstraction;

abstract class Animal{
	
	public void makeSound() {
		System.out.println("Animal making sound");
	}
	
	protected abstract void eat();
	
	
}

class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("This is eat() in Dog class");
	}
	
	@Override
	public void makeSound() {
		System.out.println("woof woof");
	}
}

public class AbstractionExample1 {

	public static void main(String[] args) {
		Animal animal = new Dog();
//		Animal animal = new Animal(); // not possible
		animal.eat();
		animal.makeSound();
	}

}
