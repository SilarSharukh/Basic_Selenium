package testNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Distrubuted_Parallel_Program_Amazon {

	@Test
	public void Amazon() throws Throwable
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/");
		System.out.println(driver.getTitle());
		
	
	}
}
