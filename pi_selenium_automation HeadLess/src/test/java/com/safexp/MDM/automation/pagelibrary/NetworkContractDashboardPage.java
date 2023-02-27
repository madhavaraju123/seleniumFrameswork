package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NetworkContractDashboardPage {
	Logger log=Logger.getLogger(NetworkContractDashboardPage.class.getName());
	public void clickOnNewMSA() throws Exception
	{
		UtilityClass.fn_Click("NetworkContractDashboardPage_NewMSA_lnk");
		log.info("clicked New MSA link");
		Thread.sleep(10000);
	}
	public void editExistingContract(String AssocName) throws Exception
	{
		log.info("Searching active contract");
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("NetworkContractDashboardPage_search_text",AssocName);
		Thread.sleep(7000);
		UtilityClass.fn_Click("NetworkContractDashboardPage_editDetails");
		Thread.sleep(3000);
	}


}
