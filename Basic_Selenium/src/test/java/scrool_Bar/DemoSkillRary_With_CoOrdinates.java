package scrool_Bar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
public class DemoSkillRary_With_CoOrdinates {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement career=driver.findElement(By.xpath("//a[text()='Career']"));
		Point point=career.getLocation();
		System.out.println("The X and Y coOrdinates of Career are:");
		int x=point.getX();
		int y= point.getY();
		System.out.println("x coOrdinate is: "+x+"\nY coOrdinate is: "+y );
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", career);
		
		driver.quit();
		
		

	}

}
