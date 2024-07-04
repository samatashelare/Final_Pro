package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//------------------obj repo----------
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstname_textBox;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastname_textBox;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email_textBox;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone_textBox;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password_textBox;
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmpass_textbox;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacypolice_checkBox;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continue_btn;
	@FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
	private WebElement email_error_msg;
	@FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
	private WebElement confirm_pass_error_msg;
	@FindBy(xpath = "//div/h1")
	private WebElement accSuccessMsg;

//-----------Action method----------
	public void enterFirstName(String firstname) {
		firstname_textBox.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		lastname_textBox.sendKeys(lastname);
	}

	public void enterEmail(String email) {
		email_textBox.sendKeys(email);
	}

	public void enterTelephone(String telephone) {
		telephone_textBox.sendKeys(telephone);
	}

	public void enterPassword(String pass) {
		password_textBox.sendKeys(pass);
	}

	public void enterConfirmPassword(String confirmpass) {
		confirmpass_textbox.sendKeys(confirmpass);
	}

	public void clickOnPrivacyCheckbox() {
		privacypolice_checkBox.click();
	}

	public void clickOnContinueBtn() {
		continue_btn.click();
	}

//--------------errormsg
	public String gettingEmailError() {
		String email_errormsg = email_error_msg.getText();
		return email_errormsg;
	}

	public String gettingConfirmPassErrorMsg() {
		String pass_error_msg = confirm_pass_error_msg.getText();
		return pass_error_msg;
	}

	public String gettingAccSuccessMsg() {
		String acc_succ_msg = accSuccessMsg.getText();
		return acc_succ_msg;
	}

}