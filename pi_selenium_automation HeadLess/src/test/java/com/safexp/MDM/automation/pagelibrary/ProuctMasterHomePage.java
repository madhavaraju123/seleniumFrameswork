package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ProuctMasterHomePage {
	Logger log=Logger.getLogger(ProuctMasterHomePage.class.getName());
	
	public void searchExistingProduct(String productName ) throws InterruptedException
	{
		
		UtilityClass.fn_Click("ProuctMasterHomePage_category_dropdown");
		UtilityClass.fn_Click("ProuctMasterHomePage_category_dropdown_option");
		Thread.sleep(5000);
			
		log.info("Validating product details");
		String productCode,prodName,description,status;
		productCode=UtilityClass.fn_getText("ProuctMasterHomePage_productCode_label");
		log.info(productCode);
		prodName=UtilityClass.fn_getText("ProuctMasterHomePage_prodName_label");
		log.info(prodName);
		description=UtilityClass.fn_getText("ProuctMasterHomePage_description_label");
		log.info(description);
		status=UtilityClass.fn_getText("ProuctMasterHomePage_status_label");
		log.info(status);
		UtilityClass.fn_Click("ProuctMasterHomePage_viewDetails_button");
		UtilityClass.takeScreenshot();
	
		
		UtilityClass.fn_Click("ProuctMasterHomePage_back_button");
		
		
				
	}
	

}
