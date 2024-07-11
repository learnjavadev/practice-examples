package example.inheritence.practice;

// super class or base class
class Animal{
	String name;

	public void eat() {
		System.out.println("This is method defined in Animal class");
		System.out.println("The animal is eating");
	}
	
	public void findNameOfTheAnimal() {
		System.out.println("Name="+name);
	}
}

// subclass or derived class
class Dog extends Animal{
	
	public void bark() {
		System.out.println("woof woof");
	}
	
	public void giveSomeNameToDog(String temp) {
		name = temp;
	}
}


public class AnimalExample {

	public static void main(String[] str) {
		Dog dog = new Dog();
		dog.giveSomeNameToDog("tommy");
		dog.bark();
		
		dog.eat();
		dog.findNameOfTheAnimal();
		
	}
}
