package com.stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)


public class Stepdefinition {
	
	 @Before
	 public void beforehook(Scenario s) {
		 
		 String name = s.getName();
		 System.out.println(name);
		 
	 }
	 
	 @After
	 public void afterhook(Scenario r) {
		 driver.close();
		 
	 }
	
	public WebDriver driver;
	


	@Given("^to launch the google browser$")
	public void to_launch_the_google_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
	//	WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	System.out.println("Google page is opened");	 
	
	}

	@When("^I enter the google data$")
	public void i_enter_the_google_data() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("java");
	}

	@When("^click google search button$")
	public void click_google_search_button() throws Throwable {
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
	}

	@Then("^it should navigate to google data page$")
	public void it_should_navigate_to_google_data_page() throws Throwable {
		System.out.println("Search data page is opened");
		driver.close();
	}

}
