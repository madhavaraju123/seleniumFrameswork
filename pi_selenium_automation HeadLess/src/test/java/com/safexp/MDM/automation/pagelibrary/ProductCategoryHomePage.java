package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ProductCategoryHomePage {
	Logger log=Logger.getLogger(ProductCategoryHomePage.class.getName());
	
	public void searchExistingCategory(String productCategory) throws InterruptedException
	{
		boolean status= false;
		UtilityClass.fn_InputAndPressEnter("ProductCategoryHomePage_search_input",productCategory);
		Thread.sleep(2000);
		log.info("Validating Category details");
		String category,HSNCode,LOB;
		category=UtilityClass.fn_getText("ProductCategoryHomePage_category_label");
		log.info(category);
		HSNCode=UtilityClass.fn_getText("ProductCategoryHomePage_HSNCode_label");
		log.info(HSNCode);
		LOB=UtilityClass.fn_getText("ProductCategoryHomePage_LOB_label");
		log.info(LOB);
		UtilityClass.fn_Click("ProductCategoryHomePage_viewDetails_button");	
		
		UtilityClass.takeScreenshot();
			
		UtilityClass.fn_Click("ProductCategoryHomePage_back_button");
			
	}
	public void clickOnProductMasterTab() throws InterruptedException
	{
		Thread.sleep(1000);
		UtilityClass.fn_Click("ProductCategoryHomePage_ProductMaster_tab");
		log.info("Clicked on ProductMaster tab");
		Thread.sleep(5000);
	}
}
