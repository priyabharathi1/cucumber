package com.testNG;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test
	  public void test() {
		  System.out.println("karthi");
	  }
	 
	 @Test(invocationCount=3)
	
	 public void test2() {
		 System.out.println("priya");
	 }
	  @Test
	  public void test1() {
		  System.out.println("kuttima");
	  }
}
