package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class DeliveryContractDashboardPage {
	Logger log=Logger.getLogger(DeliveryContractDashboardPage.class.getName());

/*	public void clickDraftMenu() throws Exception
	{
		Thread.sleep(10000);
		UtilityClass.fn_clickByAction("AssociateBookingContractDashboardPage_draftMode_tab");
		log.info("Clicked on draft menu");
		Thread.sleep(3000);
		
	}*/
	public void editExistingActiveContract(String AssocName) throws Exception
	{
		log.info("Searching active contract");
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("DeliveryContractDashboardPage_search_text",AssocName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("DeliveryContractDashboardPage_editDetails");
		Thread.sleep(3000);
	}
	public void clickOnNewMSA() throws Exception
	{
		
		
		//UtilityClass.fn_Click("AssociateBookingContractDashboardPage_DraftContracts");
		UtilityClass.fn_Click("DeliveryContractDashboardPage_NewMSA");
		log.info("Clicked on New MSA menu");
		Thread.sleep(3000);
	}

}
