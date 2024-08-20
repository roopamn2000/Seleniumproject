
package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
public static WebDriver driver;
public static Properties prop=new Properties();


 @BeforeTest
public void setUp() throws IOException {
	if(driver==null) {
	
		FileReader fr1=new FileReader("C:\\Users\\Naveen Reddy E\\OneDrive\\Desktop\\Roopa Project\\SeleniumProject\\src\\test\\resources\\configfiles\\config.properties");
		
	prop.load(fr1);
	
	}
	
	
	 if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(prop.getProperty("testurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
}
@AfterTest
public void teardown() {
	driver.close();
	System.out.println("teardown successful");
}


}





