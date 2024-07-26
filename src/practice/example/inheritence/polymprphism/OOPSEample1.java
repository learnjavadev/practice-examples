package practice.example.inheritence.polymprphism;

class Employee{
	public static int objectCount = 1;
	private int empId;
	private String name;
	
	// constructor
	public Employee() {
		super();
		empId = objectCount++;
		System.out.println("I am a constructor from the Employee class");
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// methods
	public void work() {
		System.out.println("I am an employee and I am working");
	}
}

class Manager extends Employee{
	int teamSize;

	public Manager() {
		System.out.println("I am a constructor from the Manager class");
	}
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	public void manage() {
		System.out.println("I am a manager and I manage team");
	}
}


class Developer extends Employee{
	
	public Developer() {
//		super(); // call constructor from immidiate super class
		System.out.println("I am a constructor from the Developer class");
	}
	
	String programmingLanguage;

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public void work() {
		//super.work(); // super class method
		System.out.println("I am a developer and I do programming");
	}
	
	// overloaded methods
	public void doAppDev() {
		System.out.println("I am doing app developement with "+programmingLanguage);
	}
	
	public void doAppDev(String lang2) {
		System.out.println("I am doing app developement with "+lang2);
	}
	
	public void doAppDev(String lang2, String lang3) {
		System.out.println("I am doing app developement with "+lang2 + " and "+ lang3);
	}
}

class Tester extends Employee{
	
	public Tester() {
		System.out.println("I am a constructor from the Tester class");
	}
	
	String techologies;

	public String getTechologies() {
		return techologies;
	}

	public void setTechologies(String techologies) {
		this.techologies = techologies;
	}
	
	@Override
	public void work() {
		System.out.println("I am a tester and I test the applications");
	}
}

public class OOPSEample1 {

	public static void main(String[] args) {
//
//		Developer dev = new Developer(); // Employee + Developer's specific
//		dev.setEmpId(11);
//		dev.setName("Alex");
//		dev.setProgrammingLanguage("JAVA");
//		
//		dev.work();
		
//		Employee emp = new Employee();
//		emp.work();
		
//		System.out.println("=======================");
//		Developer dev = new Developer();
//		// call to overridden method
//		dev.work();
//		
//		// call to overloaded method
//		dev.doAppDev();
//		dev.doAppDev("JAVA");
//		dev.doAppDev("JAVA", "ReactJS");
		
		
		Employee[] arrayOfEmployees = new Employee[4];
		int index = 0;
		
		Developer dev1 = createDeveloper("Umar", "JAVA");
		Tester test1 = createTester("Usman", "Selenium");
		Manager man1 = createManger("Ali", 2);
		Developer dev2 = createDeveloper("Saima", "PYTHON");
		
		arrayOfEmployees[index++] = dev1;
		arrayOfEmployees[index++] = dev2;
		arrayOfEmployees[index++] = test1;
		arrayOfEmployees[index++] =man1;
		
		printEmployeeDetails(arrayOfEmployees);
		
		
		
	}

	private static Developer createDeveloper(String name, String lang) {
		Developer dev1 = new Developer();
		dev1.setName(name);
		dev1.setProgrammingLanguage(lang);
		return dev1;
	}
	
	private static Tester createTester(String name, String tech) {
		Tester tester = new Tester();
		tester.setName(name);
		tester.setTechologies(tech);
		return tester;
	}
	
	private static Manager createManger(String name, int teamSize) {
		Manager manager = new Manager();
		manager.setName(name);
		manager.setTeamSize(teamSize);
		return manager;
	}

	public static void printEmployeeDetails(Employee[] empArry) {
		
		for(Employee emp: empArry) { // advanced for loop
			
			if(emp instanceof Developer) {
				// type casting 
				Developer dev = ((Developer)emp);
				
				System.out.println("Developer");
				System.out.println(dev.getEmpId());
				System.out.println(dev.getName());
				System.out.println(dev.getProgrammingLanguage());
				System.out.println(".........................................");
			}else if(emp instanceof Tester) {
				
				Tester tester = (Tester)emp;
				System.out.println("Tester");
				System.out.println(tester.getEmpId());
				System.out.println(tester.getName());
				System.out.println(tester.getTechologies());
				System.out.println(".........................................");
			}else {
				Manager manager = (Manager)emp;
				System.out.println("Manager");
				System.out.println(manager.getEmpId());
				System.out.println(manager.getName());
				System.out.println(manager.getTeamSize());
				System.out.println(".........................................");
			}
		}
	}
}
