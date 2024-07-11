
public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		
		int result = doAddition(doAddition(a, b), c);
		System.out.println(result);

	}
	
	public static int doAddition(int a, int b) {
		return (a+b);
	}

}
