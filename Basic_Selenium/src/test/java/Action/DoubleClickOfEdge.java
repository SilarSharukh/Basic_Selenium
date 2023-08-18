package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickOfEdge {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		// address of course button
		WebElement course=driver.findElement(By.xpath("//a[@id='course']"));
		// creating an object for actions class
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		// fetech address of selenium training
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		//address of + button
		
		WebElement plus=driver.findElement(By.xpath("//button[@id='add']"));
		a.doubleClick(plus).perform();
		
		Thread.sleep(7000);
		driver.close();

	}

}
