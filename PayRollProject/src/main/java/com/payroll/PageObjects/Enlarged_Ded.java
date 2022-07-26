package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class Enlarged_Ded extends BaseClass{
	WebDriver driver;
	By worker=By.cssSelector(".select2-selection__rendered");
	By type=By.id("deduction-type");
	By amount=By.id("deduction-amount");
	By eff_form=By.id("deduction-effective_from");
	By save=By.cssSelector(".btn.btn-success");
	public Enlarged_Ded(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement toSelectWorker()
	{
		return driver.findElement(worker);
	}
	public WebElement toSelectType()
	{
		return driver.findElement(type);
	}
	public WebElement toEnterAmount()
	{
		return driver.findElement(amount);
	}
	public WebElement toEnterDate()
	{
		return driver.findElement(eff_form);
	}
	public WebElement toSave()
	{
		return driver.findElement(save);
	}

}
