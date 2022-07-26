package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.payroll.BaseClass.BaseClass;

public class CreateDetails extends BaseClass{
	WebDriver driver;
	By branch=By.id("timesheet-branch_id");
	By client=By.id("select2-timesheet-client_id-container");
	By worker=By.id("select2-timesheet-worker_id-container");
	By division=By.id("timesheet-division_id");
	By weekenddate=By.id("timesheet-date");
	By date28=By.xpath("//table/tbody/tr/td[@data-date='1658966400000']");
	By emptype=By.id("timesheet-employment_type");
	By description=By.id("timesheet-description");
	By category=By.id("timesheet-category");
	By ponumber=By.id("timesheet-po_number");
	By timesheetnumber=By.id("timesheet-timesheet_number");
	By directclient=By.id("timesheet-direct_client");
	By ratedescription=By.id("rate-0-type_id");
	By freaquency=By.id("rate-0-frequency");
	By units=By.id("rate-0-units");
	By pay=By.id("rate-0-pay");
	By bill=By.id("rate-0-bill");
	By wtr=By.id("rate-0-wtr");
	By awr=By.id("rate-0-awr");
	By pension=By.id("rate-0-pension");
	By addrate=By.cssSelector(".pull-right.add-item.btn.btn-success.btn-xs");
	By closerate=By.cssSelector(".fa.fa-close");
	By addexpence=By.xpath("(//div/button)[5]");
	By adhoc=By.id("expense-0-type_id");
	By exunits=By.id("expense-0-units");
	By epay=By.id("expense-0-pay");
	By ebill=By.id("expense-0-bill");
	By adddeduction=By.xpath("(//div/button)[7]");
	By dedtype=By.id("deduction-0-type");
	By dedamount=By.id("deduction-0-amount");
	By savebtn=By.xpath("(//button[@class='btn btn-success'])[2]");
	By blanktypetext=By.xpath("//div[normalize-space()='Type cannot be blank.']");
	
	public CreateDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement toSelectbranch()
	{
		return driver.findElement(branch);
	}
	public WebElement toselectClient()
	{
		return driver.findElement(client);
	}
	public WebElement toSelectWorker()
	{
		return driver.findElement(worker);
	}
	public WebElement toSelectDivision()
	{
		return driver.findElement(division);
	}
	public WebElement toSelectWeekEndDate()
	{
		return driver.findElement(weekenddate);
	}
	public WebElement toClickdate()
	{
		return driver.findElement(date28);
	}
	public WebElement toSelectType()
	{
		return driver.findElement(worker);
	}
	public WebElement toEnterDescription()
	{
		return driver.findElement(description);
	}
	public WebElement toSelectCategory()
	{
		return driver.findElement(category);
	}
	public WebElement toEnterPoNumber()
	{
		return driver.findElement(ponumber);
	}
	public WebElement toEnterTimesheetNumber()
	{
		return driver.findElement(timesheetnumber);
	}
	public WebElement toCheckDirectClient()
	{
		return driver.findElement(directclient);
	}
	public WebElement toEnterRateDescription()
	{
		return driver.findElement(ratedescription);
	}
	public WebElement toEnterFreaquency()
	{
		return driver.findElement(freaquency);
	}
	public WebElement toEnterUnits()
	{
		return driver.findElement(units);
	}
	public WebElement toEnterPayment()
	{
		return driver.findElement(pay);
	}
	public WebElement toEnterBill()
	{
		return driver.findElement(bill);
	}
	public WebElement toEnterWtr()
	{
		return driver.findElement(wtr);
	}
	public WebElement toEnterAwr()
	{
		return driver.findElement(awr);
	}
	public WebElement toEnterPension()
	{
		return driver.findElement(pension);
	}
	public WebElement toAddRate()
	{
		return driver.findElement(addrate);
	}
	public WebElement toCloseRate()
	{
		return driver.findElement(closerate);
	}
	public WebElement toAddExpence()
	{
		return driver.findElement(addexpence);
	}
	public WebElement toAddAdhoc()
	{
		return driver.findElement(adhoc);
	}
	public WebElement toAddExpenceUnits()
	{
		return driver.findElement(exunits);
	}
	public WebElement toEnterExpencePayment()
	{
		return driver.findElement(epay);
	}
	public WebElement toEnterExpenceBill()
	{
		return driver.findElement(ebill);
	}
	public WebElement toAddDeduction()
	{
		return driver.findElement(adddeduction);
	}
	public WebElement toSelectDeductionType()
	{
		return driver.findElement(dedtype);
	}
	public WebElement toEnterDeductionAmount()
	{
		return driver.findElement(dedamount);
	}
	public WebElement toSave()
	{
		return driver.findElement(savebtn);
	}
	public WebElement toGetMessage()
	{
		return driver.findElement(blanktypetext);
	}

}