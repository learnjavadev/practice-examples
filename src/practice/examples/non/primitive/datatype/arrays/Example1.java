package practice.examples.non.primitive.datatype.arrays;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		
		String[] arr = {"umar", "maaz", "usman"};
		
//		// simple for loop
//		for(int i=0; i< arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// advanced for loop
		for(String name: arr) {
			System.out.println(name);
		}
		
		Arrays.asList(arr).forEach(name -> System.err.println(name));
		
	}

}
