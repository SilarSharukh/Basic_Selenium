package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement em=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		if(em.isDisplayed())
			em.sendKeys("Computer");
		else
			System.out.println("Search Box is not displayed.");
		
		Thread.sleep(2000);
		driver.close();

	}

}
