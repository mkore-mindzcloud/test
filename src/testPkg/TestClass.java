package testPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohit Kore\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://uat-pioneerdev.cs20.force.com/s/login/?portfolio=Timberline");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Username = driver.findElement(By.id("56:34;a"));
		Username.sendKeys("pujacstest@gmail.com");
		WebElement Password = driver.findElement(By.id("66:34;a"));
		Password.sendKeys("testing123");
		
		WebElement Submit = driver.findElement(By.cssSelector("body > div.cCustomCommunityTemplate > div.mainContentArea > div > div.slds-col--padded.contentRegion.comm-layout-column > div > div > div > div > div.desktop-content.body-content.slds-size_12-of-12 > div > div:nth-child(5) > button"));
		Submit.click();
}

}
