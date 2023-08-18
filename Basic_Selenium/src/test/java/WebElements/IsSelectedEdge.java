package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedEdge {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();// 
		WebDriver driver=new EdgeDriver();//empty browser will open
		driver.manage().window().maximize();// maximize the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// only for findelement() and finelements() it will wait
		driver.get("http://www.facebook.com");// enter the url
		driver.findElement(By.linkText("Create new account")).click();// fetch and click the link
		WebElement email=driver.findElement(By.xpath("//label[text()='Female']"));// fetch the female radio button
		email.click();// select the radio button
		Thread.sleep(2000);
		if(email.isSelected())
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.close();

	}

}
