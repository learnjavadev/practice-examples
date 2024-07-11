package practice.examples.forloop;

public class NestedForLoopExample1 {

	public static void main(String[] args) {
		
		//*    
		//**   
		//***  
		//**** 
		//*****
//		for(int i=1; i <= 3 ; i++) {
//			for(int j=1; j <= 3 ;j++) {
//				System.out.print(i*j+" ");
//			}
//		}
		/*
		 * this is multiline comment
		 * comment1
		 * comment2
		 * 
		 */
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
