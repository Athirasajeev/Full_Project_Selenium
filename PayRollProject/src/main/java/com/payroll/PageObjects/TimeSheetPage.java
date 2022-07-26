package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class TimeSheetPage extends BaseClass{
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
	By pending=By.partialLinkText("Pending");
	By approved=By.partialLinkText("Approved");
	By create=By.linkText("Create Timesheet"); 
	By genepay=By.cssSelector(".btn.btn-warning.btn-responsive.playslip");
	By geneinv=By.cssSelector(".btn.btn-warning.btn-responsive.invoice");
	By apptime=By.cssSelector(".btn.btn-success.btn-responsive.pull-right");
	By logo=By.xpath("//img[@src='/payrollapp/images/login-logo.png']");
	By timeshlink=By.linkText("Timesheet Number");
	By table=By.xpath("(//a[@class='asc'])[1]");
	By tsfirstv=By.xpath("(//table/tbody/tr/td)[1]");
	By eyefirst=By.xpath("(//span[@class='glyphicon glyphicon-eye-open'])[1]");
	By pencilfirst=By.xpath("(//span[@class='glyphicon glyphicon-pencil'])[1]");
	public TimeSheetPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement ToClicksettings()
	{
		return driver.findElement(settings);
	}
	public WebElement ToClickUser()
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
	public WebElement ToClickClients()
	{
		return driver.findElement(clients);
	}
	public WebElement ToClickworker()
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
	public WebElement ToclickPending()
	{
		return driver.findElement(pending);
	}
	public WebElement ToClickApproved()
	{
		return driver.findElement(approved);
	}
	public WebElement ToCreateTimesheet()
	{
		return driver.findElement(create);
	}
	public WebElement ToGeneratePayslip()
	{
		return driver.findElement(genepay);
	}
	public WebElement ToGenerateInvoice()
	{
		return driver.findElement(geneinv);
	}
	public WebElement ToApproveTimeSheet()
	{
		return driver.findElement(apptime);
	}
	public WebElement ToviewLogo()
	{
		return driver.findElement(logo);
	}
	public WebElement ChangeAscendingOrderOfTimesheet()
	{
		return driver.findElement(timeshlink);
	}
	public WebElement viewTable()
	{
		return driver.findElement(table);
	}
	public WebElement toViewValueOfTable()
	{
		return driver.findElement(tsfirstv);
	}
	public WebElement toViewTimesheet()
	{
		return driver.findElement(eyefirst);
	}
	public WebElement toEditTimesheet()
	{
		return driver.findElement(pencilfirst);
	}


}