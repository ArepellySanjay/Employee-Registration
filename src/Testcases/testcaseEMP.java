package Testcases;

import Utils.Apputils;
import orangehrm_libreary.empRegistration;
import orangehrm_libreary.login;

public class testcaseEMP 
{

	public static void main(String[] args) throws Throwable 
	{

		//Apputils.lanchApp("http://orangehrm.qedgetech.com");

		login akhil = new login();
		akhil.login("Admin", "Qedge123!@#");

		empRegistration mounika = new empRegistration();
		boolean table = mounika.addemployee("pravalika", "ponnam");
		if(table)
		{
			System.out.println("Test pass");
		}else
		{
			System.out.println("Test fail");
		}
	}
}
