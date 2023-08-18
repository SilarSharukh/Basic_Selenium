package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Amazon_login_UsingXPathInChrome {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Vivo v23");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
