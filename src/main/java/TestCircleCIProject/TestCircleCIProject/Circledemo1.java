package TestCircleCIProject.TestCircleCIProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Circledemo1 {
	
	public WebDriver driver;
	String url="http://toolsqa.com/automation-practice-form/";
	String exePath = "C:\\Users\\srinivas.simakurthi\\git\\CircleCITest\\Driver\\chromedriver.exe";
	
	@Test
	
	public  void test()
	{
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Praveen");
		driver.findElement(By.name("lastname")).sendKeys("Allam");
	}
	
	@BeforeMethod
	
	public void beforeMethod()
	{
		
		 System.setProperty("webdriver.chrome.driver", exePath);
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get(url);
		  
		  
	}
	
	@AfterMethod
	public void tearDown()
	{
//		driver.quit();
	}

}

