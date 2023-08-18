package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Webelements_Firefox {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		// is displayed ()
		if(email.isDisplayed())
		{
			email.sendKeys("988774455");
		}
		else
		{
			System.out.println("Element is Not displayed");
		}
		// is Enabled ()
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		
		if(login.isEnabled())
			login.submit();
		else
			System.out.println("Button is disabled.");
		
		Thread.sleep(5000);
		driver.close();

	}

}
