package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class EnlargedTS extends BaseClass{
	WebDriver driver;
	By text=By.linkText("Dashboard");
	public EnlargedTS(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement isDisplayedDashboard()
	{
		return driver.findElement(text);
	}

}
