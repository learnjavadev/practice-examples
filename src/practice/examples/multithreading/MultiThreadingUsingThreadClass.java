package practice.examples.multithreading;

class StudentDetails{
	
	private int rollNo;
	private String name;

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printStudentDetails() {
		System.out.println("Roll No="+ rollNo + " Name=" + name);
	}
}

public class MultiThreadingUsingThreadClass {

	public static void main(String[] args) {
		
		StudentDetails[] array = new StudentDetails[1000];
		
		
		for(int i=1 ; i <= 1000; i++) {
			StudentDetails s = new StudentDetails();
			s.setRollNo(i);
			array[i-1] = s;
		}
		
		
	}
}
