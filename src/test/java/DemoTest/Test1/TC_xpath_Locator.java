package DemoTest.Test1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class TC_xpath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//open sauce demo web page
		driver.get("https://www.saucedemo.com");
		
		//Locate username by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//Locate password by name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//Locate login button by classname
		driver.findElement(By.className("submit-button")).click();
		
		//switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		//Locate Sauce Labs Bolt T-shirt
		//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		//driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).click()List<A>	
		//Use Findelements() method
		java.util.List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element size:" + elementList.size());
		
		
	}

}
