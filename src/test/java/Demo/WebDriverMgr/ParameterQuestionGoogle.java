package Demo.WebDriverMgr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class ParameterQuestionGoogle {
	@Parameters({"keyword"})
	@Test
	public void GoogleSearch(String searchdata)
	{
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@id='ti6dpd']"));
		searchbox.sendKeys(searchdata);
		
		Assert.assertEquals(searchdata, searchbox.getAttribute("value"));
		
		driver.quit();
	}

}
