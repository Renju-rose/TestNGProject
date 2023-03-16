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
	@Test
	public void locatorsByContainsXpath()
	{
		driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
		driver.findElement(By.xpath("//a[contains(text(),'Simple Form')]"));
		driver.findElement(By.xpath("//*[contains(@id,'single-input-field')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	    driver.findElement(By.xpath("//input[contains(@id,'gridCheck')]"));
		driver.findElement(By.xpath("//input[contains(@type,'button')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//button[contains(text(),'Show Selected Value')]"));
	}
	@Test
	public void locatorsORXpath()
	{
		driver.findElement(By.xpath("//input[@id='value-a' or @id='value-a']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@class='form-check-input' or @id='gridCheck']"));
		driver.findElement(By.xpath("//input[@type='button' or @id='button-two']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//div[@id='message-two' or @class='btn btn-primary']"));
	}
	@Test
	public void locatorsAndXpath()
	{
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//button[@id=\"button-one\" and @type=\"button\"]"));
		driver.findElement(By.xpath("//input[@id='inlineRadio21' and @class='form-check-input']"));
		driver.findElement(By.xpath("//input[@id='inlineRadio22' and @class='form-check-input']"));
	}
	@Test
	public void locatorsStartsWithXpath()
	{
		driver.findElement(By.xpath("//a[starts-with(text(),'Checkbox')]"));
	    driver.findElement(By.xpath("//a[starts-with(@href,'select-input.php')]"));
	    driver.findElement(By.xpath("//div[starts-with(@class,'copyright')]"));
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo.png')]"));
		driver.findElement(By.xpath("//a[starts-with(@id,'others')]"));
    }
	@Test
	public void loactingParentXpath()
	 {
		 driver.findElement(By.xpath("//label[@for='inputEmail4']//parent::div[@class='form-group']"));
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php']//parent::li[@class='nav-item']"));
		 driver.findElement(By.xpath("//img[@alt='logo']//parent::a[@href='index.php']"));
		 driver.findElement(By.xpath("//a[text()='Checkbox Demo']//parent::li"));
		 driver.findElement(By.xpath("//div[@class='copyright']//parent::footer[@class='mt-5']"));
	 }
	@Test
	public void loactingchildXpath()
	 {
		 driver.findElement(By.xpath("//div[@class='card']//child::div[contains(text(),'Menu')]"));
		 driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='inputEmail4']"));
		 driver.findElement(By.xpath("//div[@class='card']//child::div[contains(text(),'Two Input Fields')]"));
		 driver.findElement(By.xpath("//div[@class='form-group']//child::label"));
		 driver.findElement(By.xpath("//li[@class='list-group-item']//child::a[@href='select-input.php']"));
	 }
	@Test
	public void locatingByAncestorXpath()
	{
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::form[@method='POST']"));
		driver.findElement(By.xpath("//div[@class='row']//ancestor::section[@class='clearfix']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//div[@class='row']//ancestor::div[@class='header-top']"));
		driver.findElement(By.xpath("//div[@class='card-header']//ancestor::div[@class='container page']"));
		
	}
	@Test
	public void locatingByDescendantXpath()
	{
		driver.findElement(By.xpath("//form[@method='POST']//descendant::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='row']"));
		driver.findElement(By.xpath("//div[@class='header-top']//descendant::div[@class='container']"));
		driver.findElement(By.xpath("//div[@class='form-group']//descendant::input[@id='single-input-field']"));
		driver.findElement(By.xpath("//form[@method='POST']//descendant::div[@id='message-one']"));
	}
	@Test
	public void locatorFollowingXpath()
	{
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//div[@class='form-check']//following::div[@id='message-one']"));
		driver.findElement(By.xpath("//div[@class='form-group']//following::div[@id='message-one']"));
		driver.findElement(By.xpath("//div[@class='card']//following::div[@id='message-one']"));
		driver.findElement(By.xpath("//input[@id='is_checked']//following::input[@id='check-box-one']"));
		
	}
	@Test
	public void locatorPrecedingXpath()
	{
		driver.findElement(By.xpath("//div[@class='form-group']//preceding::input[@id='single-input-field']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//form[@method='POST']//preceding::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@id='button-one']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//div[@id='message-one']//preceding::div[@class='form-group']"));
		driver.findElement(By.xpath("//div[@class='form-group']//preceding::div[@id='message-one']"));
		driver.findElement(By.xpath("//div[@class='form-check']//preceding::input[@id='gridCheck']"));
		
		
	}
	@Test
	public void locatorsSelfXpath()
	{
		driver.findElement(By.xpath("//button[@id='button-one']//self::button"));
		driver.findElement(By.xpath("//div[@id='message-one']//self::div"));
		driver.findElement(By.xpath("//div[@id='message-two']//self::div"));
		driver.findElement(By.xpath("//button[@id='button-two']//self::button"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@id='button-two']//self::input"));
	}
	@Test
	public void locatorsFolowingSiblingXpath()
	{
		driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input[@id='single-input-field']"));
		driver.findElement(By.xpath("//label[text()='Enter value A']//following-sibling::input[@id='value-a']"));
		driver.findElement(By.xpath("//label[text()='Enter value B']//following-sibling::input[@id='value-b']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@id='gridCheck']//following-sibling::label[@class='form-check-label']"));
		driver.findElement(By.xpath("//input[@id='check-box-three']//following-sibling::label[@class='form-check-label']"));
	}
	
	
	
}