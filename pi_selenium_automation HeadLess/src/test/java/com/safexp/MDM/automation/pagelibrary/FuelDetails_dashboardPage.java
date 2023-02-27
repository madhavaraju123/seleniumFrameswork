package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class FuelDetails_dashboardPage {
	Logger log=Logger.getLogger(FuelDetails_dashboardPage.class.getName());

	public void ValidateExistingDetails() throws Exception
	{
		String fuelIndex,fuelType,type,description;
		log.info("Validating details");
		UtilityClass.fn_Click("FuelDetails_dashboardPage_searchbox_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("FuelDetails_dashboardPage_searchbox_dropdown_option2");
		Thread.sleep(3000);
		fuelIndex=UtilityClass.fn_getText("FuelDetails_dashboardPage3rdelement_fuelIndex_label");
		log.info(fuelIndex);
		fuelType=UtilityClass.fn_getText("FuelDetails_dashboardPage3rdelement_fuelType_label");
		log.info(fuelType);
		type=UtilityClass.fn_getText("FuelDetails_dashboardPage3rdelement_type_label");
		log.info(type);
		description=UtilityClass.fn_getText("FuelDetails_dashboardPage3rdelement_description_label");
		log.info(description);
		UtilityClass.fn_Click("FuelDetails_dashboardPage_ViewDetails");
		UtilityClass.takeScreenshot();
		
		UtilityClass.fn_Click("FuelDetails_back_button");
	}
	
	public void ValidateMetroMapping() throws InterruptedException
		{
		
		UtilityClass.fn_Click("FuelDetails_dashboardPage_MetroMapping_tab");
			
		String fuelIndex,fuelType,type,expiryDate;
		log.info("Validating details");
		
		UtilityClass.takeScreenshot();
		
		
	}
	
	
	public void clickOnViewDetailsButton()
	{
		UtilityClass.fn_Click("FuelDetails_dashboardPage_ViewDetails_button3");
	}
}
