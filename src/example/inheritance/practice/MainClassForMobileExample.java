package example.inheritance.practice;

public class MainClassForMobileExample {

	public static void main(String[] args) {
		
//		BasicMobilePhone basicMobilePhone = new BasicMobilePhone();
//		basicMobilePhone.callSomeOne();
		
		
//		basicMobilePhone.takeAPicture();
		
		SuperSmartPhone superSmartPhone = new SuperSmartPhone();
		superSmartPhone.callSomeOne();  // basic
		superSmartPhone.takeAPicture(); // advanced
		superSmartPhone.takeAselfie(); // super-advanced
	}
}
