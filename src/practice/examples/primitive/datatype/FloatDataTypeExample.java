//2_PrimitiveDataTypePractice
//Problem 4:
//Create a class named FloatDataTypeExample with a main function. 
//In the main function, declare two floating-point numbers and print the addition of them in the format: "Addition of float numbers <number1> and <number2> is = <additionResult>". 
//In some way, print subtraction, multiplication, and division of these two numbers.

package javaTutorials;

public class FloatDataTypeExample {

	public static void main(String[] args) {
		
        float num1 = 6.28f;
		float num2 = 3.14f;
		float add = num1 + num2;
		float sub = num1 - num2;
		float mul = num1 * num2;
		float div = num1 / num2;

		
		System.out.println("Addition of float variables "+num1+" and "+num2+" is = "+add);
		System.out.println("Substraction of float variables "+num1+" and "+num2+" is = "+sub);
		System.out.println("Multiplication of float variables  "+num1+" and "+num2+" is = "+mul);
		System.out.println("Division of float variables "+num1+" and "+num2+" is = "+div);

		
	}

}
