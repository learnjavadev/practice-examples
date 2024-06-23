//2_PrimitiveDataTypePractice
//Problem 3:
//Create a class named IntDataTypeExample with a main function. 
//Declare two integer variables and assign them some values. 
//Print the addition of these two variables in the format: "Addition of <number1> and <number2> is = <addition_result>". 
//Print the subtraction of these two variables in the format: "Subtraction of <number1> and <number2> is = <subtraction_result>". 
//Print the multiplication of these two variables in the format: "Multiplication of <number1> and <number2> is = <multiplication_result>". 
//Print the division of these two variables in the format: "Division of <number1> by <number2> is = <division_result>". 
//Print the remainder of the division of these two variables in the format: "Remainder of the division of <number1> by <number2> is = <remainder_result>".

package javaTutorials;

public class IntDataTypeExample {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("Addition of "+num1+" & "+num2+" is = "+add);
		System.out.println("Substraction of "+num1+" & "+num2+" is = "+sub);
		System.out.println("Multiplication of "+num1+" & "+num2+" is = "+mul);
		System.out.println("Division of "+num1+" by "+num2+" is = "+div);
		System.out.println("Remainder of the division of "+num1+" by "+num2+" is = "+mod);
		
	}

}
