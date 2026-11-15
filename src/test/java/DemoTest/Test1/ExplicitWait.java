package DemoTest.Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://export.ebay.com");
        
        //explicit wait of 10 seconds
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Start Selling")));
        
        

	}

}
