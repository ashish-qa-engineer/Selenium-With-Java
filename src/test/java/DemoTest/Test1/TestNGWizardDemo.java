package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGWizardDemo {
  @Test
  public void f() {
	  
	   // Launch Chrome browser
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      // Open URL
      driver.get("https://www.google.com/");

      // Expected title
      String expectedTitle = "Google";

      // Actual title
      String actualTitle = driver.getTitle();

      // Verify title
      Assert.assertEquals(actualTitle, expectedTitle);

      driver.quit();

  }
}
