package DemoTest.Test1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassloginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open URL
		driver.get("https://www.saucedemo.com/");

		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("");
		//driver.findElement(By.id("login-button")).click();
		
		Actions actions = new Actions(driver);
		Action seriesOfAction = actions.moveToElement(driver.findElement(By.id("user-name")))
				.click().sendKeys("standard_user",Keys.TAB)
				.sendKeys("secret_sauce", Keys.ENTER).build();
		seriesOfAction.perform();

	}

}
