
public class StudentMainClass {

	static Student[] studentArray = new Student[4];
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "imran";
		s1.rollNo = 1;
		s1.bloodGroup = "A+";
		s1.course = "JAVA";
		
		Student s2 = new Student();
		s2.name = "rahul";
		s2.rollNo = 2;
		s2.bloodGroup = "O+";
		s2.course = "PYTHON";
		
//		String[] strArray = new String[3];
//		int[]
//	    byte[]
		
		studentArray[0] = s1; // first location = s1
		studentArray[1] = s2; // second location = s2
		
		// find student by roll number
		int roullNumberToFind = 2;
		Student result = findStudentByRollNo(roullNumberToFind);
		if(null != result) {
			result.printStudentDetails();
		}else {
			System.out.println("Student not found");
		}
	}
	
	public static Student findStudentByRollNo(int rollNo) {
		Student foundStudent = null;
		
		for(int i=0; i < studentArray.length; i++) {
			Student tempStudent = studentArray[i];
			
			if(tempStudent != null) {
				if(tempStudent.rollNo == rollNo) {
					foundStudent = tempStudent;
					break;
				}
			}
		}
		
		return foundStudent;
	}
	

}
