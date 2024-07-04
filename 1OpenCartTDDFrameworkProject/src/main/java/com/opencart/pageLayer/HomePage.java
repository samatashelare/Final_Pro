package com.opencart.pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

//------------------obj repo -------------------
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myacc_link;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login_link;
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register_link;
//----------------action method-------------

	public void clickOnMyAccount() {
		handleexplicitwait(myacc_link).click();
// myacc_link.click();
	}

	public void clickOnLogin() {
		handleexplicitwait(login_link).click();
//login_link.click();
	}

	public void clickOnRegister() {
		handleexplicitwait(register_link).click();
//register_link.click();
	}

	private WebElement handleexplicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
}