package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestIframeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Launch chrome browser
        System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver(); 
		
		//launch google web page
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		
		//find webelement checkbox
		driver.findElement(By.id("a")).click();
		
		//switch to parent frame
		driver.switchTo().parentFrame();
		
		//find webelement input box
		driver.findElement(By.tagName("input")).sendKeys("This is text mesg");
		
		//Switch to default content/main page
		driver.switchTo().defaultContent();
		driver.switchTo().frame("framer2");
		
		//find webelement animal dropdown
		WebElement dropDownElement = driver.findElement(By.id("animals"));
		Select dropdown = new Select(dropDownElement);
		
		dropdown.selectByVisibleText("Avatar");
		
		
	}

}
