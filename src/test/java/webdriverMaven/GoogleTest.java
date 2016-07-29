package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		driver = new FirefoxDriver();
	}
	
	@Test
	public void click() throws InterruptedException{
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		//ADDING NEW COMMENTS AS TEST
	}

	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
}
