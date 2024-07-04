package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//-------------------obj repo------------
	
	//cart@gmail.com -pass-testing@123456
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email_textBox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password_textBox;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement login_btn;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement errormsg;
	
//---------------Action method-------

   public void enterEmailAddress(String emailaddress)
   {
	   email_textBox.sendKeys(emailaddress);
   }
   public void enterPassword(String password)
   {
	   password_textBox.sendKeys(password);
   }
   
   public void clickOnLoginBtn()
   {
	   login_btn.click();
   }
   
   public String Errormsg()
   {
	   String msg=errormsg.getText();
	   return msg;
   }
	
	
}
