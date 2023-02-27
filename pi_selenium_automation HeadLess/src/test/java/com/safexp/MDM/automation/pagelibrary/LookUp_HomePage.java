package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class LookUp_HomePage {
	Logger log=Logger.getLogger(LookUp_HomePage.class.getName());
	public void ClickOnFuelTab() throws InterruptedException
	{
		Thread.sleep(3000);
		log.info("Clicked on Fuel tab");
		UtilityClass.fn_Click("LookUp_HomePage_FuelTab");
		Thread.sleep(10000);
		log.info("Clicked on Fuel tab");
	}
	public void ClickOnProductMasterTab() throws InterruptedException
	{
		Thread.sleep(2000);
		UtilityClass.fn_Click("LookUp_HomePage_ProductMasterTab");
		Thread.sleep(3000);
		log.info("Clicked on ProductMaster tab");
	}
	
	public void ClickOnSegmentTab() throws InterruptedException
	{
		Thread.sleep(3000);
		log.info("Clicking on Segment tab");
		UtilityClass.fn_Click("LookUp_HomePage_SegmentTab");
		Thread.sleep(5000);
		log.info("Clicked on Segment tab");
	}

	public void ClickOnGSTtab() throws InterruptedException
	{
		Thread.sleep(2000);
		log.info("Clicked on GST tab");
		UtilityClass.fn_Click("LookUp_HomePage_GSTTab");
		Thread.sleep(3000);
		log.info("Clicked on GST tab");
	}
	
	public void ClickOnServiceLinetab() throws InterruptedException
	{
		Thread.sleep(3000);
		log.info("Clicking on Service line tab");
		UtilityClass.fn_clickByAction("LookUp_HomePage_ServicelineTab");
		Thread.sleep(15000);
		log.info("Clicked on service line tab");
	}
	public void ClickOnFeaturetab() throws InterruptedException
	{
		Thread.sleep(5000);
		log.info("Clicking on feature  tab");
		UtilityClass.fn_clickByAction("LookUp_HomePage_FeatureTab");
		Thread.sleep(7000);
		log.info("Clicked on Feature tab");
	}
	
	public void searchExistingLookupType(String lookupType) throws InterruptedException
	{
		boolean status= false;
		UtilityClass.fn_InputAndPressEnter("LookUp_HomePage_search_input",lookupType);
		Thread.sleep(12000);
		
		log.info("Validating LookupType details");
		String name,displayValue;
		name=UtilityClass.fn_getText("LookUp_HomePage_name_label");
		log.info(name);
		displayValue=UtilityClass.fn_getText("LookUp_HomePage_displayValue_label");
		log.info(displayValue);
		UtilityClass.fn_Click("LookUp_HomePage_viewDetails_button");	
		
		UtilityClass.takeScreenshot();
      
		
		
	}

}
