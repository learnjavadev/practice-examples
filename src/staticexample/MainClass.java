package staticexample;

public class MainClass {

	public static void main(String[] args) {
		Company company1 = new Company();
		company1.setComanyName("infosys");
		company1.setLocationl("pune");
		company1.contryName = "ABC";
		
		Company company2 = new Company();
		company2.setComanyName("tcs");
		company2.setLocationl("banglore");
		
		System.out.println("Company1 details");
		System.out.println("name="+company1.getComanyName());
		System.out.println("location="+company1.getLocation());
		System.out.println("country="+company1.contryName);

		System.out.println("=======================");
		
		System.out.println("Company2 details");
		System.out.println("name="+company2.getComanyName());
		System.out.println("location="+company2.getLocation());
		System.out.println("country="+company2.contryName);
	}

	public void doSomething() {
		String temp = "";
	}
}
