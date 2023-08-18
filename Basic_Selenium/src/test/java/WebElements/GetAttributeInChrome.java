package WebElements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeInChrome {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//fetch the address of mobile
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println("Attribute is : "+mobile.getAttribute("class"));
		Point coOrdinates=mobile.getLocation();
		System.out.println("X and Y coordinates of test field are");
		System.out.println(coOrdinates.getX());
		System.out.println(coOrdinates.getY());
		
		Dimension size=mobile.getSize();
		System.out.println("height and width of test field are");
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		System.out.println("Tag name is :"+mobile.getTagName());
		
		driver.close();
	}

}
