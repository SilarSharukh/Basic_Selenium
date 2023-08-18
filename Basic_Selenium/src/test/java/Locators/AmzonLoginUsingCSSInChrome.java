package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AmzonLoginUsingCSSInChrome {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Vivo v23");
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		

	}

}
