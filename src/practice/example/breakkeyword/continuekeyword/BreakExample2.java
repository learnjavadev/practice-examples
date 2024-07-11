package practice.example.breakkeyword.continuekeyword;

public class BreakExample2 {

	public static void main(String[] args) {

		String[] names = {"ali","usman","umar","abubakar"};
		
		for(int temp=0; temp < names.length; temp++) {

			String tempName = names[temp];

			if(tempName.equals("umar")) {
				System.out.println("name ali is present in this array");
				break;
			}


		}
		
		System.out.println("End of the program");
	}

}
