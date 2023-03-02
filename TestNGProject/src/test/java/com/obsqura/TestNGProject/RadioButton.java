package com.obsqura.TestNGProject;

import org.testng.annotations.Test;

public class RadioButton extends Base{
	@Test
	public void radioButtonDemo()
	{
		FindElements findElementsObject=new FindElements();
		findElementsObject.listFindElements("Radio Buttons Demo");
	}

}
