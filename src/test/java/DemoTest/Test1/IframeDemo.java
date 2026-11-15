package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch chrome browser
        System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver(); 
		
		//launch google web page
		driver.get("https://www.rediff.com/");
		
		//Switch to iframe moneyiframesmall
		driver.switchTo().frame("moneyiframesmall");
		
		//Find web Element 
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		
		System.out.println(nseindex);
		
		//Switch to main page
		driver.switchTo().defaultContent();
		
		//Find and Print total iframes on web page
		
		int NoOfIframe =  driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of Iframes: "+NoOfIframe);
		
		

	}

}
