package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Java Project Directory\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
						
		//Maximizes browser
		driver.manage().window().maximize();
						
		//open URL
		driver.get("E:\\Java Project Directory\\Test1\\sampleTable.html");
		
		//Find second cell in web table and print second cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		
		System.out.println(text);
		
		//Find total row in webtable
		java.util.List<WebElement> rowList =  driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Row:" +rowList.size());
		
		//Find total column in webtable 
		java.util.List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("Column:" + columnList.size());
		
		for(int r = 2; r<=rowList.size();r++) //2,3
		{	
		  for (int c=1;c<=columnList.size();c++) //1,2
		  {
			  String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
			  System.out.println(data);
		  }
		}
	}

 }
