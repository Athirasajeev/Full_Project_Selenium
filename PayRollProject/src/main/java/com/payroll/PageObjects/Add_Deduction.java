package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class Add_Deduction extends BaseClass{
	WebDriver driver;
	By worker=By.xpath("//span[@class='select2-selection__placeholder']");
	By type=By.id("deduction-type");
	By amount=By.id("deduction-amount");
	By effective_form=By.cssSelector(".glyphicon.glyphicon-calendar");
	By date=By.xpath("//table/tbody/tr/td[@data-date='1659052800000']");
	By save=By.cssSelector(".btn.btn-success");
	By errormsg=By.xpath("(//p[@class='help-block help-block-error '])[3]");
	
	public Add_Deduction(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement ToSelectWorker()
	{
		return driver.findElement(worker);
	}
	public WebElement ToSelectType()
	{
		return driver.findElement(type);
	}
	public WebElement ToenterAmount()
	{
		return driver.findElement(amount);
	}
	public WebElement ToSlectDate()
	{
		return driver.findElement(effective_form);
	}
	public WebElement ToClickDate()
	{
		return driver.findElement(date);
	}
	public WebElement toSaveDeduction()
	{
		return driver.findElement(save);
	}
	public WebElement gettextOfMessage()
	{
		act.explicitWait(driver,driver.findElement(errormsg) , 30);
		return driver.findElement(errormsg);
	}
}
