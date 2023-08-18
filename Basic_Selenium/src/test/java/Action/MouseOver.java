package Action;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.snapdeal.com");
		// fetch te address of signin
		WebElement signIn=driver.findElement(By.xpath("//span[text()='Sign In']"));
		// create an object for action class
		Actions a= new Actions(driver);
		a.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
