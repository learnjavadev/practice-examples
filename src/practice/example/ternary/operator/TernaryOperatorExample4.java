package practice.example.ternary.operator;

public class TernaryOperatorExample4 {

	public static void main(String[] args) {
		// grade system
		// <35 -> F
		// 35-60 -> A
		// >61 -> A+
		
		
		int marks = 35;
		
		String result = marks > 61 ? "A+" : (marks >= 35  && marks < 61) ? "A": "Fail";
		
		System.out.println(result);

	}

}
