package com.acttime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttime.qa.base.Baseclass;

public class Taskpage extends Baseclass {
	
	@FindBy(xpath = "//div[@class='title ellipsis']")
	WebElement addnewbtn;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	WebElement custbtn;
	
	@FindBy(xpath = "//div[@class='item createNewProject']")
	WebElement projbtn;
	
	@FindBy(xpath= "//div[@class='item createNewTasks']")
	WebElement tasksbtn;
	
	@FindBy(xpath = "//div[@class='item importTasks']")
	WebElement importtaskbtn;
	
	
	public Taskpage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public String pagetitle() {
		return driver.getTitle();
		 
	}
	
	public void addnewbtn() {
		addnewbtn.click();
		
	}
	
	
	public void projectbtn() {
		projbtn.click();
		
	}
	
public void importtaskbtn() {
	importtaskbtn.click();
	
}

public Custpage  custbtn() {
	custbtn.click();
	return new Custpage();
}



}

