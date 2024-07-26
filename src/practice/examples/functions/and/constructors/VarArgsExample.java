package practice.examples.functions.and.constructors;

public class VarArgsExample {

	public static void main(String[] args) {
//		System.out.println(doAddition(10, 20));
//		System.out.println(doAddition(10,20,30));
//		System.out.println(doAddition(10,20,30,40));
		
//		System.out.println(doAddition("Alex",1,2,3,4,5,6,7,8,9));
//		System.out.println(doAddition("Lisa",10,20));
		
		printNames("umar");
		printNames("umar", "usman");
		printNames("umar", "usman", "ali");
		printNames("Abubakar","umar", "usman", "ali");
		
		String[] inputArr = new String[4];
		
		inputArr[0] = "Abubakar";
		inputArr[1] = "umar";
		inputArr[2] = "usman";
		inputArr[3] = "ali";
		inputArr[4] = "ABC";
		
		printNamesUsingArray(inputArr);
		
		
	}
	
	// VarArgs variable arguments 
	public static int doAddition(String name, int... ints) {
		int result = 0;
		System.out.println("name="+name);
		
		for(int x : ints) {
			result += x;  // result = result + i;
		}
		
		return result;
	}
	
	public static void printNames(String... names) {

		for(int i=0; i< names.length; i++) {
			System.out.print(names[i]);
			System.out.print(" ");
		}
		
		System.out.println("");
	}
	
	
	public static void printNamesUsingArray(String[] names) {

		for(int i=0; i< names.length; i++) {
			System.out.print(names[i]);
			System.out.print(" ");
		}
		
		System.out.println("");
	}
}
