package practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class AmazonCssLocatorForEdge {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.com");
	driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Vivo V23");
	driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
	System.out.println(driver.getTitle());
	driver.close();
}
}
