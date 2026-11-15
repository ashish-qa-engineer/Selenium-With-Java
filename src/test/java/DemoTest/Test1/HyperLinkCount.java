package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.calculator.net/");
		
		List <WebElement> LinkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on webpage:" + LinkElements.size());
		
		for(WebElement el:LinkElements)
		{
			System.out.println(el.getText());
		}
		
		driver.close();
		
	}

}
