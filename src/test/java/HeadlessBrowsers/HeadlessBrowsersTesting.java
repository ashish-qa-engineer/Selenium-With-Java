package HeadlessBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowsersTesting {

    public static void main(String[] args) {
        // Launch Chrome Driver
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions options = new ChromeOptions();
        // पुराना तरीका (options.setHeadless(true)) बदलने के लिए नीचे वाली लाइन का इस्तेमाल करें:
        options.addArguments("--headless=new"); 
        
        WebDriver driver = new ChromeDriver(options);
        
        // Open URL
        driver.get("https://google.com");
        
        // Maximize browser
        driver.manage().window().maximize();
        
        // Print page Title
        System.out.println("Before Title: " + driver.getTitle());
        
        // Find search box web element
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        
        // Enter search keyword
        searchBox.sendKeys("India Gate"); // स्पेलिंग 'Indida' से सुधार कर 'India' कर दी है
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
