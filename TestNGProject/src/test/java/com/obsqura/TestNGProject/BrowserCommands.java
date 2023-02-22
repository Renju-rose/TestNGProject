package com.obsqura.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class BrowserCommands extends Base{
	@Test
	public void getTitle()
	{
	  String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String actualTitle = driver.getTitle(); 
	  assertEquals(expectedTitle,actualTitle,"Titles are not same");
	}
	 @Test 
	  public void getUrlCommand() 
	  {   String ExpectedUrl="https://www.amazon.com/"; 
	      String actualUrl=driver.getCurrentUrl();
	      assertEquals(ExpectedUrl,actualUrl,"Url's are not same");
	  }
	  @Test 
	  public void getPageSourceCommand() 
	  {
		  String actualPageSource="window.ue_ihb = (window.ue_ihb || window.ueinit";
		  String pageSource=driver.getPageSource();
	      assertTrue(pageSource.contains(actualPageSource));
	  }
	

}
