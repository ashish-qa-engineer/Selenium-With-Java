package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
        System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver(); 
		
		//launch google web page
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		//Switch to !st Frame
		driver.switchTo().frame(0);
		
		//Find web element 
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//Switch to main page
		driver.switchTo().defaultContent();
		
		//Switch to 2nd frame
		driver.switchTo().frame(1);
		
		//Find Web element "Alert" Link text of 2nd frame
		driver.findElement(By.linkText("Alert")).click();
		
		

	}

}
