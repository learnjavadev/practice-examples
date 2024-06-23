//3_NonPrimitiveDataTypePractice
//Problem 2:
//Problem 2:
//Create a class named IntArrayExample. 
//In the main function, define an array of integers with a size of 4. 
//Assign 4 integer values to this array, and print each value on a new line using the format: "array index=<index>, value stored=<actualValue>".

package javaTutorials;

public class IntArrayExample {

	public static void main(String[] args) {
		
         int[] arr = new int[4];
         
         arr[0] = 1;
         arr[1] = 11;
         arr[2] = 111;
         arr[3] = 1111;
         
         System.out.println("array[0], value stored= "+arr[0]);
         System.out.println("array[1], value stored= "+arr[1]);
         System.out.println("array[2], value stored= "+arr[2]);
         System.out.println("array[3], value stored= "+arr[3]);
         
		
	}

}
