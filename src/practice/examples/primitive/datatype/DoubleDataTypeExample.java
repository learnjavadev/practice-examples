//2_PrimitiveDataTypePractice
//Problem 5:
//Create a class named DoubleDataTypeExample with a main function. In the main function, declare two floating-point numbers and print the addition of them in the format: "Addition of double data type numbers <number1> and <number2> is = <additionResult>". 
//In some way, print subtraction, multiplication, and division of these two numbers.


package javaTutorials;

public class DoubleDataTypeExample {

	public static void main(String[] args) {
		
        double num1 = 10.2222d;
		double num2 = 5.1111d;
		double add = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;

		
		System.out.println("Addition of double data type numbers "+num1+" and "+num2+" is = "+add);
		System.out.println("Substraction of double data type numbers "+num1+" and "+num2+" is = "+sub);
		System.out.println("Multiplication of double data type numbers  "+num1+" and "+num2+" is = "+mul);
		System.out.println("Division of double data type numbers "+num1+" and "+num2+" is = "+div);
		
		
	}

}
