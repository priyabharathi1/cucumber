package com.testNG;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void ArithmeticException() {
		int a = 10;
		System.out.println(a / 0);
	}

}
