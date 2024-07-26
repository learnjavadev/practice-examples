package practice.examples.functions.and.constructors;

public class VarArgsExampleWithEnhancedForLoop {

	public static void main(String[] args) {
//		printNames("umar");
//		printNames("umar", "usman");
//		printNames("umar", "usman", "ali");
//		printNames("Abubakar","umar", "usman", "ali");
		
	  printIndexOfAGivenElementInArray("ali", "Abubakar","umar", "usman", "ali");
		
	}
//	
//	// VarArgs variable arguments 
//	public static void printNames(String... names) {
////
//	
//		int index = 0;
//		do {
//			System.out.print(names[index]);
//			System.out.print(" ");
//			index = index + 1;
//		}while(index < names.length);
//		System.out.println("");
//		
//		System.out.println("===========================================");
//		for(int i=0; i< names.length; i = i+1) {
//			System.out.print(names[i]);
//			System.out.print(" ");
//		}
//		System.out.println("");
//		
//		System.out.println("===========================================");
//		for(String str : names) {
//			System.out.print(str);
//			System.out.print(" ");
//		}
//		
//		System.out.println("");
//	}
	
	public static void printIndexOfAGivenElementInArray(String name, String... array) {
		int index = -1;
		
//		for(int i =0; i< array.length ; i++) {
//			if(array[i].equals(name)) {
//				index = i;
//				break;
//			}
//		}
		
		int i = 0;
		for(String str : array) {
			
			if(str.equals(name)) {
				index = i;
			}
			i++;
		}
		
		System.out.println("Name="+name+" is present at "+ index+" index in the array");
	}
}
