package DemoTest.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedAreaScreenShot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // Capture section of a web page
        //Step1 : convert wendriver object to TakeScreenshot interface
        
        WebElement section = driver.findElement(By.xpath("//div[@class='fauxborder-left header-fauxborder-left']"));

        //Step2 : call getScreenshotAs method to create image file
        File src = section.getScreenshotAs(OutputType.FILE);

        File dest = new File("E:\\Java Project Directory\\Test1\\Screenshots\\Section1.png");

        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot captured successfully");

    }
}