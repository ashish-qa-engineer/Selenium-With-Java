package EncodePassword;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnodePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//encode password
		//String password ="secret_sauce";
		//byte[]encodePassword = Base64.encodeBase64(password.getBytes());
		//System.out.println(new String(encodePassword));
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//Decode password
		byte[] decodedPassword = Base64.decodeBase64("c2VjcmV0X3NhdWNl");
		
		driver.findElement(By.name("password")).sendKeys(new String(decodedPassword));
		
		//Click on login button
		driver.findElement(By.name("login-button")).click();

	}

}
