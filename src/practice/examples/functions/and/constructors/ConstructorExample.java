package practice.examples.functions.and.constructors;

class Student{
	String name;
	int rollNo;
	String course;

	// default constructors
	public Student() {
		course = "PYTHON";
	}

	// parameterized constructor
	public Student(int tempRollNo, String tempName) {
		this(); // call to a default constructor
		rollNo = tempRollNo;
		name = tempName;
		//		course = "JAVA";
	}

	// parameterized constructor
	public Student(String tempName) {
		this(); // call to a default constructor
		name = tempName;
	}

	// copy constructor
	public Student(Student s) {
		this();
		name = s.name;
		rollNo = s.rollNo;
	}

	public void printStudentDetails() {
		System.out.println("Name="+name);
		System.out.println("Roll No="+rollNo);
		System.out.println("Course="+course);
		System.out.println("==========================");
	}
}

public class ConstructorExample {

	public static void main(String[] args) {

//		 Student s1 = new Student();
		Student s1 = new Student("Alex"); // creating an object
		s1.printStudentDetails();
		
//		Student s2 = new Student(2, "Lisa");
//		s2.printStudentDetails();
		
		Student original = new Student();
		original.name = "Alex";
		original.rollNo = 1;
		
//		Student copy = original;
//		copy.printStudentDetails();
		
		Student copy = new Student(original);
		copy.printStudentDetails();
	}

}
