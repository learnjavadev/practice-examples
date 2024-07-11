package practice.examples.encapsulation;

class Person{
	private String personName;
	private int age;
	private String panCardNumer;
	private String address;
	
	// setters
	public void setName(String temp) {
		personName = temp;
	}
	
	public void setAge(int temp) {
		age = temp;
	}
	
	// getters
	public String getName() {
		return personName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void printPersonDetails() {
		System.out.println("Name="+personName);
		System.out.println("Age="+age);
		System.out.println("=====================================");
	}
}
