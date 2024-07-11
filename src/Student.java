
public class Student {

	String name;
	int rollNo;
	String bloodGroup;
	String course;

	public void printStudentDetails() {
		System.out.println("Name="+name);
		System.out.println("Roll number="+rollNo);
		System.out.println("Blood Group="+bloodGroup);
		System.out.println("Course="+ course);
		
		System.out.println();
		System.out.println();
	}
}

class StudentMainClass2{
	
	public static void main(String[] args) {
		System.out.println("this is StudentMainClass2");
	}
}
