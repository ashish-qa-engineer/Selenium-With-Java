package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

//using Page Factory
public class WithPageFactoryLoginpage {
	
	//Create object
	WebDriver driver;
	//Create Constructor
	WithPageFactoryLoginpage(WebDriver d)
	{
		driver = d;
		//This method will create web elements
		PageFactory.initElements(driver, this);
	}
	//identify web elements
	@FindBy(id="user-name")  WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement loginBtn;
	//Perform operation 
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}


}
