package Basic_Programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox_Driver {
	public static void main(String[] args) {
		//Manages the chrome driver
		WebDriverManager.firefoxdriver().setup();
		// Opening the browser
		FirefoxDriver driver = new FirefoxDriver();
	}
}
