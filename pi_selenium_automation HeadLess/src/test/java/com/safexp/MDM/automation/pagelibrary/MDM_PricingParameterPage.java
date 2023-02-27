package com.safexp.MDM.automation.pagelibrary;

import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class MDM_PricingParameterPage {
	
	public void searchAndValidateExistingPricingParameterDetails(String pricingParameterName) throws InterruptedException
	{
		String AttributeTypeValue;
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("PricingParameter_searchbox_input", pricingParameterName);	
		Thread.sleep(5000);
		String s=UtilityClass.fn_getText("PricingParameter_Name");
		System.out.println(s);
		
		UtilityClass.takeScreenshot();
		
	}


}
