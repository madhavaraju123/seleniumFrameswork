package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AirContractDashboardPage {
	Logger log=Logger.getLogger(AirContractDashboardPage.class.getName());
	public void clickOnNewMSA() throws Exception
	{
		UtilityClass.fn_Click("AirContractDashboardPage_NewMSA_lnk");
		log.info("clicked New MSA link");
		Thread.sleep(20000);
	}
	public void editExistingContract(String AssocName) throws Exception
	{
		log.info("Searching active contract");
		Thread.sleep(5000);
		//UtilityClass.fn_InputAndPressEnter("AirContractDashboardPage_search_text",AssocName);
		//Thread.sleep(5000);
		UtilityClass.fn_Click("AirContractDashboardPage_editDetails");
		Thread.sleep(10000);
	}

}
