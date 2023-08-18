package popUpPrograms;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildPopUpSkillrary {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'GEARS')]")).click();
		driver.findElement(By.xpath("(//a[contains(@target,'_blank')] )[11]")).click();
		
		Set<String> child=driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		// address od element in child window
		driver.findElement(By.id("mytext")).sendKeys("shahas");
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[contains(text(),'CATEGORIES')]")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		

	}

}
