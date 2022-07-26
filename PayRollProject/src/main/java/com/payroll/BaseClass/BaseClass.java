package com.payroll.BaseClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.beust.jcommander.Parameter;
import com.payroll.Actions.Action;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

     public class BaseClass {
	public static Properties prop;
	public static Action act=new Action();
	
	//loadConfig method is to load the configuration
	public static ThreadLocal<RemoteWebDriver> driver=new ThreadLocal<RemoteWebDriver>();
	@BeforeSuite(groups= {"SMK"})
	public void loadConfig() {
		DOMConfigurator.configure("Log4j.xml");
		ExtentManager.setExtent();

		try {
			 prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configurations\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public void firstCall() {
		launchApp();
		
	}
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	public void launchApp() {
		
	   String browserName = prop.getProperty("Browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}
		//Maximize the screen
		getDriver().manage().window().maximize();
		//Action action = new Action();
		//Implicit TimeOuts
	    act.implicitWait(getDriver(), 10);
		//PageLoad TimeOuts
		act.pageLoadTimeOut(getDriver(), 30);   
		getDriver().get(prop.getProperty("url"));
		 
	}
	@AfterMethod
	public void endbrowser()
	{
		getDriver().close();
	}
	@AfterSuite
	public void EndGame()
	{
		
		ExtentManager.endReport();
	}
	
	
	

	
	}
