package practice.example.breakkeyword.continuekeyword;

public class ContinueExample1 {

	public static void main(String[] args) {
		String[] names = {"ali","usman","umar","abubakar"};
		String nameToFind = "umar";

		for(int temp=0; temp < names.length; temp++) {

			if(nameToFind.equals(names[temp])) {
				// skip
				continue;
			}

			System.out.println("name="+names[temp]+" is present at index="+temp);
		}

		System.out.println("End of the program");
	}

}
