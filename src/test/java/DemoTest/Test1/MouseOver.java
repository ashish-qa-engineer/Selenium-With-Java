package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Maximizes browser
		driver.manage().window().maximize();
				
		//open URL
		driver.get("https://export.ebay.com/in/");
		
		WebElement element = driver.findElement(By.xpath("//span[@id='top-level-link_2453']"));
		
		Actions act = new Actions(driver);
		
		// move to element() for mouse over action
		act.moveToElement(element).perform(); 
		

	}

}
