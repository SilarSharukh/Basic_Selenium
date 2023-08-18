package testNGPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Distrubuted_Parallel_Program_Facebook {

	@Test
	public void Amazon() throws Throwable
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(".\\Src\\test\\resources\\Data.properties");
		p.load(fis);
		String userName=p.getProperty("username");
		String passWord=p.getProperty("password");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(passWord);
	
	}
}
