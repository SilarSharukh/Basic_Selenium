package AutoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeChrome {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(5000);
		for (WebElement b:list)
		{
			System.out.println(b.getText());
		}
		
	driver.close();

	}

}
