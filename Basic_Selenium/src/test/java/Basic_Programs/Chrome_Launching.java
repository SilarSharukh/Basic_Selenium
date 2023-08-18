package Basic_Programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome_Launching {
public static void main(String[] args) {
	//Manages the chrome driver
	WebDriverManager.chromedriver().setup();
	// Opening the browser
	ChromeDriver driver = new ChromeDriver();
}
}
