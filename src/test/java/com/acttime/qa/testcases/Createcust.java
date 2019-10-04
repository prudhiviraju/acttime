package com.acttime.qa.testcases;

import org.testng.annotations.Test;

import com.acttime.qa.base.Baseclass;
import com.acttime.qa.pages.Custpage;
import com.acttime.qa.pages.Homepage;
import com.acttime.qa.pages.Loginpage;
import com.acttime.qa.pages.Taskpage;

public class Createcust extends Baseclass{

	
	
	
	public Createcust() {
		super();
	}
	
	@Test
	public void createcustomer() {
		intialize("chrome");
		Loginpage login = new Loginpage();
		login.login(pro.getProperty("Username"),pro.getProperty("Password"));
		Homepage home = new Homepage();
		home.clickontaskbtn();			
		Taskpage task = new Taskpage();
		task.addnewbtn();
		task.custbtn();
		Custpage cust = new Custpage();
		cust.newname();
		cust.custdesc();
		cust.custbtn();
		driver.close();
		
		
		
		
	}
	
	
}
