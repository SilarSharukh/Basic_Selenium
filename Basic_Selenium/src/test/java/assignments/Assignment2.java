package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
public class Assignment2 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	WebElement page=driver.findElement(By.linkText("Create a Page"));
	System.out.println("Attribute value of class : "+page.getAttribute("class"));
	
	Point coOrdinate=page.getLocation();
	System.out.println("The X coordinate is :"+coOrdinate.getX());
	System.out.println("The Y coordinate is :"+coOrdinate.getY());

	
	System.out.println("The Tage name is : "+page.getTagName());
	
	
	driver.close();
	
	}

}
