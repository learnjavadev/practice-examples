package example.package2;

import example.package1.Person;

public class MainClass {

	public static void main(String[] args) {

		// person 1 details
		Person personObj1 = new Person();
		personObj1.setName("abdulhamid");
		personObj1.setAge(33);
		
		String name = personObj1.getName();
		int age = personObj1.getAge();
		
		System.out.println("Person1 "+name + " "+ age);
		
		// person 2 details
		Person personObj2 = new Person();
		personObj2.setName("imran");
		personObj2.setAge(25);
		String name2 = personObj2.getName();
		int age2 = personObj2.getAge();
		
		System.out.println("Person2 "+name2 + " "+ age2);
	}

}
