package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutPageFactoryPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open url 
		driver.get("https://www.saucedemo.com/");
		//Find & enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//Find & enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//Find& click on login button
		driver.findElement(By.id("login-button")).click();

	}

}
