package com.FacebookSignUp;

import java.time.LocalDate;

public class SignUpPage {
	
	public void openBrowser() {
		
		System.out.println("Opening the Browser");
	}
	
	
	public void getFacebookURL() { //
		
		String strURL = "https://www.facebook.com/";
		System.out.println("URL for Sign Up on Facebook : "+strURL);
	}
	
	public void setFirstname(String strFirstname) {
		
		System.out.println("First Name : "+strFirstname);
	}
	
	public void setSurname(String strSurname) {
		
		System.out.println("Surname : "+strSurname);
	}
	
	public void setMobileNum(String strMobNo) {
		
		System.out.println("Mobile Number : "+strMobNo);
	}
	
	public void setPassword(String strPass) {
		System.out.println("Password : "+strPass);
	}
	
	
	public void setDOB(LocalDate DOB) {
		
		System.out.println("Date of Birth : "+DOB);
		
	}
	
	public void setGender(String strGender) {
		
		System.out.println("Gender : "+strGender);
	}
	
	
	public void closeBrowser() {
		
		System.out.println("Closing the browser");
	}
	
	
	
	

}
