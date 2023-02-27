package com.safexp.MDM.automation.pagelibrary;

import java.util.List;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class RetailContractDashboardPage {
	Logger log=Logger.getLogger(RetailContractDashboardPage.class.getName());
	public void clickOnActiveContract() throws InterruptedException
	{
		log.info("clicking on active Contract menu ");
		Thread.sleep(2000);
		UtilityClass.fn_clickByAction("RetailContractDashboardPage_Activecontract_menu");
		Thread.sleep(5000);
	}
	public void searchRCCode(String RCCode) throws InterruptedException
	{
		log.info("RCCode is being entered to search");
		UtilityClass.fn_clickByAction("RetailContractHomePage_search_dd");
		Thread.sleep(2000);
		UtilityClass.fn_Click("RetailContractHomePage_search_optionrcgcode");
		UtilityClass.fn_InputAndPressEnter("RetailContractDashboardPage_search_input",RCCode);
		Thread.sleep(2000);
		 UtilityClass.fn_Click("RetailContractDashboardPage_editDetails_button");
		/*List<Integer> rowlist=UtilityClass.fn_searchByElementTextInWebTable("customernamelist",10,RCCode);
		if(rowlist.size()!=0) 
		{			
			log.info("SFX code found and is being clicked ");	
			 UtilityClass.fn_Click("RetailContractDashboardPage_editDetails_button");
		}*/
	
	} 

}
