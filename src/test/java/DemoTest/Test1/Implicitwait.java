package DemoTest.Test1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Java Project Directory\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://export.ebay.com");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Stopwatch watch = null;
        
        try {
        	 watch = Stopwatch.createStarted();
        //Find webElement "Start Seeling"
        driver.findElement(By.xpath("//div[@class='FPdoLc T14B5e aaa']//input[@name='btnI']")).click();
        }
        catch(Exception e)
        {  
         watch.stop();
         System.out.println(e);
         System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
        }
	}

}
