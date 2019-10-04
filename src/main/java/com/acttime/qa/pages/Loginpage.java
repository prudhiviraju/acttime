package com.acttime.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttime.qa.base.Baseclass;
import com.acttime.qa.util.Propertyfile;

public class Loginpage extends Baseclass {
	
	
	Propertyfile pro = new Propertyfile();

	//POM
	@FindBy(id="username")
	WebElement username;
	
	
	@FindBy(name="pwd")  
	WebElement password;
	
	@FindBy(id="loginButton")  
	WebElement loginbtn;
		
	@FindBy(id="keepLoggedInCheckBox") 
	WebElement checkbox;
	
	
	@FindBy(id="toPasswordRecoveryPageLink") 
	WebElement forgetlink;
	
	
	
	@FindBy(xpath = "//div[@class='atLogoImg']")
	WebElement logo;
	
	//intializing
	 public Loginpage()  {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String verifypagetitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean logodisplayed() {
		
		return logo.isDisplayed();
		
	}
	
	public Homepage login(String un , String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new Homepage();
		
	}
	
	
	
	
	
}
