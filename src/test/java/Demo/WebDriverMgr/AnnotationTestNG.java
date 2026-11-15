package Demo.WebDriverMgr;
import org.testng.annotations.*;
public class AnnotationTestNG {
	
	@BeforeSuite
	  public void BeforeSuite()
	  {
		  System.out.println("Before Suite...");
	  }
	@AfterSuite
	  public void AfterSuite()
	  {
		  System.out.println("After Suite...");  
	  }
	@BeforeTest
	  public void BeforeTest()
	  {
		  System.out.println("Before Test...");  
	  }
	@AfterTest
	  public void AfterTest()
	  {
		  System.out.println("After Test...");  
	  }
	@BeforeClass
	  public void Beforeclass()
	  {
		  System.out.println("Before Class...");  
	  }
	@AfterClass
	  public void Afterclass()
	  {
		  System.out.println("After Class...");  
	  }
	@BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before Method...");
  }
	@AfterMethod
	  public void AfterMethod()
	  {
		  System.out.println("After Method...\n");	  
	  }
  @Test
  public void Test1()
  {
	  System.out.println("This is test 1..."); 
  }
  @Test
  public void Test2()
  {
	  System.out.println("This is test 2...");
  }
}
