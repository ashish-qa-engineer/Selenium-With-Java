package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver(); 
		
		//launch google web page
		driver.navigate().to("https://www.google.com/");
		
		//capture title of webpage and print
		
		String title = driver.getTitle();
		
		System.out.println("Page Title : " + title);
		
		//capture url of the webpage
		
		System.out.println("URL: " + driver.getCurrentUrl());
		
		driver.close();
		
	}

}
