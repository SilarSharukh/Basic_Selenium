package WebElements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_Actions {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("9966555");
		System.out.println(email.getText());
		
		Point coOrdinates=email.getLocation();
		System.out.println("X and Y coordinates of test field are");
		System.out.println(coOrdinates.getX());
		System.out.println(coOrdinates.getY());
		
		Dimension size=email.getSize();
		System.out.println("height and width of test field are");
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.close();

	}

}
