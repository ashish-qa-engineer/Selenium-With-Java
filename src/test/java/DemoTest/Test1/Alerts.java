package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
				System.setProperty("webdriver.chrome.driver", "E:\\Java Project Directory\\Drivers\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
								
				//Maximizes browser
				driver.manage().window().maximize();
								
				//open URL
				driver.get("https://demoqa.com/alerts");
				
				//find alert button and perform click action
				// driver.findElement(By.xpath("//a[@id='alert']")).click();
				
				//find prompt button and perform click action
				driver.findElement(By.xpath("//button[@id='promtButton']")).click();
				
				//Switch to alert window, enter name
				driver.switchTo().alert().sendKeys("Ashishhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
				
				//accept the alert 
				driver.switchTo().alert().accept(); //ok button is clicked
				
				

	}

}
