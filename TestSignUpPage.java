package com.FacebookSignUp;


public class TestSignUpPage extends UtilitiesClass {

	public static void main(String[] args) {
		
		UtilitiesClass objUtilitiesClass = new UtilitiesClass();
		
		objUtilitiesClass.openBrowser();

		
		objUtilitiesClass.setFirstname(getFirstname());
		
		objUtilitiesClass.setSurname(getSurname());
		
		objUtilitiesClass.setMobileNum(getMobileNum());
		
		//objUtilitiesClass.setPassword(getPassword(8)); //for dynamic password
		objUtilitiesClass.setPassword("Admin123"); //for static password
		
		objUtilitiesClass.setDOB(getDOB());
		
		objUtilitiesClass.setGender(getGender());
		
		
		
		objUtilitiesClass.closeBrowser();
	}

}
