package data_Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class PropertityFile_Datadriver {

	public static void main(String[] args) throws Throwable {
	//create an object for properties class
		Properties p=new Properties();
	// create an object for physical file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		//loading fis
		p.load(fis);
		String url=p.getProperty("url");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		


	}
}
