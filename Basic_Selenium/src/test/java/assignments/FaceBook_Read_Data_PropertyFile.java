package assignments;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook_Read_Data_PropertyFile {

	public static void main(String[] args) throws Throwable {
		//create an object for properties class
				Properties p=new Properties();
			// create an object for physical file
				FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
				//loading fis
				p.load(fis);
				String url=p.getProperty("url");
				String browser=p.getProperty("browser1");
				String username=p.getProperty("username");
				String password=p.getProperty("password");
				WebDriver driver;
				if(browser.equals("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}
				else
				{
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(url);
				driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys(username);
				driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(password);
				driver.findElement(By.xpath("//button[@type='submit']")).submit();
				Thread.sleep(13000);
				driver.close();
	}

}
