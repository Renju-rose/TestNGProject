package com.obsqura.TestNGProject;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavigateCommands extends Base{
//	@Test  
	  public void navigateCommands() 
	  {
		
	    String expectedUrl="https://www.flipkart.com/";
	    String actualUrl=driver.getCurrentUrl();
	    String expectedUrlOne="https://www.amazon.in/";
	    String actualUrlOne=driver.getCurrentUrl();
	    String expectedUrlTwo="https://www.flipkart.com/";
		String actualUrlTwo=driver.getCurrentUrl();
		String expectedUrlThree="https://www.flipkart.com/";
		String actualUrlThree=driver.getCurrentUrl();
	    driver.navigate().to("https://www.flipkart.com/"); 
	    assertEquals(expectedUrl,actualUrl,"Url's are not same");
	    driver.navigate().back();
	    assertEquals(expectedUrlOne,actualUrlOne,"Url's are not same");
	    driver.navigate().forward(); 
	    assertEquals(expectedUrlTwo,actualUrlTwo,"Url's are not same");
	   	driver.navigate().refresh(); 
	    assertEquals(expectedUrlThree,actualUrlThree,"Url's are not same");
	  }
	@Test
	public void softAssertCommands() 
	  {
		
	    String expectedUrl="https://www.flipkart.com/com";
	    String actualUrl=driver.getCurrentUrl();
	    String expectedUrlOne="https://www.amazon.com/";
	    String actualUrlOne=driver.getCurrentUrl();
	    String expectedUrlTwo="https://www.flipkart.com/";
		String actualUrlTwo=driver.getCurrentUrl();
		String expectedUrlThree="https://www.flipkart.com/";
		String actualUrlThree=driver.getCurrentUrl();
		SoftAssert softAssert=new SoftAssert();
	    driver.navigate().to("https://www.flipkart.com/"); 
	    softAssert.assertEquals(expectedUrl,actualUrl,"Url's are not same");
	    driver.navigate().back();
	    softAssert.assertEquals(expectedUrlOne,actualUrlOne,"Url's are not same");
	    driver.navigate().forward(); 
	    softAssert.assertEquals(expectedUrlTwo,actualUrlTwo,"Url's are not same");
	   	driver.navigate().refresh(); 
	    softAssert.assertEquals(expectedUrlThree,actualUrlThree,"Url's are not same");
	    softAssert.assertAll();
	  }


}
