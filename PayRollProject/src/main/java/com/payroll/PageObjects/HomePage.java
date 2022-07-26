package com.payroll.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;

public class HomePage extends BaseClass{
	WebDriver driver;
	@FindBy(css=".col-sm-6.page-title")
	WebElement pagetext;
	@FindBy(xpath="//a[@href='/payrollapp/timesheet/index']")
	WebElement timesheettab;
	@FindBy(xpath="//a[@href='/payrollapp/deduction/index']")
	WebElement deductiontab;
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement user_name;
	@FindBy(xpath="//a[@class='logout-btn']")
	WebElement logout;
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement IsTextVisible()
	{
		return pagetext;
	}
	public WebElement ToClickTimesheetTab()
	{
		return timesheettab;
	}
	public WebElement ToClickdeduction()
	{
		act.explicitWait(driver, deductiontab, 30);

		return deductiontab;
	}
	public WebElement ToClickNameOfUser()
	{
		return user_name;
	}
	public WebElement ToLogout()
	{
		return logout;
	}
	
}