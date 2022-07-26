package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class CreateBrowse extends BaseClass {
	WebDriver driver;
	By filetextbox=By.cssSelector("file-caption-name");
	By browsebtn=By.id("file-logo");
	By skipbtn=By.cssSelector(".btn.btn-success");
	public CreateBrowse(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement toEnterFilename()
	{
		return driver.findElement(filetextbox);
	}
	public WebElement toClickBrowse()
	{
		return driver.findElement(browsebtn);
	}
	public WebElement toSkipBrowse()
	{
		return driver.findElement(skipbtn);
	}
}