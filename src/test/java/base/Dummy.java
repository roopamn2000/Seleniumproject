package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.*;


public class Dummy {
	public static void main(String[] args) throws InterruptedException  {
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.zoho.com/");
		System.out.println("Clicked successfully");
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[contains(text(),'Sign up')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("roopamn2000@gmail.com");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Roopa@9876");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='rmobile']")).sendKeys("7760179724");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@class='unchecked']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='signupbtn']")).click();
		  
    
    
	}

}
