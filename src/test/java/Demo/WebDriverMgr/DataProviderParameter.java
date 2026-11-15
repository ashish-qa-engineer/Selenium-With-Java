package Demo.WebDriverMgr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DataProviderParameter {
	
	//India Qutub minar
	//Agra Taj Mahal
	//Hyderabad charminar
	
	@DataProvider(name = "searchDataSet")
	public Object[][] searchData()
	{
		Object[][] searchKeyWord = new Object[3][2];
		searchKeyWord[0][0] = "India";
		searchKeyWord[0][1] = "Qutub Minar";
		
		searchKeyWord[1][0] = "Agra";
		searchKeyWord[1][1] = "Taj Mahal";	
		
		searchKeyWord[2][0] = "Hyderabad";
		searchKeyWord[2][1] = "charminar";
		return searchKeyWord;
	}
	@Test(dataProvider = "searchDataSet")
	public void TestCaseGoogleSearch(String country, String monument)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		
		//enter key combination of country and monument
		searchbox.sendKeys(country + " " + monument);
		
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).submit();
		
	}
	

}
