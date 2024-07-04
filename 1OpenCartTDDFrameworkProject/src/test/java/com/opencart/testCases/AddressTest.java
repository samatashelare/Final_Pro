package com.opencart.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.AddressPage;
import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.pageLayer.MyAccountPage;
import com.opencart.testBase.TestBase;

public class AddressTest extends TestBase{
	
	@Test
	public void verifyAddressTestWithValidDetails()
	{
		HomePage homepage_obj=new HomePage(driver);
		LoginPage loginpage_obj=new LoginPage(driver);
		MyAccountPage myaccountpage_obj=new MyAccountPage(driver);
		AddressPage addresspage_obj=new AddressPage(driver);
		
		logger.info("navigated to address page");
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnLogin();
		loginpage_obj.enterEmailAddress("cart@gmail.com");
		loginpage_obj.enterPassword("testing@123456");
		loginpage_obj.clickOnLoginBtn();
		myaccountpage_obj.clickOnAddressBook();
		addresspage_obj.clickOnNewAddressBtn();
		addresspage_obj.enterFirstName("test1");
		addresspage_obj.enterLastName("test2");
		addresspage_obj.enterCompany("wipro");
		addresspage_obj.enterAddress1("abc123");
		addresspage_obj.enterAddress2("abc123");
		addresspage_obj.enterCity("nagpur");
		addresspage_obj.enterPostCode("440015");
		addresspage_obj.selectCountry("India");
		addresspage_obj.selectState("Maharashtra");
		addresspage_obj.selectDefaultAddress();
		addresspage_obj.clickOnContinue();
		logger.info("address is added successfully");
		String expected_result=" Your address has been successfully added";
		String actual_result=addresspage_obj.alertAddressAddedSuccessMsg();
		Assert.assertEquals(actual_result, actual_result);
		
	}
	
	@Test(priority=1)
	public void verifyAddressTestByDeletingExisitngAddress()
	{
		HomePage homepage_obj=new HomePage(driver);
		LoginPage loginpage_obj=new LoginPage(driver);
		MyAccountPage myaccountpage_obj=new MyAccountPage(driver);
		AddressPage addresspage_obj=new AddressPage(driver);
		
		logger.info("navigated to address page");
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnLogin();
		loginpage_obj.enterEmailAddress("cart@gmail.com");
		loginpage_obj.enterPassword("testing@123456");
		loginpage_obj.clickOnLoginBtn();
		myaccountpage_obj.clickOnAddressBook();
		addresspage_obj.clickOnDeleteBtn_for_deleting_existing_address();
		addresspage_obj.deleteAddressConfirmationAlert(driver);
		
		logger.info("deleted existing address");
				
		String expected_result=" Warning: You can not delete your default address!";
		String actual_result=addresspage_obj.defaultAddressWarningMsg();
		Assert.assertEquals(actual_result, actual_result);
		
		
	}
	
	@Test(priority=2)
	public void verifyAddressTestByDeletingNewAddress()
	{
		HomePage homepage_obj=new HomePage(driver);
		LoginPage loginpage_obj=new LoginPage(driver);
		MyAccountPage myaccountpage_obj=new MyAccountPage(driver);
		AddressPage addresspage_obj=new AddressPage(driver);
		
		logger.info("navigated to address page");
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnLogin();
		loginpage_obj.enterEmailAddress("cart@gmail.com");
		loginpage_obj.enterPassword("testing@123456");
		loginpage_obj.clickOnLoginBtn();
		myaccountpage_obj.clickOnAddressBook();
		addresspage_obj.clickOnDeleteBtn_fordeleting_address();
		addresspage_obj.deleteAddressConfirmationAlert(driver);
		logger.info("deleted existing address");
				
		String expected_result=" Warning: You can not delete your default address!";
		String actual_result=addresspage_obj.addressDeletedalertMsg();
		Assert.assertEquals(actual_result, actual_result);
		
		
	}
	
	@Test(priority=3)
	public void verifyAddressTestByeditingExisitngAddress()
	{
		HomePage homepage_obj=new HomePage(driver);
		LoginPage loginpage_obj=new LoginPage(driver);
		MyAccountPage myaccountpage_obj=new MyAccountPage(driver);
		AddressPage addresspage_obj=new AddressPage(driver);
		
		logger.info("navigated to address page");
		homepage_obj.clickOnMyAccount();
		homepage_obj.clickOnLogin();
		loginpage_obj.enterEmailAddress("cart@gmail.com");
		loginpage_obj.enterPassword("testing@123456");
		loginpage_obj.clickOnLoginBtn();
		myaccountpage_obj.clickOnAddressBook();
		addresspage_obj.clickOnEditBtn();
		addresspage_obj.enterCompany("TCS");
		addresspage_obj.clickOnContinue();
		logger.info("edited the existing address");

				
		String expected_result="Your address has been successfully updated";
		String actual_result=addresspage_obj.addressEditedSucessMsg();
		Assert.assertEquals(actual_result, actual_result);
		
		
	}

}
