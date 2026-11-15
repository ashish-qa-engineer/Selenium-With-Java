package Demo.WebDriverMgr;
import org.testng.annotations.*;

public class AnnotationAttributes {
	//@Test(priority=3)
	//@Test(description="This is Test Case 1.")
	//@Test(dependsOnMethods= {"TestCase2"})
	@Test(enabled=false)
	public void TestCase1()
	{
		System.out.println("Mobile Login Test Case");
	}
	
	//@Test(priority=2)
	//@Test(timeOut = 200)
	@Test
	public void TestCase2()
	{
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Web Login Test Case");
	}
	
	//@Test(priority=3)
	//@Test(description="This is Test Case 3.")
	@Test
	public void TestCase3()
	{
		System.out.println("API Login Test Case");
	}
 
}
