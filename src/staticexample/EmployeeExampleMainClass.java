package staticexample;

public class EmployeeExampleMainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("alex");
		e1.setAge(23);
		
		Employee e2 = new Employee();
		e2.setName("lisa");
		e2.setAge(23);
//		e2.comanyName = "XYZ"; // NOT ALLOWED Because of static final
		
		System.out.println("Employee e1 details");
		System.out.println("Name="+e1.getName());
		System.out.println("Age="+e1.getAge());
		System.out.println("Company Name="+e1.comanyName);
		Employee.displayCompanyInformation();
		
		System.out.println("====================");
		System.out.println("Employee e2 details");
		System.out.println("Name="+e2.getName());
		System.out.println("Age="+e2.getAge());
		System.out.println("Company Name="+Employee.comanyName);
		Employee.displayCompanyInformation();
		
		
	}
}
