package com.payroll.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.BaseClass.BaseClass;

public class ResetPage extends BaseClass{
	WebDriver driver;
	@FindBy(xpath="//img[@src='/payrollapp/images/login-logo.png']")
	WebElement resetlogo;
	public ResetPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement isDisplayedLogo()
	{
		act.explicitWait(driver, resetlogo, 30);
		return resetlogo;
	}

}
