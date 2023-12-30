package Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Apputils;
import orangehrm_libreary.login;

public class Admin_login_testcase extends Apputils
{
    
	//@Parameters({"adminuid","adminpwd"})
	@Test
	public void checkAdminLogin() 
	{
		
		login sanju = new login();
		sanju.login("Admin", "Qedge123!@#");
	boolean res =	sanju.isAdminModuledisplayed();
	
	
	if(res)
	{
		System.out.println("test pass");
	}else
	{
		System.out.println("test fail");
	}

	    //Assert.assertTrue(res);
	   
	
	
	
	
	
	
	}		
	
}
