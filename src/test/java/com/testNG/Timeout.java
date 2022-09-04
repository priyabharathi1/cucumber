package com.testNG;

import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut=4000)
	  public void test() throws InterruptedException {
		  System.out.println("karthi");
		  System.out.println("priya");
		  
		  Thread.sleep(3000);
		  System.out.println("Adhithi");
	  }

}
