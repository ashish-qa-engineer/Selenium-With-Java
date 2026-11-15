package Demo.WebDriverMgr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	@Test
	public void testMethod()
	{
		//Launch chrome browser 
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        //Open URL
        driver.get("https://testautomationpractice.blogspot.com/?m=1");
        
        System.out.println("Verifying title...");
        String expectedTitle = "Automation Testing Practice";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle,"Title Verification Failed");
        
        System.out.println("Verifying presence of wikipedia-icon");
        WebElement icon = driver.findElement(By.className("wikipedia-icon"));
        Assert.assertTrue(icon.isDisplayed());
        
        System.out.println("Verifying presence of wikipedia-search-button");
        WebElement searchbtn = driver.findElement(By.className("wikipedia-search-button"));
        Assert.assertTrue(searchbtn.isDisplayed());
        
        
        driver.quit();
	}
	
	

}
