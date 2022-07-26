package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class View_Ded extends BaseClass{
	WebDriver driver;
	By dashboard=By.linkText("Dashboard");
	
	public View_Ded(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement isDisplayedDashboard()
	{
		return driver.findElement(dashboard);
	}
	


}
