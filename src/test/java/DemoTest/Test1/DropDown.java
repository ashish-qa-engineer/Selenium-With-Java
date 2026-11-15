package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");
		
		// object
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement element = driver.findElement(By.id("input-country"));
		
		Select dropdown = new Select(element);
		
		//dropdown.selectByVisibleText("Hong kong");
		//dropdown.selectByValue("98");
		//dropdown.selectByIndex(3);
		
		if(dropdown.isMultiple())
		{
			System.out.println("Drop down is multiple");
		}
		else
		{
			System.out.println("Drop down is not multiple");
		}
		
		//use Getoptions()
		
		List <WebElement> alldropdownoptions = (List<WebElement>) dropdown.getOptions();
		
		System.out.println("Total options:" + alldropdownoptions.size());
		for(WebElement el :alldropdownoptions )
		{
			System.out.println(el.getText());
		}
			
        driver.close();
        
	}

}
