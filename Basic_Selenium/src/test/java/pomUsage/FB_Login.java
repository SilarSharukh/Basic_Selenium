package pomUsage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPrograms.FB_Loginpage;

public class FB_Login {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		//create an object for pom file
		FB_Loginpage fbLogin= new FB_Loginpage(driver);
		fbLogin.emailTextField("admin");
		fbLogin.passwordTextField("pass");
		fbLogin.loginButton();
		Thread.sleep(10000);
		driver.close();
		
	}

}
