package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//31-December-2026
	
				String expectedDay = "8";
				String expectedMonthYear = "December";		
				
				//Launch browser
						System.setProperty("webdriver.chrome.driver", "E:\\Java Project Directory\\Drivers\\chromedriver.exe");
						WebDriver driver = new ChromeDriver(); 
						
						//Maximise browser
					    driver.manage().window().maximize();
					    
					    //Open url 
					    driver.get("https://jqueryui.com/datepicker/");
					    
					    //Find date picker webelement to perform click action 
					    WebElement datepicker = driver.findElement(By.xpath("//label[@for='departure']"));
					    datepicker.click();
					    
					    while(true)
					    {
					    	
					    	String calenderMonthYear = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div")).getText();
					    	
					    	if(calenderMonthYear.equals(expectedMonthYear))
					    	{
					    		List <WebElement> dayList = driver.findElements(By.xpath("//div[@class='dateInnerCell']"));
					    		
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
					    		driver.findElement(By.xpath("//span[contains(@aria-label,'Next Month')]")).click();
					    		
					    	}
					    }
					    
					    

	}

}
