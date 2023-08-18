package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicChanging {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		// fetching the address of password.
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		driver.findElement(By.xpath("//span[text()='OnePlus Nord 3 5G (Misty Green, 8GB RAM, 128GB Storage)']/../../../../../..//span[@class='a-price-whole']")).click();
		System.out.println(driver.getTitle());

	}

}
