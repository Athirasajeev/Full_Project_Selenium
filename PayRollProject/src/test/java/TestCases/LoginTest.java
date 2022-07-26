package TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.PageObjects.ResetPage;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;

public class LoginTest extends BaseClass {
	// @Parameters("Browser")
	LoginPage lg;
	HomePage hp;
	ResetPage rp;

	@BeforeMethod
	public void pageObjects() {
		lg = new LoginPage(getDriver());
		hp = new HomePage(getDriver());
		rp = new ResetPage(getDriver());

	}

	@Test(priority = -1, groups = { "SMK" })
	public void Login() throws InterruptedException, IOException {
		LoginPage lg = new LoginPage(getDriver());
		Log.startTestCase("Login To Payroll");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lg.loginfun(s, s2);
		boolean Expected = true;
		HomePage hp = new HomePage(getDriver());
		boolean actual=act.isDisplayed(getDriver(), hp.ToClickdeduction());
		Assert.assertEquals(actual, Expected);
		Log.endTestCase("Login And Assertion Completed");
	}

	// Verify there is an alert message is displayed while entering invalid
	// credentials

	@Test(dataProvider = "getlogin", priority = 1, groups = { "SMK" })
	public void invalidFields(String u, String p) throws InterruptedException, IOException {
		Log.startTestCase("Invalid Login Started");
		Log.info("Going to enter Username And Password");
		lg.loginfun(u, p);
		String Expected = "Incorrect username or password.";
		String actual = lg.getTextOfIncurrectMessage().getText();
		Assert.assertEquals(actual, Expected);
		Log.endTestCase("Login And Assertion Completed");

	}

	@DataProvider
	public Object[][] getlogin() {
		Object[][] data = new Object[2][2];
		data[0][0] = "carol123";
		data[0][1] = "123";
		data[1][0] = "carol";
		data[1][1] = "1q2w3e";
		return data;
	}

	// Verify there is an alert message is displayed while entering invalid username
	@Parameters({ "u", "p" })
	@Test(priority = 2, groups = { "SMK" })
	public void invalidLogin(String u, String p) throws InterruptedException, IOException {
		Log.startTestCase("Invalid Login Started");
		Log.info("Going to enter Username And Password");
		lg.loginfun(u, p);
		String Expected = "Incorrect username or password.";
		Action act = new Action();
		String actual = lg.getTextOfIncurrectMessage().getText();
		Assert.assertEquals(actual, Expected);
		Log.endTestCase("Login And Assertion Completed");

	}

	// Verify there is an alert message is displayed while entering invalid password

	@Test(priority = 3, groups = { "REG" })
	public void incorrectUsername() throws InterruptedException, IOException {
		Log.startTestCase("Invalid Login Started");
		Log.info("Going to enter Username And Password");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readIntegerData(1, 4);
		lg.loginfun(s, s2);
		String Expected = "Incorrect username or password.";
		String actual = lg.getTextOfIncurrectMessage().getText();
		Assert.assertEquals(actual, Expected);
		Log.endTestCase("Login And Assertion Completed");

	}

	// Verify whether there is an alert message when user login with blank username
	// and password

	@Test(priority = 4, groups = { "REG" })
	public void blankFields() throws InterruptedException {
		Log.startTestCase("Invalid Login Started");
		Log.info("Going to enter Username And Password");
		lg.ToLogin().click();
		String Expected1 = "Username cannot be blank.";
		String actual1 = lg.getTextOfBlankIncorrectMessage().getText();
		Assert.assertEquals(actual1, Expected1);
		String Expected2 = "Password cannot be blank.";
		String actual2 = lg.getTextOfBlankPasswordMessage().getText();
		Assert.assertEquals(actual2, Expected2);
		Log.endTestCase("Login And Assertion Completed");

	}

	// Verify whether there is an alert message when user login with blank username

	@Test(priority = 5, groups = { "REG" })
	public void blankusername() throws InterruptedException, IOException {
		Log.startTestCase("Invalid Login Started");
		Log.info("Going to enter Username And Password");
		String u = "";
		String p = ExcelRead.readStringData(1, 2);
		lg.loginfun(u, p);
		String Expected1 = "Username cannot be blank.";
		String actual1 = lg.getTextOfBlankIncorrectMessage().getText();
		Assert.assertEquals(actual1, Expected1);
		Log.endTestCase("Login And Assertion Completed");

	}

	// Verify whether there is an alert message when user login with blank password

	@Test(priority = 6, groups = { "SMK" })
	public void blankPassword() throws InterruptedException, IOException {
		Log.startTestCase("Invalid Login Started");
		Log.info("Going to enter Username And Password");
		String u = ExcelRead.readStringData(1, 1);
		String p = "";
		lg.loginfun(u, p);
		String Expected1 = "Password cannot be blank.";
		String actual1 = lg.getTextOfBlankPasswordMessage().getText();
		Assert.assertEquals(actual1, Expected1);
		Log.endTestCase("Login And Assertion Completed");

	}

	// Verify the user can click on reset it link

	@Test(priority = 7, groups = { "SNT" })
	public void resetPassword() throws InterruptedException {
		Log.startTestCase("Reset  Started");
		Log.info("Going to click reset link");
		lg.ToClickReset().click();
		Boolean Expected = true;
		Boolean actual = act.isDisplayed(getDriver(), rp.isDisplayedLogo());
		Assert.assertEquals(actual, Expected);
		Log.endTestCase("Reset Click And Assertion Completed");

	}

}