package practice.examples.encapsulation;

class Student {
	private String name;
	private int rollNo;
	private String stadndard;
	private String bloodGroup;
	
	// constructor
	public Student(String name, int rollNo, String std, String bg) {
		this.name = name;
		this.rollNo = rollNo;
		stadndard = std;
		bloodGroup = bg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStadndard() {
		return stadndard;
	}
	public void setStadndard(String stadndard) {
		this.stadndard = stadndard;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}

public class StudentMain{
	public static void main(String[] args) {
		Student s1 = new Student("Alex", 1, "First year", "B+");
		
		System.out.println(s1.getName());
		System.out.println(s1.getBloodGroup());
		System.out.println(s1.getRollNo());
		System.out.println(s1.getStadndard());
	}
}