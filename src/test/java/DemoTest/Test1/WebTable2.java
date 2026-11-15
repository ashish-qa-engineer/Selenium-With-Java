package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
				System.setProperty("webdriver.chrome.driver", "E:\\Java Project Directory\\Drivers\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
								
				//Maximizes browser
				driver.manage().window().maximize();
								
				//open URL
				driver.get("https://testautomationpractice.blogspot.com/");
				
				//Find total row in webtable
				java.util.List<WebElement> rowList =  driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
				System.out.println("Row:" +rowList.size());
				
				//Find total column in webtable 
				java.util.List<WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody//tr[1]/th"));
				System.out.println("Column:" + columnList.size());
				
				for(int r =2;r<=rowList.size();r++) //row
				{ 
					for(int c=1;c<=columnList.size();c++) //column
					{
						String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
						System.out.println(data);
						
					}
				}

	}

}
