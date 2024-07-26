package practice.example.scope;

class Employee{
	
	static int countOfEmployee = 0;
	int employeeId;
	String employeeName;
	
	public Employee(){
		countOfEmployee++;
	}
	
	public Employee(int empId, String name){
		countOfEmployee++;
		employeeName = name;
		employeeId = empId;
	}
}


public class StaticVariableExample {

	static String name;
	
	public static void main(String[] args) {
		System.out.println(Employee.countOfEmployee);
		Employee e1 = new Employee(1, "abc");
		
		System.out.println(Employee.countOfEmployee);
		Employee e2 = new Employee(1, "abc");
		System.out.println(Employee.countOfEmployee);
		Employee e3 = new Employee();
		System.out.println(Employee.countOfEmployee);
		
	}
	
	public static void doSomething(int a, int b) {
		String name = "abc";
		System.out.println(name);
	}
	
	public static void doSomethingElse() {
		name = "";
		
	}
}
