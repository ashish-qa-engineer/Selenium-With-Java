package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open swag lab web page
		driver.get("https://www.saucedemo.com");
		
		// Locate user name -- tag#ID
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		
		//Locate password -- tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		//Locate login button using tag.value of class name
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//Switch to product page
		String currentwindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentwindowHandle);
		
		//Locate Button -- tag.valueClass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		//Use Sub String-- tag[attribute$=substring]
		driver.findElement(By.cssSelector("button[name$=light]")).click();
		
	}

}
