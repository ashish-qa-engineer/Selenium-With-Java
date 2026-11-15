package CrossBrowserTesting;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CrossBrowserTesting {
	
	//webdriver object 
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	// method
	public void LaunchBrowser(String browser)
	{ 
		switch(browser.toLowerCase())
		{
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;		
		default:
		 driver = null;
		break;
		}
	}
	@Test
	//method
	public void verifyTitle()
	{
		//open URL
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@AfterMethod
	public void Quit()
	{
		driver.quit();
	}

}
