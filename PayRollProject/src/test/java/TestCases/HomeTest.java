package TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.Deduction;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExcelRead;

public class HomeTest extends BaseClass {
	// @Parameters("Browser")
	LoginPage lp;
	HomePage hp;
	Deduction ded;

	@BeforeMethod
	public void pageObjects() {
		lp = new LoginPage(getDriver());
		hp = new HomePage(getDriver());
		ded = new Deduction(getDriver());

	}

	@Test
	public void deductionclick() throws IOException {
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		hp.ToClickdeduction().click();
		boolean Exp = true;
		boolean actual = act.isDisplayed(getDriver(), ded.ToViewDeductions());
		Assert.assertEquals(actual, Exp);

	}

	@Test
	public void logout() throws IOException {
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		act.click(getDriver(), hp.ToClickNameOfUser());
		act.click(getDriver(), hp.ToLogout());
		boolean Expected = true;
		boolean actual = act.isDisplayed(getDriver(), lp.ToClickUsername());
		Assert.assertEquals(actual, Expected);

	}

}
