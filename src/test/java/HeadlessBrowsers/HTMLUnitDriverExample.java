package HeadlessBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLUnitDriverExample {

    public static void main(String[] args) {
        // Launch HtmlUnitDriver
    	HtmlUnitDriver driver = new HtmlUnitDriver();
       
        // Open URL
        driver.get("https://google.com");
        
        // Maximize browser
        driver.manage().window().maximize();
        
        // Print page Title
        System.out.println("Before Title: " + driver.getTitle());
        
        // Find search box web element
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        
        // Enter search keyword
        searchBox.sendKeys("India Gate"); 
        searchBox.sendKeys(Keys.ENTER);
        
        // Pause of 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print page Title
        System.out.println("After Title: " + driver.getTitle());
        
        // Close Browser
        driver.quit();
    }
}
