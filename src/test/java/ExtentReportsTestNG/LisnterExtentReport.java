package ExtentReportsTestNG;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class LisnterExtentReport implements ITestListener{

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void confgueReport()
	{
		htmlReporter = new ExtentSparkReporter("ExtentListenerReport.html");
		reports = new  ExtentReports();
		reports.attachReporter(htmlReporter);

		//Add system information/environment info to details or reports 
		reports.setSystemInfo("Machine","TestPC");	
		reports.setSystemInfo("OS","Window 11");	
		reports.setSystemInfo("Browser","Chrome");	
		reports.setSystemInfo("User Name","Ashish");

		//Configuration to change to look and feel 
		htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlReporter.config().setReportName("This is my First Report");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm:a '('zzz')'");
	}
	public void onStart(ITestContext Result)
	{
		confgueReport();
		System.out.println("On Start method invoked....");
	}
	public void onFinish(ITestContext Result)
	{
		System.out.println("On Finished method invoked....");
		reports.flush();
	}
	//When Test case get failed, this method is called
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("Name of test method failed:" + Result.getName());
		
		test = reports.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: " + Result.getName(), ExtentColor.RED));
	}
	//When Test case get Skipped this method is called.
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("Name of test method skipped:" + Result.getName());
		
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skipped test case is: " + Result.getName(), ExtentColor.RED));
	}
	//When Test case get stared,this method is called.
	public void onTestStart(ITestResult Result)
	{
		System.out.println("Name of test method Started:" + Result.getName());
	}
	//When test case get successfully executed
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("Name of test method Successully executed:" + Result.getName());
		
		test = reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is: " + Result.getName(), ExtentColor.GREEN));
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{	
	}



}
