package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Edge {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("9966554477");
		Thread.sleep(5000);
		email.clear();
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.submit();
		driver.close();

	}

}
