package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CargoContractDashboardPage {
	Logger log=Logger.getLogger(CargoContractDashboardPage.class.getName());
	public void clickOnNewMSA() throws Exception
	{
		UtilityClass.fn_Click("CargoContractDashboardPage_NewMSA_lnk");
		log.info("clicked New MSA link");
		Thread.sleep(20000);
	}
	public void editExistingContract(String AssocName) throws Exception
	{
		log.info("Searching active contract");
		Thread.sleep(5000);
		UtilityClass.fn_InputAndPressEnter("CargoContractDashboardPage_search_text",AssocName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("CargoContractDashboardPage_editDetails");
		Thread.sleep(3000);
	}


}
