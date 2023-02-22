package com.obsqura.TestNGProject;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import org.testng.annotations.Test;

public class Assertions extends Base{
	@Test
	public void AssertCommands()
	{
		 String expectedUrl="https://www.flipkart.com/";
		 String actualUrl=driver.getCurrentUrl();
		 String verifyAssertNull=null;
		 String verifyAssertNotNull="hai";
		 String actualPageSource="Meesho";
		 String pageSource=driver.getPageSource();
	     assertNotEquals(expectedUrl,actualUrl,"Navigated to Flipkart");
		 assertNull(verifyAssertNull);
	     assertNotNull(verifyAssertNotNull);
		 assertFalse(pageSource.contains(actualPageSource),"Substring Meesho Found");
	}
	/*String str1="https://www.flipkart.com/",str2="myntra";
	System.out.println("count " +substring_rec(str1,str2));
	static int substring_rec(String str,String sub)
	{
		if(str.contains(sub))
		{
			return 1+substring_rec(str.replaceFirst(sub, ""), sub);
		}
		return 0;
	}*/
	
}
