package com.testNG;

import org.testng.annotations.Test;

public class DependencyTest {
  @Test
  public void test1() {
	  System.out.println("sanity test");
  }
  @Test(dependsOnMethods = "test1")
  public void test2() {
	  System.out.println("Regression test");
  }
}
