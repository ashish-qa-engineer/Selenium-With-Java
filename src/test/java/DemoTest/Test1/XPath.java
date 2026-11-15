package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome browser
        System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver(); 
		
		//launch google web page
		driver.get("https://www.saucedemo.com");
		
		//Locate user using single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		//locate password using multiple attribute
		driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		//Locate login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		// and expression 
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' or @name='add-to-cart-sauce-labs-bike-light']")).click();
		
	
		

	}

}
