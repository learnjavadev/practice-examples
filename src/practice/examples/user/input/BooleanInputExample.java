import java.util.Scanner;

public class BooleanInputExample {
public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The Boolean Input(True and False):");
	boolean userInput = sc.nextBoolean();
	
	sc.close();
	
	System.out.println("you Entred:"+userInput);
	
	
	
	
    }
}
