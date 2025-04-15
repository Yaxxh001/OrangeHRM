package Base;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ProjectPage.OrangeHRM_LoginPage;




public class LoginTest extends BaseTest {
	
	 @Test (priority=1)
	  void testValidLogin() throws InterruptedException
	  {
		 OrangeHRM_LoginPage h1 = new OrangeHRM_LoginPage(driver);  
           h1.setUsername("Admin");
           h1.setPassword("admin123");
           h1.click();
           Thread.sleep(5000);
           
           Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	       
        //Pim Module
           
           driver.findElement(By.xpath("//span[text()='PIM']")).click();
           driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
           driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jhon");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Vik");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Snow");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//button[@type='submit']")).click();
           
           driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
           driver.findElement(By.xpath("//a[text()='Employee List']")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Jhon");
           driver.findElement(By.xpath("//button[@type='submit']")).click();
           Thread.sleep(2000);
           
           driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
           driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  }
	   

 }

