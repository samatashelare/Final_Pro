package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step2LF {
	WebDriver driver;
	//hooks
	@Before
	public void before(){
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		System.out.println("---------start----");
	}
	 
	@After
	public void endbrowser(){
		driver.quit();
		System.out.println("---------end----");;
	}	
	
	
	
	@Given("user launch a browser with url")
	public void user_launch_a_browser_with_url() {
		System.out.println("browser launched");
	}
	
	@When("user click on login link")
	public void user_click_on_login_link() {
	  driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	}

	@When("user enter the username as {string} and enter the password as {string}")
	public void user_enter_the_username_as_and_enter_the_password_as(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
	@Then("user logged in as {string}")
	public void user_logged_in_as(String expected_result) throws InterruptedException {
		Thread.sleep(4000);
	   String actual_result=driver.findElement(By.xpath("//a[contains(text(),'Welcome test@121')]")).getText();
	   Assert.assertEquals(actual_result, expected_result);
	}
	
	@When("user enter the invalid username as {string} and enter the password as {string}")
	public void user_enter_the_invalid_username_as_and_enter_the_password_as(String invalid_username, String password) throws InterruptedException {
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(invalid_username);
		  driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
	}
	@Then("user get popup and showing as {string}")
	public void user_get_popup_and_showing_as(String expected_result) throws InterruptedException {
		Thread.sleep(4000);
		 String actual_Result =driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		   
		   Assert.assertEquals(actual_Result, expected_result);
	}
	
	@When("user enter the username as {string} and enter the invalid password as {string}")
	public void user_enter_the__username_as_and_enter_the_invalid_password_as(String username, String invalid_pass) throws InterruptedException {
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(invalid_pass);
	}
	@Then("user get popup and showing msg as {string}")
	public void user_get_popup_and_showing_msg_as(String expected_result) throws InterruptedException {
		Thread.sleep(4000);
	   String actual_Result =driver.switchTo().alert().getText();
	   driver.switchTo().alert().accept();
	   
	   Assert.assertEquals(actual_Result, expected_result);
	}
	
//---------------------------contact link ------------
	
	
	@When("user click on contact link")
	public void user_click_on_contact_link() {
	 driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	}
	@When("user enter contact email {string} and name {string} and message {string}")
	public void user_enter_contact_email_and_name_and_message(String email, String name, String msg)  throws InterruptedException {
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys(email);
	 driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys(name);
	 driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys(msg);
	}
	@When("user click on send message button")
	public void user_click_on_send_message_button() {
	  driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
	}
	@Then("user get a popup and shawing msg as {string}")
	public void user_get_a_popup_and_shawing_msg_as(String expected_result) throws InterruptedException {
		Thread.sleep(4000);
	   String actual_Result=driver.switchTo().alert().getText();
	   Assert.assertEquals(actual_Result, expected_result);
	}
}

