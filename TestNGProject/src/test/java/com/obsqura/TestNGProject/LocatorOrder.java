package com.obsqura.TestNGProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorOrder extends Base{
	@Test
	public void locatorById()
	{
		driver.findElement(By.id("twotabsearchtextbox"));//0.09 s
	}
	@Test
	public void locatorByName()
	{
	    driver.findElement(By.name("site-search"));//0.075 s
	}
	@Test
	public void locatorByClassName()
	{
	    driver.findElement(By.className("nav-search-field"));//0.033 s
	}
	@Test
	public void locatorByLinkText()
	{
		driver.findElement(By.linkText("Gift Cards"));//0.094 s
	}
	@Test
	public void locatorByPartialLinkText()
	{
		driver.findElement(By.partialLinkText("Cards"));//0.104 s
	
    }
	@Test
	public void locatorByTagName()
	{
		driver.findElement(By.tagName("a"));//0.031 s
	}
	@Test
	public void locatorByCssSelector()
	{
	    driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));//0.028 s
	}
	@Test
	public void locatorByXpath()
	{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//0.045 s
	}
}
