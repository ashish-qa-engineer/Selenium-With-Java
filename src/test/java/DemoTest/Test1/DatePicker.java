package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//02-August-2026
		
		String expectedDay = "8";
		String expectedMonth = "December";
		String expectedYear = "2026";		
		
		//Launch browser
				System.setProperty("webdriver.chrome.driver", "E:\\Java Project Directory\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); 
				
				//Maximise browser
			    driver.manage().window().maximize();
			    
			    //Open url 
			    driver.get("https://jqueryui.com/datepicker/");
			    
			    //Swtich to iframe
			    driver.switchTo().frame(0);
			    
			    //Find date picker webelement to perform click action 
			    WebElement datepicker = driver.findElement(By.id("datepicker"));
			    datepicker.click();
			    
			    while(true)
			    {
			    	
			    	String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			    	
			    	String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			    	
			    	if(calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear))
			    	{
			    		List <WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));
			    		for(WebElement e:dayList)
			    		{
			    			String calenderDay = e.getText();
			    			if(calenderDay.equals(expectedDay))
			    			{
			    				e.click();
			    				break;
			    				}
			    		}
			    		break;
			    	}
			    	else
			    	{
			    		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			    		
			    	}
			    }
			    
			    
			    
			    
	}

}
