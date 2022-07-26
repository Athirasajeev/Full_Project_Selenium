package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class AfterEdit extends BaseClass{
	WebDriver driver;
	By dash=By.linkText("Dashboard");
	public AfterEdit(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement toViewDashboard()
	{
		act.explicitWait(driver, driver.findElement(dash), 30);
		return driver.findElement(dash);
	}
	

}
