package com.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SimpleAnnotation {
  @Test
  public void test() {
	  System.out.println("karthi");
  }
  @Test
  public void test1() {
	  System.out.println("kuttima");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Apple");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Mango");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("carrot");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("beetroot");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("windows");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("linux");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Soccer");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("cricket");
  }

}
