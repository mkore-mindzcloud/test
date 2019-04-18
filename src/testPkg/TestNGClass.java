package testPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	 WebDriver driver;
	  
	  @Test
	  public void f() {
		  
			WebElement Username = driver.findElement(By.id("56:34;a"));
			Username.sendKeys("pujacstest@gmail.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement Password = driver.findElement(By.id("66:34;a"));
			Password.sendKeys("testing123");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement Submit = driver.findElement(By.cssSelector("body > div.cCustomCommunityTemplate > div.mainContentArea > div > div.slds-col--padded.contentRegion.comm-layout-column > div > div > div > div > div.device-content.body-content.slds-size_12-of-12 > div > div:nth-child(5) > button"));
			Submit.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	 
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit Kore\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://uat-pioneerdev.cs20.force.com/s/login/?portfolio=Timberline");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("This is after test");
	  }

	}
