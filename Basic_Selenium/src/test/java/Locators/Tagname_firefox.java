package Locators;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
public class Tagname_firefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement allLinks:links) {
			System.out.println(allLinks.getText());
		}
		driver.close();

	}

}
