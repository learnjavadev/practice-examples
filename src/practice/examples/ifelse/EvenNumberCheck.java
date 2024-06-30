import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println(number+" is fully divisible by 2.");
		
			
			}else {
				System.out.println(number+" is not fully divisible by 2.");
			}
			
			
			sc.close();
		}

	}


