package com.obsqura.TestNGProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElements extends Base {
	@Test
	public void listFindElements()
	{
		
		List<WebElement> inputFormCategories=driver.findElements(By.xpath("//li[@class='list-group-item']"));
		int size=inputFormCategories.size();
	}

}
