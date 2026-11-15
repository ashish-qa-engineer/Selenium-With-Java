package DemoTest.Test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		
		//Open URL
		//driver.get("https://www.udyamregistration.gov.in/Udyam_Login.aspx");
		
		driver.get("https://www.calculator.net/");
		
		//Find radio button web elements on web page
		List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		//print total no. of radio button in radiobuttonlist
		System.out.println("Total no. of radio button on web page:" + radioButtonList.size());
		
		//Close current browser
		driver.close();

	}

}
