package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lounch chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximise browser 
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Find web element age input box
		String Actualtooltip = driver.findElement(By.xpath("//button[@id=age']")).getAttribute("title");
		
		String Expectedtooltip = "we ask for your age only for statistical purposes.";
		
		if(Actualtooltip.equals(Expectedtooltip)) {
			
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		
		}

	}

}
