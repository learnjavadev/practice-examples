//3_NonPrimitiveDataTypePractice
//Problem 3:
//Create a class named DoubleArrayExample.
//In the main function, define an array of doubles with a size of 3. 
//Assign 2 double values to this array, and print each value on a new line using the format: "array index=<index>, value stored=<actualValue>".

package javaTutorials;

public class DoubleArrayExampl {

	public static void main(String[] args) {
		
		double[] Arr = new double[3];
		Arr[0] = 10.333333d;
		Arr[1] = 20.555555d;
		
		System.out.println("array[0], value stored= "+Arr[0]);
        System.out.println("array[1], value stored= "+Arr[1]);
        System.out.println("array[2], value stored= "+Arr[2]);
		
	}

}
