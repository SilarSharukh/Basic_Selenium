package testNGPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataproviderProgram {
	
@DataProvider
	public Object[][] getData(){
	Object[][] a=new Object[3][2];
	a[0][0]="Samar";
	a[0][1]="Samar123";
	
	a[1][0]="Suraj";
	a[1][1]="Suraj123";
	
	a[2][0]="suresh";
	a[2][1]="Samr123";
	
	return a;
	
}	
	
	@Test(dataProvider="getData")
	public void openApp(String userName,String password) throws Throwable {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");		
			driver.findElement(By.id("email")).sendKeys(userName);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			driver.close();
			
	}
}
