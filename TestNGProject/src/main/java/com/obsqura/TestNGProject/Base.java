package com.obsqura.TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\renju\\git\\TestNGProject\\TestNGProject\\src\\main\\java\\Resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(options);
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
       // driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        
	}
	
	@AfterMethod
	 public void afterTest()
	    {
	    	//driver.close();
	    	driver.quit();
	    }

	
}
