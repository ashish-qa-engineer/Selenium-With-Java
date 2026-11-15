package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureImageSourceURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.facebook.com/");
		
		//Maximise broswer
		driver.manage().window().maximize();
		
		//Find Webelement face book logo
		WebElement imageLog = driver.findElement(By.xpath("//img[@class='xr4gsrn xa83c8o x3oym20 x1i84rja x1is6hmk x1pwz1hh xjd8us4 x12fhftt x19kjcj4 x1u2x60b xsjzec5']"));
		
		//Capture "src" attribute value of imageLogo
		System.out.println("SRC attribute value : " + imageLog.getAttribute("src"));
		
		driver.quit();
	}

}
