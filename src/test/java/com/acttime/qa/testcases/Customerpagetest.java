package com.acttime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.acttime.qa.base.Baseclass;
import com.acttime.qa.pages.Homepage;
import com.acttime.qa.pages.Loginpage;
import com.acttime.qa.pages.Taskpage;




public class Customerpagetest extends Baseclass {


	public Customerpagetest() {
		super();
	}
	@Test
	public void customerpage() {
		intialize("chrome");
		Loginpage login = new Loginpage();
		login.login(pro.getProperty("Username"),pro.getProperty("Password"));
		Homepage home = new Homepage();
		home.clickontaskbtn();			
		Taskpage task = new Taskpage();
		task.addnewbtn();
		String actual = task.pagetitle();
		Assert.assertEquals(actual, "actiTIME - Task List");
		task.custbtn();
		driver.close();
	}
	
}
