package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class Deduction extends BaseClass {
	WebDriver driver;
	By settings=By.xpath("//a[@href='/payrollapp/user']");
	By user=By.cssSelector(".dropdown-toggle");
	By dashboard=By.name("Dashboard");
	By company=By.name("Company");
	By clients=By.name("Clients");
	By workers=By.name("Workers");
	By deduction=By.name("Deduction");
	By timesheet=By.name("TimeSheet");
	By payslip=By.name("Payslip");
	By invoice=By.name("Invoice");
	By report=By.name("Report");
	By deductions=By.xpath("//a[@href='/payrollapp/deduction']");
	By add_ded=By.xpath("//a[@href='/payrollapp/deduction/create']");
	By eyelink=By.xpath("(//span[@class='glyphicon glyphicon-eye-open'])[1]");
	By pencil=By.xpath("(//span[@class='glyphicon glyphicon-pencil'])[1]");
	public Deduction(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement ToClickSettings()
	{
		return driver.findElement(settings);
	}
	public WebElement ToclickUser()
	{
		return driver.findElement(user);
	}
	public WebElement ToClickDashboard()
	{
		return driver.findElement(dashboard);
	}
	public WebElement ToClickCompany()
	{
		return driver.findElement(company);
	}
	public WebElement ToclickClients()
	{
		return driver.findElement(clients);
	}
	public WebElement ToclickWorkers()
	{
		return driver.findElement(workers);
	}
	public WebElement ToClickdeduction()
	{
		return driver.findElement(deduction);
	}
	public WebElement ToClickTimesheet()
	{
		return driver.findElement(timesheet);
	}
	public WebElement ToClickPayslip()
	{
		return driver.findElement(payslip);
	}
	public WebElement ToClickInvoice()
	{
		return driver.findElement(invoice);
	}
	public WebElement ToClickreports()
	{
		return driver.findElement(report);
	}
	public WebElement ToViewDeductions()
	{
		return driver.findElement(deductions);
	}
	public WebElement ToCreateDeduction()
	{
		return driver.findElement(add_ded);
	}
	public WebElement toViewDeduction()
	{
		return driver.findElement(eyelink);
	}
	public WebElement toEditDeduction()
	{
		return driver.findElement(pencil);
	}


}
