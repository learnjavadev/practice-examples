import java.util.Scanner;

public class RectangleSquareCheck {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter the length of the rectangle:");
		int length = sc.nextInt();
		
		System.out.print("Enter the breadth of the rectangle:");
		int breadth = sc.nextInt();
		
		
		if(length == breadth) {
		System.out.println("The  rectangle with length" +length+ " and breadth" +breadth+ "is a square." );
		
	
		
		}else {
			System.out.println("The rectangle with length" +length+ " and breadth" +breadth+ "is not a square.");
			
			}	
	sc.close();
	}
}	