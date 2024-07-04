package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	/* WebDriver driver;

	    @Given("the user is on the login page")
	    public void the_user_is_on_the_login_page() {
	        driver = new ChromeDriver();
	        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    }

	    @When("the user enters a valid username and password")
	    public void the_user_enters_a_valid_username_and_password() {
	        driver.findElement(By.id("input-email")).sendKeys("your-email@example.com");
	        driver.findElement(By.id("input-password")).sendKeys("your-password");
	        driver.findElement(By.xpath("//input[@value='Login']")).click();
	    }

	    @Then("the user should be redirected to the dashboard")
	    public void the_user_should_be_redirected_to_the_dashboard() {
	        // Implement the validation for redirection
	        System.out.println("Login successful and redirected to the dashboard");
	      //  driver.quit();
	    */
	
	WebDriver driver;
	@Given("launch a browser with url")
	public void launch_a_browser_with_url() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	   
	}
	@When("user enter the valid username")
	public void user_enter_the_valid_username() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	   
	}
	@When("user enter the valid password")
	public void user_enter_the_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}
	@When("click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@Then("user logged in")
	public void user_logged_in() {
		String expected_result="https://www.saucedemo.com/inventory.html";
		
		String actual_Result=driver.getCurrentUrl();
		Assert.assertEquals(actual_Result, expected_result);
	    
	}
	
	@When("user enter the invalid username")
	public void user_enter_the_invalid_username() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
	}
	@Then("user should not logged in")
	public void user_should_not_logged_in() {
	// WebElement a = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]"));
	  String expected_Result="Epic sadface: Sorry, this user has been locked out.";
	  String actual_result=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]")).getText();
	  Assert.assertEquals(actual_result, expected_Result);
	}

}
