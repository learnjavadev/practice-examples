package example.package1;

import example.package1.Company;

public class MainClass2 {

	public static void main(String[] args) {

		Company company = new Company();
		
//		company.companyName = "infosys";
//		company.addressPincode = 123;
		company.companyName = "anc";
		
		company.setCompanyName("infosys");
		company.setAddressPincode(123);
		
		System.out.println(company.getCompnyName());
		System.out.println(company.getAddressPincode());
	}

}
