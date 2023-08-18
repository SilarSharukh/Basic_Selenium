package selection;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class Selectig_SingleSelect_DropDownInAmazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s= new Select(dropDown);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=automotive");
		Thread.sleep(3000);
		s.selectByVisibleText("Baby");
		Thread.sleep(3000);
		driver.close();
		

	}

}
