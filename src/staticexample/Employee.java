package staticexample;

public class Employee {

	// fileds
	// pi = 3.14; 
	final double pi = 3.14;
	private String name;
	private int age;
	public static final String comanyName = "infosys";	
	
	static public void displayCompanyInformation() {
		System.out.println("This is Infosys, headquarted in Pune");
		System.out.println("IT servcice company");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
