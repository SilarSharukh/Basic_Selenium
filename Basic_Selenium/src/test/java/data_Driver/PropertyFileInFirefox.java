package data_Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFileInFirefox {

	public static void main(String[] args) throws Throwable {
		//create an object for properties class
				Properties p=new Properties();
			// create an object for physical file
				FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
				//loading fis
				p.load(fis);
				String url=p.getProperty("url");
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(url);

	}

}
