package Demo.WebDriverMgr;
import org.testng.annotations.*;
public class ParameterTestNG {
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b)
	{
		System.out.println("Add: "+ (a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void Substraction(int a, int b)
	{
		System.out.println("Subs: "+ (a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void Multiplication(int a, int b)
	{
		System.out.println("Multiply: " + (a*b));
	}

}
