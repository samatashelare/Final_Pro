package com.opencart.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	@BeforeTest
	public void start()
	{
		 logger=logger.getLogger("OpenCart Framework");
		 PropertyConfigurator.configure("Log4jfile.properties");
		 logger.info("Framework Execution Started");
	}
	@AfterTest
	public void end()
	{
		logger.info("Framework Execution End");
	}
	
	
	@BeforeMethod
	public void browserSetUp()
	{
		String browser_name="chrome";
		
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser_name.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("enter valid chrome details");
		}
//		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		logger.info("Browser is launching");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("end");
	}

}
