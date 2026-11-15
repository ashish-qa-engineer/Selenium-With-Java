package DemoTest.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // Capture Screenshot of web page screenshot
        //step1: convert webdriver object to TakeScreenshot interface
        
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        //Step2 : call getscreenshotsas method to create image file 
        
        File src = screenshot.getScreenshotAs(OutputType.FILE);

        File dest = new File("E:\\Java Project Directory\\Test1\\Screenshots\\FullPage.png");

        //Step3: copy image file to destination
        
        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot captured successfully");

    }
}