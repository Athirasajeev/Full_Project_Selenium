package TestCases;

import java.io.IOException;
import org.testng.Assert;
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

public class TimesheetTest extends BaseClass {
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

	// Verify the user can Approve the pending time sheets
	@Test
	public void clickPending() throws InterruptedException, IOException {
		Log.startTestCase("Approve TimeSheet Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		hp.ToClickTimesheetTab().click();
		Log.info("Going to click approve button");
		tp.ToApproveTimeSheet().click();
		Log.endTestCase("Timesheets Approved and Assertion Completed");

	}

	// Verify the user can generate payslip
	@Test
	public void gen_payslip() throws IOException {
		Log.startTestCase("Generate Payslip Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		act.click(getDriver(), hp.ToClickTimesheetTab());
		Log.info("Going to click on Generate Payslip");
		act.click(getDriver(), tp.ToGeneratePayslip());
		boolean expected = true;
		boolean actual = act.isAlertPresent(getDriver());
		Assert.assertEquals(actual, expected);
		Log.endTestCase("Payslip generation and Assertion Completed");
	}

	// Verify the user can generate invoice
	@Test
	public void gen_invoice() throws IOException, InterruptedException {
		Log.startTestCase("Generate Invoice Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		act.click(getDriver(), hp.ToClickTimesheetTab());
		Log.info("Going to click on Generate Invoice");
		act.click(getDriver(), tp.ToGenerateInvoice());
		boolean expected = true;
		boolean actual = act.isAlertPresent(getDriver());
		Assert.assertEquals(actual, expected);
		Log.endTestCase("invoice generation and Assertion Completed");
	}

	// verify the timesheet number of pending timesheets changed to ascending order
	// when clicks on timesheet number module
	@Test
	public void toAscendingOrder_timesheetNumber() throws IOException, InterruptedException {
		Log.startTestCase("Ascending Order Check Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		Log.info("Going to click on Timesheet number to check ascending order");
		act.click(getDriver(), hp.ToClickTimesheetTab());
		act.click(getDriver(), tp.ChangeAscendingOrderOfTimesheet());
		String Expected = "0";
		String actual = tp.toViewValueOfTable().getText().toString();
		Assert.assertEquals(actual, Expected);
		Log.endTestCase("Ascending Order Check and Assertion Completed");

	}

	// Verify the user can view the timesheet when click on eye icon
	@Test
	public void eyeClick_View() throws IOException, InterruptedException {
		Log.startTestCase("Eye click Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		act.click(getDriver(), hp.ToClickTimesheetTab());
		Log.info("Going to click on Eye Link");
		act.click(getDriver(), tp.toViewTimesheet());
		boolean Expected = true;
		boolean actual = act.isDisplayed(getDriver(), ets.isDisplayedDashboard());
		Assert.assertEquals(actual, Expected);
	}

	@Test
	public void pencilClick_edit() throws IOException, InterruptedException {
		Log.startTestCase("Pencil click Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		act.click(getDriver(), hp.ToClickTimesheetTab());
		Log.info("Going to click on Pencil Link");
		act.click(getDriver(), tp.toEditTimesheet());
		boolean Exp = true;
		boolean actual = act.isDisplayed(getDriver(), tep.toViewDashboard());
		Assert.assertEquals(actual, Exp);
	}

}