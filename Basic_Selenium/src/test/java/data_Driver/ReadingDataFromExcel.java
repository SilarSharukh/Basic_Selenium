package data_Driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		//Create the workbook factory
		Workbook wb=WorkbookFactory.create(fis);
		// get value
		
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String userName=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String browser=wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		WebDriver driver;
		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(password);
		String title=driver.getTitle();
		wb.getSheet("Sheet1").createRow(8).createCell(0).setCellValue(title);
		// create an object foe the file output stream
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(fos);
		driver.close();
		
	
	
	
	}

}
