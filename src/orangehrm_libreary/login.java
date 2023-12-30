package orangehrm_libreary;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.Apputils;

public class login extends Apputils
{
 // @BeforeTest
	public void login(String uid,String pwd) 
	{
	
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	//@AfterTest
	public void logout(String logout) 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.partialLinkText(logout));
	}
//-----------------------------------------------------------------------------------
	
	
	
	public boolean isAdminModuledisplayed()
	 {
		if (driver.findElement(By.linkText("Admin")).isDisplayed())
		{
		 return true; 
		}
		{
			return false;
		}
	}
	
	
}
