package orangehrm_libreary;

import org.openqa.selenium.By;

import Utils.Apputils;

public class UserRegistration extends Apputils
{

	public void userReg(String role,String empname,String uname,String pword) 
	{
		
	driver.findElement(By.linkText("Admin")).click();
	driver.findElement(By.id("btnAdd")).click();
		
		
	}
	
	
	
	
}
