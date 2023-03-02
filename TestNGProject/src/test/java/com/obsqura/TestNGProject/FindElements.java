package com.obsqura.TestNGProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElements extends Base {
	@Test
	public void listFindElements(String inputCategory)
	{
		
		List<WebElement> inputFormCategories=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		//int size=inputFormCategories.size();
		for(WebElement category:inputFormCategories)
		{
			if(category.getText().equals(inputCategory))
			{
				category.click();
				break;
			}
			
		}
	}
	

}
