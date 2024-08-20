package testcases;

import java.util.Locale;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class SignIn extends BaseTest{
	@Test(dataProviderClass = ReadXLSdata.class, dataProvider="bvtdata")
public  static void Sigin(String UserName, String Password)throws Exception{
	try{
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//*[@id='login_id']")).sendKeys(UserName);
		driver.findElement(By.xpath("//*[@id='nextbtn']")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id='nextbtn']")).click();
		//changed from sysyeme
		
	}
catch(Exception e) {
	e.printStackTrace();
	System.out.println("Exception Handled");
}
	
}
}
