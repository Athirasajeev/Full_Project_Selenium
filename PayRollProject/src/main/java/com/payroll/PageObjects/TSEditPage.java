package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class TSEditPage extends BaseClass {
	WebDriver driver;
	By dash=By.linkText("Dashboard");
	By tsnumber=By.id("timesheet-po_number");
	By save=By.xpath("(//button[@class='btn btn-success'])[2]");
	public TSEditPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement toViewDashboard()
	{
		return driver.findElement(dash);
	}
	public WebElement toViewTimesheet()
	{
		return driver.findElement(tsnumber);
	}
	public WebElement toSave()
	{
		return driver.findElement(save);
	}


}
