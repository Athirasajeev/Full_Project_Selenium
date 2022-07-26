package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.EnlargedTS;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.PageObjects.TSEditPage;
import com.payroll.PageObjects.TimeSheetPage;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;

public class EditTsTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	TimeSheetPage tp;
	TSEditPage tep;
	EnlargedTS ets;

	@BeforeMethod
	public void pageObjects() {
		lp = new LoginPage(getDriver());
		hp = new HomePage(getDriver());
		tp = new TimeSheetPage(getDriver());
		tep = new TSEditPage(getDriver());
		ets = new EnlargedTS(getDriver());

	}

	@Test
	public void clickPending() throws InterruptedException, IOException {
		Log.startTestCase("Editing TestCase is Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		String tsn = ExcelRead.readIntegerData(4, 2);
		lp.loginfun(s, s2);
		Log.info("Going to edit TimeSheet");
		hp.ToClickTimesheetTab().click();
		act.click(getDriver(), tp.toEditTimesheet());
		act.click(getDriver(), tep.toViewTimesheet());
		act.type(tep.toViewTimesheet(), tsn);
		act.click(getDriver(), tep.toSave());
		boolean exp = true;
		boolean actual = act.isDisplayed(getDriver(), ets.isDisplayedDashboard());
		Assert.assertEquals(actual, exp);
		Log.endTestCase("Timesheets editing and Assertion Completed");

	}

	@AfterTest
	public void endtest() {
		getDriver().close();
	}

}
