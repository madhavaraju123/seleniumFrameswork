package com.safexp.MDM.automation.pagelibrary;

import org.testng.log4testng.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateBookingContractDashboardPage {
	//Logger log=Logger.getLogger(CreditContractBurgerMenu.class.getName());

public void clickOnDraftModeContract() throws Exception
{
	UtilityClass.fn_clickByAction("AssociateBookingContractDashboardPage_draftMode_tab");
	
	Thread.sleep(3000);
	UtilityClass.fn_Click("AssociateBookingContractDashboardPage_plusIcon");
}
public void editExistingContract(String contractNumber) throws Exception
{
	
	UtilityClass.fn_InputAndPressEnter("AssociateBookingContractDashboardPage_search_text",contractNumber);
	UtilityClass.fn_Click("AssociateBookingContractDashboardPage_editDetails");
	Thread.sleep(3000);
}

}
