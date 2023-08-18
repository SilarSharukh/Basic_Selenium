package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;
@BeforeMethod
public void openApp() {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");		
}
@Test
public void login() {
	driver.findElement(By.id("email"));
	driver.findElement(By.id("pass"));
	String title=driver.getTitle();
	//hardAssert or ssert
	//Assert.assertEquals(title,"Facebook – log in or sign up");
	// softAssert
	SoftAssert s=new SoftAssert();
	s.assertEquals(title, "Facebook - log in or sign up");
	
	System.out.println(driver.getCurrentUrl());
}
@AfterMethod
public void closeApp()
{
	driver.close();
}
}
