package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_0 {

	public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys("9966332211");
	driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("123456");
	driver.findElement(By.xpath("//a[contains(text(),'Forg')]")).click();
	Thread.sleep(2000);
	driver.close();
	}
}
