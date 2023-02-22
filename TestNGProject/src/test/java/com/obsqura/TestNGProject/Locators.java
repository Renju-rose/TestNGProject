package com.obsqura.TestNGProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base{
	@Test
	public void locatorById()
	{
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("nav-logo-sprites"));
		driver.findElement(By.id("navBackToTop"));
		driver.findElement(By.id("gw-content-grid"));
		driver.findElement(By.id("desktop-btf-grid-4"));
		driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	    driver.navigate().to("https://www.nykaa.com/");
	    driver.findElement(By.id("portal-root"));
		driver.findElement(By.id("footer_id"));
		driver.findElement(By.id("63981356d20610c3a33c36fe"));
	    driver.findElement(By.id("nykaaNetwork"));
	    driver.findElement(By.id("black_layer"));
	 }
	@Test
	public void locatorByName()
	{
		driver.findElement(By.name("glow-validation-token"));
		driver.findElement(By.name("dropdown-selection-ubb"));
		driver.navigate().to("https://www.nykaa.com/");
		driver.findElement(By.name("og:description"));
		driver.findElement(By.name("twitter:description"));
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.name("login-button"));
	}
	@Test
	public void locatorByClass()
	{
		driver.findElement(By.className("nav-search-submit-text"));
	    driver.findElement(By.className("skip-link"));
		driver.findElement(By.className("nav-logo-locale"));
		driver.findElement(By.className("layoutToolbarPadding"));
		driver.findElement(By.className("icp-nav-link-inner"));
	}
	@Test
	public void locatorByLinkText()
	{
		driver.findElement(By.linkText("Gift Cards"));
		driver.findElement(By.linkText("Registry"));
		driver.findElement(By.linkText("Customer Service"));
		driver.findElement(By.linkText("Today's Deals"));
		driver.findElement(By.linkText("Your Ads Privacy Choices"));
	}
	@Test
	public void locatorByPartialLinkText()
	{
		driver.findElement(By.partialLinkText("Cards"));
		driver.findElement(By.partialLinkText("Service"));
		driver.findElement(By.partialLinkText("Deals"));
		driver.findElement(By.partialLinkText("Choices"));
		driver.findElement(By.partialLinkText("go to amazon.in")); 
		
	}
	@Test
	public void locatorByTagName()
	{
		driver.findElement(By.tagName("a"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.tagName("select"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.tagName("span"));
		driver.findElement(By.tagName("header"));
		driver.findElement(By.tagName("label"));
		driver.findElement(By.tagName("img"));
		driver.findElement(By.tagName("form"));
	}
	@Test
	public void locatorByCssSelector()
	{
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		driver.findElement(By.cssSelector("div#nav-main"));
		driver.findElement(By.cssSelector("input#unifiedLocation1ClickAddress"));
		driver.findElement(By.cssSelector("a.skip-link"));
		driver.findElement(By.cssSelector("div.rhf-frame"));
		driver.findElement(By.cssSelector("div.rhf-header"));
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));
		driver.findElement(By.cssSelector("img[data-a-hires='https://m.media-amazon.com/images/I/71tIrZqybrL._SX3000_.jpg']"));
		driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=glowValidationToken]"));
		driver.findElement(By.cssSelector("div.layoutToolbarPadding[id='nav-tools']"));
		driver.findElement(By.cssSelector("span.nav-search-submit-text[id='nav-search-submit-text']"));
	
	}
	@Test
	public void locatorByXpath()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
	    driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));
		driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
		driver.findElement(By.xpath("//div[@id='gw-card-layout']"));
		driver.findElement(By.xpath("//div[text()='EN']"));
		driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		driver.findElement(By.xpath("//a[text()='Registry']"));
		driver.findElement(By.xpath("//a[text()='Customer Service']"));
		driver.findElement(By.xpath("//a[text()='Your Ads Privacy Choices']"));
		
	}
}