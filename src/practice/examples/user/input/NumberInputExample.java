import java.util.Scanner;
public class NumberInputExample {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	
	int inputNumber = sc.nextInt();
	
	System.out.println("you enterd:" +inputNumber);
	sc.close();
		

	}

}
