package com.FacebookSignUp;

import java.time.LocalDate;
import java.util.Random;

public class UtilitiesClass extends SignUpPage {
	
	
	public static String getFirstname() {
		
		String strFnameArray[] = {"Rahul","Amol","Kiran","Shreyas","Ramesh","Sachin","Santosh"};
		
		String strFirstName = strFnameArray[new Random().nextInt(strFnameArray.length)];
		
		return strFirstName;
	}
	
	public static String getSurname() {
		
		String strLnameArray[] = {"Patil","Deshmukh","Shelar","Kapoor","Thakare","Pawar"};
		
		String strSurname = strLnameArray[new Random().nextInt(strLnameArray.length)];
		
		return strSurname;
	}
	
	public static String getMobileNum() {
		Random objRandom = new Random();

		int intMobileNo;
		String strArray[]=new String [10];

		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo = objRandom.nextInt(10);

			strArray[intNum]=Integer.toString(intMobileNo);
			}
		String strMobNum = "+91 9"+strArray[4]+strArray[8]+strArray[5]+strArray[4]+strArray[5]+strArray[6]+strArray[7]+strArray[8]+strArray[9];
		
		return strMobNum;
	}
	
	
	
	
	public static String getPassword(int intLength) {
		
		String strChars = "0123456789abcdefghijklm";
		Random objRandom = new Random();
		StringBuilder strBuilder = new StringBuilder(intLength);
		
		for(int intCount=0; intCount<intLength; intCount++) {
			strBuilder.append(strChars.charAt(objRandom.nextInt(strChars.length())));
		}
		return strBuilder.toString();
	}
	
		
	
	public static LocalDate getDOB() {
		
		Random objRandom = new Random();
		
		int minDay = (int) LocalDate.of(1980, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2005, 1, 1).toEpochDay();
		long randomDay = minDay + objRandom.nextInt(maxDay - minDay);
		
		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		
		return randomBirthDate;
	}
	
	
			
	public static String getGender() {
		
		String strGender;
		
		if(Math.random() > 0.5) {
			strGender = "MALE";
		}else {
			strGender = "FEMALE";
		}
		
		return strGender;
				
	}

}
