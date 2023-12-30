package orangehrm_libreary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Apputils;

public class empRegistration extends  Apputils
{

	public boolean addemployee(String fname,String lname) throws Throwable 
	{

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();

		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);

		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		Thread.sleep(2000);
		WebElement table;
		table =	driver.findElement(By.id("resultTable"));
		List<WebElement>rows= table.findElements(By.tagName("tr"));

		boolean isdisplayed=false;


		for (int i=1;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			if (cols.get(1).getText().equals(empid))
			{ 
				isdisplayed=true;
			}else
			{

				return false;
			}
			driver.close();
		}
		return isdisplayed;
		
		
	}
}
