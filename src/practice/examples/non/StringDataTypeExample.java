//3_NonPrimitiveDataTypePractice
//Problem 1:
//Create a class named StringDataTypeExample with a main function. 
//In the main function, declare two string variables and assign them some values.
//Print these values using the format: "String variable <variableName> = <variableValue>". Then, print the concatenation of these two variables, separated by a colon (:).

package javaTutorials;

public class StringDataTypeExample {

	public static void main(String[] args) {
		
		String name1 = "Affan ";
		String name2 = " Shaikh";
		
		System.out.println("String Variable name1 = "+name1);
		System.out.println("String Variable name2 = "+name2);
		
		System.out.println(name1+":"+name2);
		
	}

}
