package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class CreatedTS extends BaseClass {
	WebDriver driver;
	By tstext=By.xpath("//div/h1[contains(.,'TIMESHEET# 10227')]");
	
	public  CreatedTS(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getTextOfTimesheetPage()
	{
		return driver.findElement(tstext);
	}
	

}
