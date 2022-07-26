package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.Add_Deduction;
import com.payroll.PageObjects.AfterEdit;
import com.payroll.PageObjects.Deduction;
import com.payroll.PageObjects.Enlarged_Ded;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.PageObjects.View_Ded;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;

public class DeductionTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	Deduction dp;
	View_Ded vp;
	Enlarged_Ded edp;
	AfterEdit ap;
	Add_Deduction adp;

	@BeforeMethod
	public void pageObjects() {
		lp = new LoginPage(getDriver());
		hp = new HomePage(getDriver());
		dp = new Deduction(getDriver());
		vp = new View_Ded(getDriver());
		edp = new Enlarged_Ded(getDriver());
		ap = new AfterEdit(getDriver());
		adp = new Add_Deduction(getDriver());

	}

	// Verify the user can view the Deduction in detail when click on eye icon
	@Test
	public void clickeye() throws InterruptedException, IOException {
		Log.startTestCase("View Deduction Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		hp.ToClickdeduction().click();
		Log.info("Going to click eye icon");
		dp.toViewDeduction().click();
		boolean Exp = true;
		boolean actual = act.isDisplayed(getDriver(), vp.isDisplayedDashboard());
		Assert.assertEquals(actual, Exp);
		Log.endTestCase("Deduction View and Assertion Completed");
	}

	// Verify the user edit deduction when click on pencil icon
	@Test
	public void clickPencil() throws InterruptedException, IOException {
		Log.startTestCase("Edit Deduction Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		String amnt = ExcelRead.readIntegerData(12, 1);
		lp.loginfun(s, s2);
		hp.ToClickdeduction().click();
		Log.info("Going to click pencil icon");
		dp.toEditDeduction().click();
		edp.toEnterAmount().clear();
		act.type(edp.toEnterAmount(), amnt);
		act.click(getDriver(), edp.toSave());
		boolean Exp = true;
		boolean actual =act.isDisplayed(getDriver(),  ap.toViewDashboard());
		Assert.assertEquals(actual, Exp);
		Log.endTestCase("Deduction Edit and Assertion Completed");
	}

	// verify the user can add new deduction
	@Test
	public void create_deduction() throws InterruptedException, IOException {
		Log.startTestCase("Create Deduction Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		String amnt_add = ExcelRead.readIntegerData(13, 1);
		lp.loginfun(s, s2);
		hp.ToClickdeduction().click();
		act.click(getDriver(), dp.ToCreateDeduction());
		Log.info("Going to Fill Fields");
		act.click(getDriver(), adp.ToSelectWorker());
		act.selectByIndex(adp.ToSelectWorker(), 1);
		act.click(getDriver(), adp.ToSelectType());
		act.selectByIndex(adp.ToSelectType(), 1);
		act.type(adp.ToenterAmount(), amnt_add);
		act.click(getDriver(), adp.ToSlectDate());
		act.click(getDriver(), adp.ToClickDate());
		act.click(getDriver(), adp.toSaveDeduction());
		boolean Exp = true;
		boolean actual = act.isDisplayed(getDriver(), ap.toViewDashboard());
		Assert.assertEquals(actual, Exp);
		Log.endTestCase("Deduction Creation and Assertion Completed");

	}

	// verify the user can't create deduction with blank mandatory field
	@Test
	public void create_deduction_blank() throws InterruptedException, IOException {
		Log.startTestCase("Create Deduction Started");
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lp.loginfun(s, s2);
		hp.ToClickdeduction().click();
		act.click(getDriver(), dp.ToCreateDeduction());
		Log.info("Going to Fill Fields");
		act.click(getDriver(), adp.ToSelectWorker());
		act.selectByIndex(adp.ToSelectWorker(), 1);
		act.click(getDriver(), adp.ToSelectType());
		act.selectByIndex(adp.ToSelectType(), 17);
		act.click(getDriver(), adp.ToSlectDate());
		act.click(getDriver(), adp.ToClickDate());
		act.click(getDriver(), adp.toSaveDeduction());
		String Exp = "Amount cannot be blank.";
		String actual = act.toGetText(adp.gettextOfMessage());
		Assert.assertEquals(actual, Exp);
		Log.endTestCase("Deduction Creation and Assertion Completed");

	}

}
