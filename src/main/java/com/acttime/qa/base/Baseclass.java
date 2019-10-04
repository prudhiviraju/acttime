package com.acttime.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.acttime.qa.util.Propertydrivers;
import com.acttime.qa.util.Propertyfile;
import com.acttime.qa.util.Testutil;

public class Baseclass {


	public static WebDriver driver;
	
	public static  Properties pro;
	
	public Baseclass()  {
		
		
		try {
			File file = new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\acttime\\acttimeproperty\\config.property");
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("the exception is "+e.getMessage());
		}		
		
	}
	
	
	
	public void intialize(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (browsername.equalsIgnoreCase("ff")) {
			
			System.setProperty("webdriver.gecko.driver", Propertydrivers.ff);
			driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", Propertydrivers.ie);
			driver = new InternetExplorerDriver();
			
			
		}
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.implicity_wait,TimeUnit.SECONDS);
		driver.get(pro.getProperty("Url"));
		
	}
		

	
	
	
	

}
