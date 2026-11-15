package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
        System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver(); 
		
		//launch google web page
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Enter text in search box
		js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='dynamic';");
		
		//Click on find button
		WebElement element = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click(); ",element);
        
		//refresh browser
		//js.executeScript("history.go(0)");
		
		//get domain name
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain: " + domain);
		
		//get title name
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title: " + title); 
				
		//get url name
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL: " + url); 		
		
		//draw broder around web element
		js.executeScript("arguments[0].style.border = '3px solid red';", element);
		
		//To Zoom page
		js.executeScript("document.body.style.zoom='50%'");
		
		//To get the Height and Width of a web page
		System.out.println(js.executeScript("return window.innerHeight;").toString());
		System.out.println(js.executeScript("return window.innerWidth;").toString());
		
		//scroll vertically till the end 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//scroll vertically page up
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//To generate Alert Pop window in Selenium WebDriver
		js.executeScript("alert('This is my alert message.');");
		
		//To navigate to a different page using JavaScript
		js.executeScript("window.location = 'http://www.google.com'");
		
		
		//To flash web element 
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 20; i++) 
		{
			js.executeScript("arguments[0].style.backgroundColor ='#000000'", element);//black
			try {
				Thread.sleep(80);//20 ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'", element);
			try {
				Thread.sleep(80);//20 ms
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



		
	}

}
