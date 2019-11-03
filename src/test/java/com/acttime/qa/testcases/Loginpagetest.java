package com.acttime.qa.testcases;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.acttime.qa.base.Baseclass;
import com.acttime.qa.pages.Homepage;
import com.acttime.qa.pages.Loginpage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;

public class Loginpagetest extends Baseclass{

	Loginpage loginpage;
	Homepage homepage;
	
	
	
	private static Logger logger = LogManager.getLogger(Loginpagetest.class);
	
	
	
	public Loginpagetest() throws Exception {
		super();
	}
	
	@Test
	public void setup() {

		
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("./report/newhtmlreport.html");
		com.aventstack.extentreports.ExtentReports extent = new com.aventstack.extentreports.ExtentReports();
		
		extent.attachReporter(htmlreport);
		ExtentTest logger =extent.createTest("logintest");
		
		
		
		logger.log(Status.INFO, "login is done");
	    try {
	    	intialize("chrome");
			Loginpage log = new Loginpage();
			boolean image =log.logodisplayed();	
			String expected =log.verifypagetitle();
			Assert.assertEquals(expected, "actiTIME - Login");
		    log.login(pro.getProperty("Username"),pro.getProperty("Password"));
	
		    logger.log(Status.INFO,"log in done" );
		    
		    
			Thread.sleep(7000);
		} catch (InterruptedException e) {

			System.out.println("the exception is" + e.getMessage());
		}
	    extent.flush();
		driver.quit();
		
		
	}	
}
