package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithPOMLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				//Create object of LoginPage
				WithPageFactoryLoginpage Loginpg = new WithPageFactoryLoginpage(driver);
				
				//Open url 
				driver.get("https://www.saucedemo.com/");
				Loginpg.enterUsername("standard_user");
				Loginpg.enterPassword("secret_sauce");
				Loginpg.clickOnLoginBtn();

	}

}
