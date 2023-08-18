package Locators;
import java.util.List;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TagnameForEdge {
	public static void main(String[] args) {
		
	
	WebDriverManager.edgedriver().setup();;
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	for(WebElement allLinks:links) {
		System.out.println(allLinks.getText());
	}
	driver.close();
}
}