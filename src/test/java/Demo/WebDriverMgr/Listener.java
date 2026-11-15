package Demo.WebDriverMgr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Listener {

    @Test
    public void login() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Username
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("username")));

        username.sendKeys("Admin");

        // Password
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("password")));

        password.sendKeys("admin123");

        // Login button
        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[normalize-space()='Login']")));

        loginButton.click();

        // Verify title
        wait.until(ExpectedConditions.titleContains("OrangeHRM"));

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

        driver.quit();
    }
    
    @Test
    
    public void testFail()
    {
    	System.out.println("Failed Test Case.");
    	Assert.assertTrue(false);
    }
    
    @Test
    
    public void testSkipped()
    {
    	System.out.println("Failed Test Case.");
    	throw new SkipException("skip expection thown...");
    	
    }
    
}