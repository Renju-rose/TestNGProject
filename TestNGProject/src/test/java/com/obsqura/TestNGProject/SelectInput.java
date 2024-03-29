package com.obsqura.TestNGProject;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectInput extends Base{
	@Test
	public void selectInputDemo()
	{
		String inputColor="Green";
		String expectedColor="Selected Color : "+inputColor;
		SelectCategory SelectCategoryObject=new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Select Input");
		WebElement selectColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectObject=new Select(selectColor);
		selectObject.selectByIndex(2);
		selectObject.selectByIndex(3);
	    WebElement displayedColor=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualdisplayedColor=displayedColor.getText();
		assertEquals(expectedColor,actualdisplayedColor,"Color displayed is not the expected one");
		selectObject.selectByVisibleText("Red");
		selectObject.selectByVisibleText("Yellow");
		selectObject.selectByVisibleText("Green");
		selectObject.selectByValue("Red");
		selectObject.selectByValue("Yellow");
		selectObject.selectByValue("Green");
		List<WebElement> options=selectObject.getOptions();
		int count=options.size();
	}
	@Test
	public void verifyMultipleDropdownSelection()
	{
		SelectCategory SelectCategoryObject=new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Select Input");
		WebElement selectColor=driver.findElement(By.xpath("//select[@id=\"multi-select-field\"]"));
		Select selectObject=new Select(selectColor);
		WebElement getAllSelectedButton=driver.findElement(By.xpath("//button[@id='button-all']"));
		boolean isMultipleDropdown=selectObject.isMultiple();
		selectObject.selectByIndex(1);
		selectObject.selectByIndex(2);
		selectObject.selectByVisibleText("Red");
		selectObject.selectByVisibleText("Yellow");
		selectObject.selectByVisibleText("Green");
		selectObject.selectByValue("Red");
		selectObject.selectByValue("Yellow");
		selectObject.selectByValue("Green");
		selectObject.deselectAll();
		getAllSelectedButton.click();
	}
	@Test
	public void verifySelectInputDemoUsingFindElements()
	{
        String selectInput="Red";
        SelectCategory SelectCategoryObject=new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Select Input");
		List<WebElement> selectInputDemoCategories=driver.findElements(By.xpath("//select[@id='single-input-field']//option"));
		
		for(WebElement colorCategory:selectInputDemoCategories)
		{
			if(colorCategory.getAttribute("value").equals(selectInput))
			{
				colorCategory.click();
				break;
			}
			
		}
	}

}
