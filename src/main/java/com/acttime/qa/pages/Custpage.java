package com.acttime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttime.qa.base.Baseclass;

public class Custpage extends Baseclass {
	
	
	@FindBy(xpath = "//input[contains(@class,'newNameField')]")
	WebElement createcust;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,'Enter Customer Description')]")
	WebElement descrption;
	
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]")
	WebElement custbtn;
	
	
	public Custpage() {
		PageFactory.initElements(driver,this);
	
	}
	
	
	public void newname() {
		createcust.sendKeys(pro.getProperty("newname"));
		
	}
	
	public void custdesc() {
		descrption.sendKeys("descrption");
	}
	
	public void custbtn() {
		custbtn.click();
		
		
	}

}
