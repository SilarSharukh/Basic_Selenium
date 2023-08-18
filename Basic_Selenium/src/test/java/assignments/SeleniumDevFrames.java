package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class SeleniumDevFrames {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr1=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File dest=new File("./Frames/ScreenShot/frame1.png");
		FileUtils.copyFile(scr1, dest);
		driver.switchTo().defaultContent();
		//SwitchTo new Frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		File scr2=ts.getScreenshotAs(OutputType.FILE);
		File dest2= new File("./Frames/ScreenShot/frame2.png");
		FileUtils.copyFile(scr2, dest2);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//sWitchTo newFrame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		File scr3=ts.getScreenshotAs(OutputType.FILE);
		File dest3= new File("./Frames/ScreenShot/frame3.png");
		FileUtils.copyFile(scr3, dest3);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.close();
		
		
		

	}

}
