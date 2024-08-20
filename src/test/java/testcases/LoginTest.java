package testcases;

import java.net.SocketTimeoutException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {
	@Test
  public static void SignUp() throws SocketTimeoutException {
		try {
	  System.out.println("Clicked successfully");
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	  WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='signupcontainer']//a[@class='signUp'][normalize-space()='Sign up']")));
      signUpButton.click();
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("roopamn2000@gmail.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Roopa@9876");
	  driver.findElement(By.xpath("//input[@id='rmobile']")).sendKeys("7760179724");
	  driver.findElement(By.xpath("//*[@class='unchecked']")).click();
	  driver.findElement(By.xpath("//*[@id='signupbtn']")).click();
	  
	  
		}
		catch (Exception e) {
	        System.err.println("An exception occurred: " + e.getMessage());
	    }
	  
  }
	
	

}
