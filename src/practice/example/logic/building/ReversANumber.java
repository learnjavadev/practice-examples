package practice.example.logic.building;

public class ReversANumber {

	public static void main(String[] args) {
		// input = 1234
		// output = 4321

		int input = 895;
		// % remainder
		// / division
		
		System.out.println("Input="+input);
		System.out.println("Output="+reverseANumber(input));
	}

	public static int reverseANumber(int input) {
		int output = 0;
		while(input > 0) {
			int remainder = input % 10;
			output = output * 10 + remainder;
			input = input / 10;
		}
		return output;
	}
}
