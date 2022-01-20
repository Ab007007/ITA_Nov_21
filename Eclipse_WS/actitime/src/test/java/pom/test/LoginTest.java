package pom.test;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.utils.ActitimeUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pom.page.DashboardPage;
import pom.page.LoginPage;

public class LoginTest {

	WebDriver driver = null;
	LoginPage lp = null;
	DashboardPage dp = null;
	ExtentReports reports = null;
	ExtentTest test = null;
	
	@BeforeSuite
	public void setupReports()
	{
		String dateAndtime = new Date().toString().replace(" ", "_").replace(":", "_");
		reports = new ExtentReports("target\\Automation_"+ dateAndtime + ".html");
		
	}
	
	
	@AfterSuite
	public void saveReports()
	{
		reports.flush();
	}
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{
		test = reports.startTest("Setup");
		test.log(LogStatus.INFO	, "Setting up  " + browser + " browser");
		driver = ActitimeUtils.getDriver(browser);
	
		test.log(LogStatus.INFO, "Creating page objects");
		lp = new LoginPage(driver);
		dp = new DashboardPage(driver);
		reports.endTest(test);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		lp = null;
		dp = null;
	}
	
	@Test
	@Parameters({"url","username","password"})
	public void loginAndLogoutTest(String url, String un, String pwd)
	{
		test = reports.startTest("loginAndLogoutTest");
		test.log(LogStatus.INFO, "Launching the application " + url);
		driver.get(url);
		lp.validateTitle(driver, "actiTIME - Login");
		test.log(LogStatus.PASS, "Launch is successfull");
		
		lp.login(un,pwd);
		lp.validateTitle(driver, "actiTIME - Enter Time-Track");
		test.log(LogStatus.PASS, "Login is successfull");
		
		dp.logout();
		lp.validateTitle(driver, "actiTIME - Login");
		test.log(LogStatus.PASS, "Logout is successfull");
		reports.endTest(test);
	}
	
	@Test
	@Parameters({"url","username","password"})
	public void loginAndGoToTaskTest(String url, String un, String pwd)
	{
		test = reports.startTest("loginAndGoToTaskTest");
		test.log(LogStatus.INFO, "Launching the application " + url);
		driver.get(url);
		lp.validateTitle(driver, "actiTIME - Login");
		test.log(LogStatus.PASS, "Launch is successfull");
		
		lp.login(un,pwd);
		lp.validateTitle(driver, "actiTIME - Enter Time-Track");
		test.log(LogStatus.PASS, "Login is successfull");
		
		dp.clickOnTasks();
		lp.validateTitle(driver, "actiTIME - Task List");
		test.log(LogStatus.PASS, "Task page Validation is successfull");
		
		dp.logout();
		lp.validateTitle(driver, "actiTIME - Login");
		test.log(LogStatus.PASS, "Logout is successfull");
		reports.endTest(test);
	}
	
	
	
	
	
	
	
	
}
