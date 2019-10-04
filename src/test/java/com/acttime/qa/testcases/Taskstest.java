package com.acttime.qa.testcases;

import org.testng.Assert;

import com.acttime.qa.base.Baseclass;
import com.acttime.qa.pages.Homepage;
import com.acttime.qa.pages.Loginpage;

public class Taskstest extends Baseclass {

	
    Homepage homepage;
	Loginpage loginpage;
	
	public void setup() {
		intialize("chrome");
		loginpage.login(pro.getProperty("Username"), pro.getProperty("Password"));
	    String actual	=homepage.pagetitle();
	    Assert.assertEquals(actual,"actiTIME -  Enter Time-Track");
		homepage.logodisplay();
	    homepage.clickontaskbtn();

		

		
		
	}
	
	
	
	
	
	
	
	
}
