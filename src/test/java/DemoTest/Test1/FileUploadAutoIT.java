package DemoTest.Test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
        System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver(); 
		
		//launch google web page
		driver.get("https://the-internet.herokuapp.com/upload"); 
		
		//find choose file web element 
		WebElement button= driver.findElement(By.id("file-upload"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		try {
			Runtime.getRuntime().exec("C://Users//ZTI-Laptop//Desktop//Atuoit//FileUpload.exe" + " " + "C:\\Users\\ZTI-Laptop\\Downloads\\Electricity Bill.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
