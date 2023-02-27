package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ServiceLineHomePage {
	Logger log= Logger.getLogger(ServiceLineHomePage.class.getName());
	public void searchExistingServiceLine() throws InterruptedException
	{
		
		String name,displayValue;
		name=UtilityClass.fn_getText("ServiceLineHomePage_serviceOfferingName_label");
		displayValue=UtilityClass.fn_getText("ServiceLineHomePage_serviceOfferingvalue_label");
		log.info(name);
		log.info(displayValue);
		
		
		log.info("Distribution Service line details validated");
		
		Thread.sleep(2000);
		UtilityClass.fn_clickByAction("ServiceLineHomePage_serviceLine_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("ServiceLineHomePage_serviceLine_dropdown_option2");
		Thread.sleep(3000);
		
		name=UtilityClass.fn_getText("ServiceLineHomePage_serviceOfferingName_label");
		displayValue=UtilityClass.fn_getText("ServiceLineHomePage_serviceOfferingvalue_label");
		
		log.info("Projects Service line details validated");
		
		Thread.sleep(2000);
		UtilityClass.fn_clickByAction("ServiceLineHomePage_serviceLine_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("ServiceLineHomePage_serviceLine_dropdown_option3");
		Thread.sleep(3000);
		
		name=UtilityClass.fn_getText("ServiceLineHomePage_serviceOfferingName_label");
		displayValue=UtilityClass.fn_getText("ServiceLineHomePage_serviceOfferingvalue_label");
		
		log.info("Warehouse Service line details validated");
		
		
		Thread.sleep(2000);
		UtilityClass.fn_clickByAction("ServiceLineHomePage_serviceLine_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("ServiceLineHomePage_serviceLine_dropdown_option4");
		Thread.sleep(3000);
		
		name=UtilityClass.fn_getText("ServiceLineHomePage_serviceOfferingName_label");
		displayValue=UtilityClass.fn_getText("ServiceLineHomePage_serviceOfferingvalue_label");
		
		log.info("WMS+distribution Service line details validated");
		
	}

}
