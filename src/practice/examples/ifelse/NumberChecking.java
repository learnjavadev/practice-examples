import java.util.Scanner;
public class NumberChecking {

	public static void main(String[] args) {
	

				
				System.out.println(" enter a number:");
				
				Scanner sc = new Scanner(System.in);
				
				int number = sc.nextInt();
				
				if(number > 0) {
					
					System.out.println("The positive number");
				}else {
					if(number < 0)  {
						
						System.out.println("The negative number");
					}else {
						System.out.println("The zero number");
					}

				}
			}
		}
	


