
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5;
		long factorial = 1;
		
		for(int i =1;i<=number;i++) {
			
			factorial *= i;
			
			System.out.println(number+"!="+factorial);
			
		}
		

	}

}