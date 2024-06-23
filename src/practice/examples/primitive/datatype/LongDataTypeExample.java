//2_PrimitiveDataTypePractice
//Problem 6:
//Create a class named LongDataTypeExample with a main function. In the main function, declare two long numbers and print the addition of them in the format: "Addition of long data type numbers <number1> and <number2> is = <additionResult>". 
//In some way, print subtraction, multiplication, and division of these two numbers.

package javaTutorials;

public class LongDataTypeExample {

	public static void main(String[] args) {

		long num1 = 2000000000l;
		long num2 = 1000000000l;
		long add = num1 + num2;
		long sub = num1 - num2;
		long mul = num1 * num2;
		long div = num1 / num2;
	
		
		System.out.println("Addition of long data type numbers "+num1+" & "+num2+" is = "+add);
		System.out.println("Substraction of long data type numbers "+num1+" & "+num2+" is = "+sub);
		System.out.println("Multiplication of long data type numbers "+num1+" & "+num2+" is = "+mul);
		System.out.println("Division of long data type numbers "+num1+" by "+num2+" is = "+div);
	}

}
