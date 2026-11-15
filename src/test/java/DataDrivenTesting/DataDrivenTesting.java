package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DataDrivenTesting {
    public static void main(String[] args) {
        XSSFWorkbook ExcelWBook = null;
        XSSFSheet ExcelWSheet;
        // Create File object
        File excelFile = new File(
                "E:\\Java Project Directory\\TestDataFile.xlsx");
        // Create FileInputStream object
        FileInputStream inputStream = null;
        try {
            // Open Excel file
            inputStream = new FileInputStream(excelFile);
            // Create Workbook object
            ExcelWBook = new XSSFWorkbook(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Access first worksheet
        ExcelWSheet = ExcelWBook.getSheetAt(0);

        // Get total row count
        int ttlRows = ExcelWSheet.getLastRowNum() + 1;

        // Get total column count
        int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();

        // Read Excel data
        for (int currentRow = 1; currentRow < ttlRows; currentRow++)//to read 
        {    
        	//Launch Chrome Browser
        	WebDriverManager.chromedriver().setup();
        	WebDriver driver = new ChromeDriver();
        	//Open URL
    		driver.get("https://www.saucedemo.com/");
        	//enter user name
        	driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());
        	//Enter password
    		driver.findElement(By.id("password")).sendKeys((ExcelWSheet.getRow(currentRow).getCell(1).toString()));
    		//Click login button
    		driver.findElement(By.id("login-button")).click();
    		
    		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  //          for (int currentCell = 0; currentCell < ttlCells; currentCell++)//cell read 
  //          {
  //              System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
  //              System.out.print("\t");
  //          }
  //          System.out.println();
    		driver.quit();
        }
        // Close workbook
        try {
            ExcelWBook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}