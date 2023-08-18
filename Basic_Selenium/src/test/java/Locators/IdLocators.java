package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdLocators {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("9988665544");
	// fetching the address of password.
	driver.findElement(By.name("pass")).sendKeys("9966332211");
	Thread.sleep(5000);
	//driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
	
	// address of link
	//driver.findElement(By.linkText("Forgotten password?")).click();
	//driver.close();
	// partial link text
	driver.findElement(By.partialLinkText("Forgotten")).click();
}

}
