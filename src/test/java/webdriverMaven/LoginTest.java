package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
	
		driver= new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin(){
		
		driver.get("http://mail.yahoo.com");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("testwebdriver1");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("justin@123");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();//new line added to click on the sigin button
		//ADDING COMMENTS IN LOGINTEST.JAVA FILE
	}
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
