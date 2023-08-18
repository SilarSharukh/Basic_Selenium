package pomPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Loginpage {
	//Declaration part of address of email text field
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTf;
	
	//Declaration part of address of password text field
	@FindBy(xpath="//input[contains(@id,'pass')]")
	private WebElement passwordTf;
	
	//Declaration part of address of login button
		@FindBy(xpath="//button[@type='submit']")
		private WebElement loginB;
		
	//Initialization
		
		public FB_Loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		
	// getter and setter methods
		
		public WebElement getEmailTf() {
			return emailTf;
		}

		public void setEmailTf(WebElement emailTf) {
			this.emailTf = emailTf;
		}

		public WebElement getPasswordTf() {
			return passwordTf;
		}

		public void setPasswordTf(WebElement passwordTf) {
			this.passwordTf = passwordTf;
		}

		public WebElement getLoginB() {
			return loginB;
		}

		public void setLoginB(WebElement loginB) {
			this.loginB = loginB;
		}
		
	// utilization
		
		public void emailTextField(String data)
		{
			emailTf.sendKeys(data);
		}
		
		public void passwordTextField(String data)
		{
			passwordTf.sendKeys(data);
		}
		
		public void loginButton()
		{
			loginB.click();
		}
	
	
}
