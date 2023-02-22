package com.obsqura.TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\renju\\eclipse-workspace-obsqura\\TestNGProject\\src\\main\\java\\Resources\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
	}
	
	@AfterMethod
	 public void afterTest()
	    {
	    	//driver.close();
	    	driver.quit();
	    }

	
}
