package Demo.WebDriverMgr;
import org.testng.annotations.*;
public class ParametersTestNGAutomobile {
	@Parameters({"AutomobileName"})
	@Test
	public void TestCase1(String name)
	{
		System.out.println(name);
	}
	

}
