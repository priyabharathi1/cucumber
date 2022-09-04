package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class ParameterisedTest {
	@Parameters("priyabharathi" )
	
	void logindata(@Optional("abc")String username,String password) {
		
		System.out.println("The usernmae is" + username);
		System.out.println("The password is" + password);
		
	}

}
