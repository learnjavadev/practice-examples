package practice.example.ternary.operator;

public class TernaryOperatorExample2 {

	public static void main(String[] args) {
		// find largest number among 3 numbers
		int x = 10;
		int y = 20;
		int z = 30;
		
		int largNum = 0;
		
		
		largNum = x>y ? (x>z ? x :z) : y>x ? (y>z ? y : z) : z; 
//		
//		largNum = x>y && x>z ? x : (y>x && y>z? y : z);
//		
//		largNum = findLargerNumber(findLargerNumber(x, y),  z);

		System.out.println(largNum);
	}

	private static int findLargerNumber(int a, int b) {
		int max = a>b ? a : b;
		return max;
	}
}
