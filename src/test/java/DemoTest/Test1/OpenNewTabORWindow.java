package DemoTest.Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabORWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.google.com");
	        
	        System.out.println("First Page : " + driver.getTitle());
	        
	        //Open new TAB
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("https://www.facebook.com/");
	        System.out.println("Second Tab : " + driver.getTitle());
	        
	        //Get Window handles of open window
	        Set<String> windowHandles= driver.getWindowHandles();
	        List<String> handles = new ArrayList<String>();
	        handles.addAll(windowHandles);
	        
	        driver.close();
	        //Switch to google.com
	        driver.switchTo().window(handles.get(0));
	        System.out.println("First Page : " + driver.getTitle());
	        
	        

	}

}
