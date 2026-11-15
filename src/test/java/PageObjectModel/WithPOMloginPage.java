package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Without Page Factory 
public class WithPOMloginPage {
	
	WebDriver driver;
	
	//Constructor
	WithPOMloginPage(WebDriver d)
	{
		driver = d;
	}
	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	//Create method
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}

}
