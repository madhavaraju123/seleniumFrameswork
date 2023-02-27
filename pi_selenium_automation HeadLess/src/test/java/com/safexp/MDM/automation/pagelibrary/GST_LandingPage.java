package com.safexp.MDM.automation.pagelibrary;

import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class GST_LandingPage {
	
	public void SearchAndValidateExistingGSTDetails(String GSTName) throws InterruptedException
	{
		
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("GST_searchbox_input", GSTName);	
		Thread.sleep(5000);
		String s=UtilityClass.fn_getText("GST_Name");
		//String GSTvalue=UtilityClass.fn_getText("GST_LandingPage_GSTvalue");
		System.out.println("GST Name selected : "+s);
		//System.out.println("GST value displayed on GST details screen for selected GST name : "+GSTvalue);
		Thread.sleep(2000);
		UtilityClass.fn_Click("GST_view_icon");
		Thread.sleep(2000);
		UtilityClass.takeScreenshot();
	}
	
}
