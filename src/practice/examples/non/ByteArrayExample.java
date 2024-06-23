//3_NonPrimitiveDataTypePractice
//Problem 4:
//Create a class named ByteArrayExample. 
//In the main function, define an array of integers with a size of 3. 
//Assign 1 byte value to this array, and print each value on a new line using the format: "array index=<index>, value stored=<actualValue>".

package javaTutorials;

public class ByteArrayExample {

	public static void main(String[] args) {
		
		byte[] ARR = new byte[3];
		
		ARR[0]=111;
	
		System.out.println("array[0], value stored= "+ARR[0]);
		System.out.println("array[0], value stored= "+ARR[1]);
		System.out.println("array[0], value stored= "+ARR[2]);

	}

}
