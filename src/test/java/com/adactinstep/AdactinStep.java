package com.adactinstep;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStep {

	public static WebDriver driver;

	@Given("To launch the adactin home page")
	public void to_launch_the_adactin_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		System.out.println("the home page is opened");

	}

	@When("I enter username {string}")
	public void i_enter_username(String str) {
		driver.findElement(By.name("username")).sendKeys(str);
	}

	@When("I enter password {string}")
	public void i_enter_password(String string1) {
		driver.findElement(By.name("password")).sendKeys(string1);
	}

	@When("I click login button")
	public void i_click_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("It should navigate to adactin home page")
	public void it_should_navigate_to_adactin_home_page() {
		System.out.println("The page is navigated to home page");
	}

	@Given("User is on the search hotel page")
	public void user_is_on_the_search_hotel_page() {
		System.out.println("Search page");
	}

	@When("Customer selects the location")
	public void customer_selects_the_location() throws InterruptedException {
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(1);
	}

	@When("Customer select the hotel type")
	public void customer_select_the_hotel_type() {
		WebElement htype = driver.findElement(By.id("hotels"));
		Select s1 = new Select(htype);
		s1.selectByIndex(3);
	}

	@When("Customer select room types")
	public void customer_select_room_types() {
		WebElement rtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(rtype);
		s2.selectByIndex(3);
	}

	@When("Customer selects number of rooms")
	public void customer_selects_number_of_rooms() {

		WebElement rnos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(rnos);
		s3.selectByIndex(3);
	}

	@When("Customer selects the check-in and Check out date")
	public void customer_selects_the_check_in_and_check_out_date() {
		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("10/08/2022");
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("11/08/2022");
	}

	@When("Customer selects the Adults per room")
	public void customer_selects_the_adults_per_room() {
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");

	}

	@When("Customer selects the children per room")
	public void customer_selects_the_children_per_room() {
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("1");
	}

	@When("Search button is clicked")
	public void search_button_is_clicked() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("The page is navigated to Select Hotel with details")
	public void the_page_is_navigated_to_select_hotel_with_details() {
		System.out.println("the page is navigated to select hotel page");
	}

	@Given("User is on the select hotel page")
	public void user_is_on_the_select_hotel_page() {
		System.out.println("the booking page opened");
	}

	@When("I clicks the select radio button")
	public void i_clicks_the_select_radio_button() {
		driver.findElement(By.xpath("//input[@type='radio']")).click();
	}

	@When("I clicks the continue button")
	public void i_clicks_the_continue_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The page is navigated to Book a Hotel page")
	public void the_page_is_navigated_to_book_a_hotel_page() {
		System.out.println("the page is navigated to book hotel page");
	}

	@Given("User is on the Book hotel page")
	public void user_is_on_the_book_hotel_page() {
		System.out.println("booking confirmation page");
	}

	@When("Customer checks the details and Enter the first name as {string}")
	public void customer_checks_the_details_and_enter_the_first_name_as(String string) {
		driver.findElement(By.name("first_name")).sendKeys(string);
	}

	@When("Customer enters the last name {string}")
	public void customer_enters_the_last_name(String string) {
		driver.findElement(By.name("last_name")).sendKeys(string);
	}

	@When("Customer enters the billing address as {string}")
	public void customer_enters_the_billing_address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@When("Customer enters the credit card number as {string}")
	public void customer_enters_the_credit_card_number_as(String string) {
		driver.findElement(By.name("cc_num")).sendKeys(string);

	}

	@When("Customer selects the credit card Type")
	public void customer_selects_the_credit_card_type() {
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByValue("VISA");
	}

	@When("Customer selects the expiry date of credit card with Month and Year")
	public void customer_selects_the_expiry_date_of_credit_card_with_month_and_year() {
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(month);
		s7.selectByValue("12");
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByValue("2022");
	}

	@When("Customer Enters the CVV number")
	public void customer_enters_the_cvv_number() {
		driver.findElement(By.name("cc_cvv")).sendKeys("123");
	}

	@When("Book now button is clicked")
	public void book_now_button_is_clicked() {
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
	}

	@Then("The Processing message is displayed and page is navigated to booking confirmation")
	public void the_processing_message_is_displayed_and_page_is_navigated_to_booking_confirmation() {
		System.out.println("page is navigated");
	}

	@Given("Booking confirmation is visible to the user")
	public void booking_confirmation_is_visible_to_the_user() {
		System.out.println("page is visible");
	}

	@When("Customer can verify all the details")
	public void customer_can_verify_all_the_details() throws IOException {
		System.out.println("verified");
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\screensht\\booking.png");
		FileUtils.copyFile(src, des);
	}

	@When("Customer clicks the Logout button")
	public void customer_clicks_the_logout_button() {
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("The Adactin booking page succedfully logged out")
	public void the_adactin_booking_page_succedfully_logged_out() {
		System.out.println("booked sucessfully");
	}

}
