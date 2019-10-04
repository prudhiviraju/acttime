package com.acttime.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	
	
	Properties pro;
	
	public void property() throws Exception {
		
		
		
		try {
			File file = new File(".acttimeproperty/config.property");
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
			
		} catch (FileNotFoundException e) {
		
		System.out.println("the exception is " + e.getMessage());
		}	
	}

	
	public String getrul() {
		return pro.getProperty("Url");
		
	}
	public String getusername() {
		
		return pro.getProperty("Username");
		
	}

	
	public String getpassword() {
		return pro.getProperty("Password");
	}
}
