package com.obsqura.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxDemo extends Base {
	@Test
	public void checkBoxDemo()
	{
		String expectedSuccessCheckBoxMessage="Success - Check box is checked";
		SelectCategory SelectCategoryObject=new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Checkbox Demo");
		WebElement clickCheckBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickCheckBox.click();
		WebElement successCheckBoxMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualSuccessCheckBoxMessage=successCheckBoxMessage.getText();
		assertEquals(expectedSuccessCheckBoxMessage,actualSuccessCheckBoxMessage,"Success Message displayed is not same");
		
	}
	@Test
	public void verifyMultipleCheckBoxDemo()
	{
		SelectCategory SelectCategoryObject=new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Checkbox Demo");
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean checkBoxOneSelected=checkBoxOne.isSelected();
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean checkBoxTwoSelected=checkBoxTwo.isSelected();
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean checkBoxThreeSelected=checkBoxThree.isSelected();
		WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean checkBoxFourSelected=checkBoxFour.isSelected();
		assertFalse(checkBoxOneSelected&&checkBoxTwoSelected&&checkBoxThreeSelected&&checkBoxFourSelected,"All CheckBoxes are not selected");
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		String expectedValue=selectAllButton.getAttribute("value");
		boolean selectAllButtonEnabled=selectAllButton.isEnabled();
		selectAllButton.click();
		boolean checkBoxOneAfterSelected=checkBoxOne.isSelected();
		boolean checkBoxTwoAfterSelected=checkBoxTwo.isSelected();
		boolean checkBoxThreeAfterSelected=checkBoxThree.isSelected();
        boolean checkBoxFourAfterSelected=checkBoxFour.isSelected();
		assertTrue(checkBoxOneAfterSelected&&checkBoxTwoAfterSelected&&checkBoxThreeAfterSelected&&checkBoxFourAfterSelected,"All CheckBoxes are selected");
		WebElement unSelectAllButton=driver.findElement(By.xpath("//input[@value='Unselect All']"));
		String actualValue=unSelectAllButton.getAttribute("value");
		assertNotEquals(expectedValue,actualValue,"Values are same");
		
	}

}
