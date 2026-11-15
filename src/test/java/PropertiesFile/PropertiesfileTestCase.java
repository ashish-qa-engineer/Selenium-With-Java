package PropertiesFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesfileTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Create object for ReadConfigFile.java
		ReadConfigFile configFile = new ReadConfigFile();
		
		//Open url
		//driver.get("https://www.saucedemo.com/");
		driver.get(configFile.getURL());
		
		driver.findElement(By.id("user-name")).sendKeys(configFile.getUserNae());
		driver.findElement(By.id("password")).sendKeys(configFile.getPassword());
		driver.findElement(By.id("login-button")).click();
		

	}

}
