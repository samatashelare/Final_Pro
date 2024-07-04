package com.opencart.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.opencart.testBase.TestBase;

public class Utilclass extends TestBase{
	
	
	public static void capturedScreenshot(String filename)
	{
		
		try {
			String path="C:\\Users\\Admin\\eclipse-workspace4\\1OpenCartTDDFrameworkProject\\Screenshot\\";
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des=new File(path +filename+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
