package com.payroll.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;
//import com.payroll.Actions.*;
public class LoginPage extends BaseClass{
	WebDriver driver;
	@FindBy(id="loginform-username")
	WebElement username;
	
	@FindBy(id="loginform-password")
	WebElement password;
	
	@FindBy(id="loginform-rememberme")
	WebElement rememberme;
	
	@FindBy(linkText="reset it")
	WebElement reset;
	
	@FindBy(xpath="//button[@name='login-button']")
	WebElement loginbtn;
	
	@FindBy(xpath="(//div/p[@class='help-block help-block-error'])[2]")
	WebElement inup;
	
	@FindBy(xpath="(//p[@class='help-block help-block-error'])[1]")
	WebElement buser;
	
	@FindBy(xpath="(//p[@class='help-block help-block-error'])[2]")
	WebElement bpass;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement ToClickUsername()
	{
		return username;
	}
	public WebElement ToClickPassword()
	{
		return password;
	}
	public WebElement ToClickRememberMe()
	{
		return rememberme;
	}
	public WebElement ToClickReset()
	{
		return reset;
	}
	public WebElement ToLogin()
	{
		return loginbtn;
	}
	public WebElement getTextOfIncurrectMessage()
	{
		act.explicitWait(driver, inup, 30);
		return inup;
	}
	public WebElement getTextOfBlankIncorrectMessage()
	{
		act.explicitWait(driver, buser, 80);
		
		return buser;
	}
	public WebElement getTextOfBlankPasswordMessage()
	{
		act.explicitWait(driver, bpass, 30);
		return bpass;
	}
	public void loginfun(String user,String pass)
	{
		Action act=new Action();
		act.type(username, user);
		act.type(password, pass);
		act.click(driver, loginbtn);
	}
	
}