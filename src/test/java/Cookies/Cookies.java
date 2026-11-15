package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.flipkart.com/");
		
		//capture all the cookies
		Set <Cookie> cookiesList = driver.manage().getCookies();

		//Print size/Number of Cookies
		System.out.println("Before Adding Size:" + cookiesList.size());
		for(Cookie ck:cookiesList)
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}
		//get specfic cookie according to name
		//System.out.println(driver.manage().getCookieNamed("vw"));

		//Create cookie
		Cookie cookieObje = new Cookie("TestCookie", "www.flipkart.com");
		
		//Add cookie to browser
		driver.manage().addCookie(cookieObje);

		//capture all the cookies
		cookiesList = driver.manage().getCookies();

		//Print size/Number of Cookies
		System.out.println("\nAfter Adding Size:" + cookiesList.size());
		for(Cookie ck:cookiesList)
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}
		//Delete cookie
		//driver.manage().deleteCookie(cookieObje);
		//driver.manage().deleteCookieNamed("TestCookie");
		driver.manage().deleteAllCookies();
		
		//capture all the cookies
		cookiesList = driver.manage().getCookies();

		//Print size/Number of Cookies
		System.out.println("\nAfter Deleteing Size:" + cookiesList.size());
		for(Cookie ck:cookiesList)
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}

		//driver.quit();

	}
}
