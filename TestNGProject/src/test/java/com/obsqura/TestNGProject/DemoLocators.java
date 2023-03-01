package com.obsqura.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoLocators extends Base{
	@Test
	public void menuTab()
	{
		String inputMessage="Hello Obsqura";
		String expectedMessage="Your Message : "+inputMessage;
		WebElement singleInputFieldTextbox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputFieldTextbox.sendKeys(inputMessage);
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessage=driver.findElement(By.cssSelector("div[id=message-one]"));
		String yourMessageText=yourMessage.getText();
		assertEquals(expectedMessage,yourMessageText,"Messages are not same");
	}
	@Test
	public void verifySingleInputField()
	{
		String expectedSingleInputField="Single Input Field";
		WebElement InputField=driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
		String actualInputField=InputField.getText();
		assertEquals(expectedSingleInputField,actualInputField,"TextName is not Single Input Field");
	}
	@Test
	public void verifyShowMessageButton()
	{
		String expectedMessage="Show Message";
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageText=showMessage.getText();
		assertEquals(expectedMessage,showMessageText,"Button Text is not show Message");
	}
	@Test
	public void singleInputField()
	{
		String inputMessage="Hello Obsqura";
		WebElement singleInputFieldTextbox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean isSingleInputFieldTextboxDisplayed=singleInputFieldTextbox.isDisplayed();
		assertTrue(isSingleInputFieldTextboxDisplayed,"Single Input Field Texbox is not Displayed");
		singleInputFieldTextbox.sendKeys(inputMessage);
		singleInputFieldTextbox.clear();
		String tagName=singleInputFieldTextbox.getTagName();
		String placeHolder=singleInputFieldTextbox.getAttribute("placeholder");
		String idAttribute=singleInputFieldTextbox.getAttribute("id");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgroundColor=showMessageButton.getCssValue("background-color");
		String borderColor=showMessageButton.getCssValue("border-color");
		
		List<WebElement> inputFormCategories=driver.findElements(By.xpath("//li[@class='list-group-item']"));
	}
	@Test
	public void verifyShowMessageButtonLocationAndSize()
	{
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		Point location=showMessageButton.getLocation();
		int showMessageButtonX=location.getX();
		int showMessageButtonY=location.getY();
		Dimension showMessageButtonDimension=showMessageButton.getSize();
		int showMessageButtonHeight=showMessageButtonDimension.getHeight();
		int showMessageButtonWidth=showMessageButtonDimension.getWidth();
	}
	@Test
	public void verifyShowMessageFontColor()
	{
		String expectedColor="rgba(255, 255, 255, 1)";
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualFontColor=showMessage.getCssValue("color");
		assertEquals(expectedColor,actualFontColor,"Font Colors are not same");
	}
	@Test
	public void verifyShowMessageFontSize()
	{
		String expectedFontSize="16px";
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualFontSize=showMessage.getCssValue("font-size");
		assertEquals(expectedFontSize,actualFontSize,"Font Size are not same");
	}
	@Test
	public void verifyShowMessageButtonShape()
	{
		String expectedShowMessageShape="4px";
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageShape=showMessage.getCssValue("border-radius");
		assertEquals(expectedShowMessageShape,showMessageShape,"Show Message Button shape's are not same");
	}
	@Test
	public void verifyGetTotalButtonColorAndText()
	{
		String expectedGetTotalText="Get Total";
		String expectedGetTotalButtonColor="rgba(0, 123, 255, 1)";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		String actualGetTotalText=getTotalButton.getText();
		assertEquals(expectedGetTotalText,actualGetTotalText,"Get Total Text are not same");
		String totalButtonColor=getTotalButton.getCssValue("background-color");
		assertEquals(expectedGetTotalButtonColor,totalButtonColor,"Get Total Button Colors are not same");
	}
	@Test
	public void verifyGetTotalButtonAndValueBTextboxAlignment()
	{
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		Point getTotalButtonLocation=getTotalButton.getLocation();
		int getTotalButtonX=getTotalButtonLocation.getX();
		int getTotalButtonY=getTotalButtonLocation.getY();
		WebElement valueBTextbox=driver.findElement(By.xpath("//input[@id='value-b']"));
		Point valueBTextboxLocation=valueBTextbox.getLocation();
		int valueBTextBoxX=valueBTextboxLocation.getX();
		int valueBTextboxY=valueBTextboxLocation.getY();
		boolean greaterAlignment=(getTotalButtonY>valueBTextboxY);
		assertTrue(greaterAlignment,"ValueB Textbox Alignment is greater than GetTotal Button");
		
	}
	@Test
	public void verifyTwoInputFields()
	{
		int inputValueA=50;
		int inputValueB=40;
		int finalValue=inputValueA+inputValueB;
		String expectedGetTotalOutput="Total A + B : "+finalValue;
		WebElement valueATextBox=driver.findElement(By.xpath("//input[@id='value-a']"));
		boolean isValueATextBoxDisplayed=valueATextBox.isDisplayed();
		assertTrue(isValueATextBoxDisplayed,"Value A Textbox ffield is not Displayed");
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys(Integer.toString(inputValueA));
		WebElement valueBTextBox=driver.findElement(By.xpath("//input[@id='value-b']"));
		boolean isValueBTextBoxDisplayed=valueBTextBox.isDisplayed();
		assertTrue(isValueBTextBoxDisplayed,"Value B Textbox is not Displayed");
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(Integer.toString(inputValueB));
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean getTotalButtonEnabled=getTotalButton.isEnabled();
		getTotalButton.click();
      	WebElement getTotalOutput=driver.findElement(By.xpath("//div[@id='message-two']"));
      	String actualGetTotalOutput=getTotalOutput.getText();
		assertEquals(expectedGetTotalOutput,actualGetTotalOutput,"Outputs are not same");
		
	}

}
