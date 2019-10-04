package com.acttime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttime.qa.base.Baseclass;

public class Homepage extends Baseclass {

	
	@FindBy(xpath = "//div[@id='logo_aT']")
	WebElement logo;
	
	
	@FindBy(xpath = "//a[@class='content tt']")
	WebElement timetrack;
	
	@FindBy(xpath = "//a[@class='content tasks']")
	WebElement taskbtn;
	
	@FindBy(xpath = "//a[@class='content reports']")
	WebElement report;
	
	@FindBy(xpath = "//a[@class='content selected users']")
	WebElement users;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String pagetitle() {
		return driver.getTitle();
	}
	
	
	public boolean logodisplay() {
		return logo.isDisplayed();
	}
			
	public Taskpage clickontaskbtn() {
		taskbtn.click();
		return new Taskpage();
	}

	
	public Reports clickonreportpage() {
		report.click();
		return new Reports();
	}
	
	
	public Timetracker clickontimetrackerpage() {
		
		timetrack.click();
		return new Timetracker();
	}
	
	
	public Users clickonuser() {
		
		users.click();
		return new Users();
		
	}
	
	
	
	
	
	
	
	
			
	
	
	
	
	
	
}
