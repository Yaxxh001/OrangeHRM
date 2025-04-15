package ProjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage {

WebDriver driver;
	
	//Constructor
       public OrangeHRM_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator
	
	   @FindBy(xpath="//input[@name='username']")
	   WebElement txt_username;
				
		@FindBy(xpath="//input[@name='password']")
		WebElement txt_password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement btn_click;
			
	
	//Action Method
		
		public void setUsername(String user)
		{
			txt_username.sendKeys(user);
		}
		
		public void setPassword(String pwd)
		{
			txt_password.sendKeys(pwd);
		}
		
		public void click()
		{
			btn_click.click();
		}
		
		
	}


