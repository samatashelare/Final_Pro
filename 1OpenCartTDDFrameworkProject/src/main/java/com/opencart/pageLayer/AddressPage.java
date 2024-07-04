package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	
	public AddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------obj repo----------
	
	@FindBy(xpath="//a[text()='New Address']")
	private WebElement new_address_btn;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstname_textBox;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastname_textBox;
	
	@FindBy(xpath="//input[@id='input-company']")
	private WebElement comapny_textBox;
	
	@FindBy(xpath="//input[@id='input-address-1']")
	private WebElement address1_textBox;
	
	@FindBy(xpath="//input[@id='input-address-2']")
	private WebElement address2_textBox;
	
	@FindBy(xpath="//input[@id='input-city']")
	private WebElement city_textBox;
	
	@FindBy(xpath="//input[@id='input-postcode']")
	private WebElement passcode_textBox;
	
	@FindBy(xpath="//select[@id='input-country']")
	private WebElement country_dropdown;
	
	@FindBy(xpath="//select[@id='input-zone']")
	private WebElement state_dropdown;
	
	@FindBy(xpath="//input[@value='0']")
	private WebElement default_address_radioBtn;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continue_btn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert_success_msg;
	
	@FindBy(xpath="(//a[contains(text(),'Delete')])[1]")
	private WebElement default_address_delete_btn;
	
	@FindBy(xpath="(//a[contains(text(),'Delete')])[2]")
	private WebElement success_delete_btn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement deleted_address_success_msg;
	
	@FindBy(xpath="//div[@class='alert alert-warning']")
	private WebElement default_address_deleted_warning_msg;
	
	@FindBy(xpath="(//a[contains(text(),'Edit')])[1]")
	private WebElement edit_btn;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement edit_address_success_msg;
	
	//------------Action method----------
	
	public void clickOnNewAddressBtn()
	{
		new_address_btn.click();
	}
	
	public void enterFirstName(String firstname)
	{
		firstname_textBox.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
		lastname_textBox.sendKeys(lastname);
	}
	public void enterCompany(String company)
	{
		comapny_textBox.sendKeys(company);
	}
	public void enterAddress1(String address1)
	{
		address1_textBox.sendKeys(address1);
	}
	public void enterAddress2(String address2)
	{
		address2_textBox.sendKeys(address2);
	}
	public void enterCity(String city)
	{
		city_textBox.sendKeys(city);
	}
	public void enterPostCode(String postcode)
	{
		passcode_textBox.sendKeys(postcode);
	}
	public void selectCountry(String country)
	{
		WebElement country_name = country_dropdown;
		Select s=new Select(country_name);
		s.selectByVisibleText(country);
	}
	public void selectState(String state)
	{
		WebElement state_name = state_dropdown;
		Select s=new Select(state_name);
		s.selectByVisibleText(state);
	}
	
	public void selectDefaultAddress()
	{
		default_address_radioBtn.click();
	}
	public void clickOnContinue()
	{
		continue_btn.click();
	}
	
	//----------alert msg
	
	public String alertAddressAddedSuccessMsg()
	{
		String address_added_msg = alert_success_msg.getText();
		return address_added_msg;
	}
	
	public void clickOnDeleteBtn_fordeleting_address()
	{
		success_delete_btn.click();
	}
	public void clickOnDeleteBtn_for_deleting_existing_address()
	{
		default_address_delete_btn.click();
	}
	public void deleteAddressConfirmationAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	public String addressDeletedalertMsg()
	{
		String address_deleted = deleted_address_success_msg.getText();
		return address_deleted;
	}
	public String defaultAddressWarningMsg()
	{
		String address_deleted = default_address_deleted_warning_msg.getText();
		return address_deleted;
	}
	public void clickOnEditBtn()
	{
		edit_btn.click();
	}
	public String addressEditedSucessMsg()
	{
		String edit_address_alertmsg=edit_address_success_msg.getText();
		return edit_address_alertmsg;
	}
}
