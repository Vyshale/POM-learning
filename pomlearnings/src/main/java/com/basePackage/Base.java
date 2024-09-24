package com.basePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	String url = "https://demowebshop.tricentis.com/login";
	
	public WebDriver driver ;
	@BeforeMethod
	
	public void startApp()
	{
		driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get(url);
	
	//driver.findElement(By.linkText("Log in")).click();
	
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}

}
