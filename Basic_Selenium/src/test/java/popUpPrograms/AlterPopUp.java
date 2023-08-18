package popUpPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlterPopUp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
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
		Thread.sleep(3000);
		a.doubleClick(plus).perform();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Alert a1=driver.switchTo().alert();
		Thread.sleep(3000);
		a1.accept();
		Thread.sleep(3000);
		
	}

}
