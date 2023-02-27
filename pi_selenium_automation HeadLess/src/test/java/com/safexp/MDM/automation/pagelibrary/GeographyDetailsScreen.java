package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class GeographyDetailsScreen {
	Logger log=Logger.getLogger(GeographyDetailsScreen.class.getName());
	public void ValidateGeography() throws InterruptedException
	{   boolean status=false;
	
//	UtilityClass.fn_Click("GeographyDetailsScreen_countryName_dropdown");
	Thread.sleep(3000);
//	UtilityClass.fn_Click("GeographyDetailsScreen_countryName_dropdown_options");
	Thread.sleep(3000);
	UtilityClass.fn_Click("GeographyDetailsScreen_state_dropdown");
	UtilityClass.fn_Click("GeographyDetailsScreen_state_dropdown_options");	
	Thread.sleep(3000);
	UtilityClass.fn_Click("GeographyDetailsScreen_district_dropdown");
	UtilityClass.fn_Click("GeographyDetailsScreen_district_dropdown_options");
	Thread.sleep(3000);
	UtilityClass.fn_Click("GeographyDetailsScreen_City_dropdown");
	UtilityClass.fn_Click("GeographyDetailsScreen_City_dropdown_options");
	Thread.sleep(3000);
	UtilityClass.fn_Click("GeographyDetailsScreen_pincode_dropdown");
	UtilityClass.fn_Click("GeographyDetailsScreen_pincode_dropdown_options");
	UtilityClass.takeScreenshot();
	Thread.sleep(3000);
		
		
	}
	
	/*public void ClickOnAddPincode()
	{
		UtilityClass.fn_clickByAction("GeographyDetailsScreen_pincodeAdd_icon");
		}*/
	public void validatePinCodeDetails(String pincode)
	{
		UtilityClass.fn_clickByAction("GeographyDetailsScreen_ViewPinCodeDetails_button");
		//WebElement we= UtilityClass.getWebElement("GeographyDetailsScreen_ViewPinCodeDetails_countryName_dropdown");
		//String coutnryname=UtilityClass.fn_getTextfromDisabledElement(we);
		UtilityClass.fn_validateText("GeographyDetailsScreen_ViewPinCodeDetails_pincode_input",pincode);
		
	}

}
