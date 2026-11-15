package Demo.WebDriverMgr;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener	  {
	
	public void onStart(ITestContext Result)
	{
		System.out.println("On Start method invoked....");
	}
	
	public void onFinish(ITestContext Result)
	{
		System.out.println("On Finished method invoked....");
	}
	
	//When Test case get failed, this method is called
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("Name of test method failed:" + Result.getName());
	}
	//When Test case get Skipped this method is called.
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("Name of test method skipped:" + Result.getName());
	}
	//When Test case get stared,this method is called.
	public void onTestStart(ITestResult Result)
	{
		System.out.println("Name of test method Started:" + Result.getName());
	}
	//When test case get sucessfully executed
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("Name of test method Successully executed:" + Result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{
		
	}
	

}
