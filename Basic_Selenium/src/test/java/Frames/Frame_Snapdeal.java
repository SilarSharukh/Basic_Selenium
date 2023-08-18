package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Snapdeal {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.snapdeal.com");
		WebElement signIn=driver.findElement(By.xpath("//span[text()='Sign In']"));
		// create an object for action class
		Actions a= new Actions(driver);
		a.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		
		// handling the frame using index
		
		//driver.switchTo().frame(0);
		
		// handling the frame using id
		
				driver.switchTo().frame("loginIframe");
				
				// handling the frame using index
				
				//driver.switchTo().frame("iframeLogin");
	Thread.sleep(3000);	
	driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("Shaik");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
	// switch to normal
	driver.switchTo().defaultContent();
	
	}

}
