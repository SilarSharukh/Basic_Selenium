package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAction {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement em=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		em.sendKeys("Computer");
		Thread.sleep(5000);
		em.clear();
		//WebElement login=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//login.submit();
		
		Thread.sleep(3000);
		driver.close();

	}

}
