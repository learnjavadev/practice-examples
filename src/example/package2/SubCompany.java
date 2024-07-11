package example.package2;

import example.package1.Company;

public class SubCompany extends Company {
	public static void main(String[] ast) {
		SubCompany subCompany = new SubCompany();
		subCompany.setAddressPincode(123);
		subCompany.setCompanyName("infosys");
		System.out.println(subCompany.getCompnyName());
		System.out.println(subCompany.getAddressPincode());
	}
}
