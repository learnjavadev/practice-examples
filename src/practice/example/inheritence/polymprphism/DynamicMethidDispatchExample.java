package practice.example.inheritence.polymprphism;

class Animal{
	
	public void makeSound() {
		System.out.println("Animal making some generic sound");
	}
}

class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Dog is making woof woof sound");
	}
}

class Cat extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Cat is making meow meow sound");
	}
}
public class DynamicMethidDispatchExample {

	public static void main(String[] args) {
		Animal animal = new Animal();
//		animal.makeSound();
		makeSound(animal);
		
		animal = new Dog();
//		animal.makeSound();
		makeSound(animal);
		
		animal = new Cat();
//		animal.makeSound();
		makeSound(animal);
		
	}
	
	public static void makeSound(Animal animal) {
		animal.makeSound();
	}
	
//	public static void makeSound(Cat cat) {
//		cat.makeSound();
//	}

}
