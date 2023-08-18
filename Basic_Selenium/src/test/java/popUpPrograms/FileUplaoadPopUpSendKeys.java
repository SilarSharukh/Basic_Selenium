package popUpPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUplaoadPopUpSendKeys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[contains(text(),'Upload')]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\SHAIK SHARUKH\\Desktop\\My\\re.docx");
		

	}

}
