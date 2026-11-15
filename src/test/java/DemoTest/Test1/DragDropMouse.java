package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximizes browser
		driver.manage().window().maximize();
		
		//open URL
		driver.get("https://demoqa.com/buttons");
		
		//Find source and Target web element 
		
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		
		//dragAnddrop(sourceElement, targetElement)
		act.dragAndDrop(source, target).perform();
		
		
		

	}

}
