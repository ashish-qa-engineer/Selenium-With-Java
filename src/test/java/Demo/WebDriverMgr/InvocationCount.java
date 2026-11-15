package Demo.WebDriverMgr;
import org.testng.ITestContext;
import org.testng.annotations.*;
public class InvocationCount {
	@Test(invocationCount=5)
	public void TestMethod1(ITestContext context)
	{
		int currentInvocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing:"+ currentInvocation);
		System.out.println("Test method1...");
	}
	
	@Test(invocationCount=3)
	public void TestMethod2(ITestContext context)
	{
		int currentInvocation = context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Executing:"+ currentInvocation);
		System.out.println("Test method2...");
	}


}
