package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//------------------obj repo-----------
	
	@FindBy(xpath="//a[contains(text(),'Address Book')]")
	private WebElement addressbook_link;
	
	@FindBy(xpath="//div/h1")
	private WebElement acc_success_msg;
	
	
//---------------Action method------------
	
	public void clickOnAddressBook()
	{
		addressbook_link.click();
	}
	
	public String gettingAccSuccessMsg()
	{
		String success_msg=acc_success_msg.getText();
		return success_msg;
	}

}
