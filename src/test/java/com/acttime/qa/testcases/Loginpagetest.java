package com.acttime.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.acttime.qa.base.Baseclass;
import com.acttime.qa.pages.Homepage;
import com.acttime.qa.pages.Loginpage;

public class Loginpagetest extends Baseclass{

	Loginpage loginpage;
	Homepage homepage;
	
	
	public Loginpagetest() throws Exception {
		super();
	}
	
	@Test
	public void setup() {
		
	    try {
	    	intialize("chrome");
			Loginpage log = new Loginpage();
			boolean image =log.logodisplayed();	
			String expected =log.verifypagetitle();
			Assert.assertEquals(expected, "actiTIME - Login");
		    log.login(pro.getProperty("Username"),pro.getProperty("Password"));
		    
			Thread.sleep(7000);
		} catch (InterruptedException e) {

			System.out.println("the exception is" + e.getMessage());
		}
		driver.quit();
		
		
	}	
}
