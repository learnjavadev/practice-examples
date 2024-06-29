import java.util.Scanner;

public class EvenOddNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = sc.nextInt();
		
		if(number %4 ==0) {
			System.out.println(number+ "is Even.");
			
			}else {
				System.out.println(number+ " is Odd.");
				
				
			}	
             sc.close();
	}

}
