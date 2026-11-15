package ExtentReport;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void startReport()
	{
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		//Add envrionment details 
		reports.setSystemInfo("Machine","TestPC");	
		reports.setSystemInfo("OS","Window 11");	
		reports.setSystemInfo("USer","Ashish");	
		reports.setSystemInfo("Browser","Chrome");

		//Configuration to change to look and feel 
		htmlReporter.config().setDocumentTitle("Extent Rport Demo");
		htmlReporter.config().setReportName("Name Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm:a '('zzz')'");
	}
	@Test
	public void LaunchBrowserAndOpenURL() 
	{
		//Creat test 
		test = reports.createTest("Launch browser and open url");
		Assert.assertTrue(true); //test passed
	}
	@Test
	public void VerifyTtile() 
	{
		//Create test 
		test = reports.createTest("Verify Title ");
		Assert.assertTrue(false); //test passed
	}
	@Test
	public void VerifyLogo() 
	{
		//Create test 
		test = reports.createTest("Verify Logo ");
		Assert.assertTrue(true); //test passed
	}
	@Test
	public void VerifyEmail() 
	{
		//Create test 
		test = reports.createTest("Verify Email");
		throw new SkipException("Skipping this test case with exception");
	}
	@Test
	public void VerifyUsername() 
	{
		//Create test 
		test = reports.createTest("Verify Username ");
		Assert.assertTrue(true); //test passed
	}
	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));	
		}
		if (result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.YELLOW));
		}
	}
	@AfterTest
	public void tearDown()
	{
		reports.flush();
	}

}
