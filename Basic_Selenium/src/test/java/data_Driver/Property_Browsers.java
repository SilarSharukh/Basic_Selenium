package data_Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_Browsers {

	public static void main(String[] args) throws Throwable {
		//create an object for properties class
		Properties p=new Properties();
	// create an object for physical file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		//loading fis
		p.load(fis);
		String url=p.getProperty("url");
		String browser=p.getProperty("browser3");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
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
		driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys(username);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(password);
		
		


	}

}
