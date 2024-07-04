package com.opencart.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.testBase.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void verifyLoginTestWithValidDetails()
	{
		HomePage homepage_obj=new HomePage(driver);
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnLogin();
		
		LoginPage loginpage_obj=new LoginPage(driver);
		
		logger.info("navigated to Login page");
		loginpage_obj.enterEmailAddress("cart@gmail.com");
		loginpage_obj.enterPassword("testing@123456");
		loginpage_obj.clickOnLoginBtn();
		logger.info("Logined in successfully");
		
		String expected_result="My Account";
		String actual_result=driver.getTitle();
		System.out.println("actual result is: "+actual_result);
				
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void verifyLoginTestWithInvalidDetails()
	{
		HomePage homepage_obj=new HomePage(driver);
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnLogin();
		
		LoginPage loginpage_obj=new LoginPage(driver);
		logger.info("navigated to Login page");
		loginpage_obj.enterEmailAddress("cart@gmail.com");
		loginpage_obj.enterPassword("testing@1234");
		loginpage_obj.clickOnLoginBtn();
		logger.info("Logined in successfully");
		
		String expected_result="Warning: No match for E-Mail Address and/or Password.";
		String actual_result= loginpage_obj.Errormsg();
		
		Assert.assertEquals(expected_result, actual_result);
	}
	

}
