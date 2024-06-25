import java.util.Scanner;
public class UserInputExample {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter some value:");
		String userInput = Scanner.nextLine();
		
		System.out.println("You entered:" + userInput);
		Scanner.close();
		
		
		

	}

}
