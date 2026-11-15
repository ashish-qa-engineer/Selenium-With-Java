package Demo.WebDriverMgr;
import org.testng.annotations.*;
public class ParameterTestNGSoftware {
	@Parameters({"SoftwareName"})
	@Test
	public void TestCase1(String name)
	{
		System.out.println(name);
	}
	

}
