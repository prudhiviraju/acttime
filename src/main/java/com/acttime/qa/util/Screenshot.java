package com.acttime.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	
	WebDriver driver;
	
	public void screenshot(String screenshotname) {
		

		
		try {
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\acttime\\sceernshotimages"+ screenshotname +".png");
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
			System.out.println("the exception is "+ e.getMessage());
			
			
		}
		
	}


}
