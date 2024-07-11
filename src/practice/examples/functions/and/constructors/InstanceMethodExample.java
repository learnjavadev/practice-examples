package practice.examples.functions.and.constructors;

class Person{
	String species;
	String name;
	int age;
	
	public Person() {
		species = "Homo Sapiens";
	}
}

public class InstanceMethodExample {

	public static void main(String[] args) {

		Person p1 = new Person(); // instantiation of class, object creation
//		p1.name = 
//		p1.age = 
		
		System.out.println("Name="+p1.name); 
		System.out.println("Age="+p1.age);
		System.out.println("Species="+p1.species);
		
		System.out.println("=====================");
		
		Person p2 = new Person();
		System.out.println("Name="+p2.name);
		System.out.println("Age="+p2.age);
		System.out.println("Species="+p2.species);
	}
}
