//3_NonPrimitiveDataTypePractice
//Problem 5:
//Create a class named StringArrayExample. 
//In the main function, define an array of strings with a size of 3. 
//Assign the first string value to index 0 and the second string value to index 2. 
//Print the values of all elements in the array using the format: "array index=<index>, value stored=<actualValue>".

package javaTutorials;

public class StringArrayExample {

	public static void main(String[] args) {
		
		String[] array = new String[3];
		
		array[0] = "Affan";
		array[2] = "Shaikh";
		
		System.out.println("array[0], value stored= "+array[0]);
		System.out.println("array[1], value stored= "+array[1]);
		System.out.println("array[2] value stored= "+array[2]);
		
	}

}
