package practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AmazonCSSLocatorForFirefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox")).sendKeys("Vivo v21");
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
