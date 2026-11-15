package BatchTesting;
import org.testng.annotations.*;
public class HomeScreenTest {
	
	//LauchApplication()
	//VerifyTitle()
	//VerifyLogo()
	@Test
	public void  LaunchApllication()
	{
		System.out.println("Applicationn launched passed.");
	}
	
	@Test
	public void  VerifyTitle()
	{
		System.out.println("Verify Title() passed.");
	}
	
	@Test
	public void  VerifyLogo()
	{
		System.out.println("Verify Logo passed.");
	}

}
