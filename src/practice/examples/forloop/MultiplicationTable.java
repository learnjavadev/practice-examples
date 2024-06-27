import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to display its multiplication table:");
		int number = sc.nextInt();
		
		System.out.println("Multication Table for "+number+":");
		
		for(int i = 0; i<= 10; i++) {
		System.out.println(number+"X"+i+ "="+(number*i));	
			
		}
		
		sc.close();

	}

}
