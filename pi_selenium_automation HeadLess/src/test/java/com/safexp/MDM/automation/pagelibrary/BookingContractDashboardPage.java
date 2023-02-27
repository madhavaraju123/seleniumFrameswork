package com.safexp.MDM.automation.pagelibrary;


import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingContractDashboardPage {
	Logger log=Logger.getLogger(BookingContractDashboardPage.class.getName());

public void clickOnDraftModeContract() throws Exception
{
	Thread.sleep(10000);
	UtilityClass.fn_clickByAction("AssociateBookingContractDashboardPage_draftMode_tab");
	log.info("Clicked on draft menu");
	Thread.sleep(3000);
	
}
public void editExistingContract(String contractNumber) throws Exception
{
	log.info("Searching active contract");
	Thread.sleep(5000);
	UtilityClass.fn_InputAndPressEnter("AssociateBookingContractDashboardPage_search_text",contractNumber);
	Thread.sleep(7000);
	UtilityClass.fn_Click("AssociateBookingContractDashboardPage_editDetails");
	Thread.sleep(5000);
}
public void clickOnNewMSA() throws Exception
{
	
	
	//UtilityClass.fn_Click("AssociateBookingContractDashboardPage_DraftContracts");
	UtilityClass.fn_Click("AssociateBookingContractDashboardPage_NewMSA");
	log.info("Clicked on New MSA menu");
	Thread.sleep(10000);
}
public void editExistingDraftModeContract(String contractNumber) throws Exception
{
	Thread.sleep(3000);
	UtilityClass.fn_InputAndPressEnter("AssociateBookingContractDashboardPage_search_text",contractNumber);
	UtilityClass.fn_clickByAction("AssociateBookingContractDashboardPage_AssocName");
	Thread.sleep(3000);
}

}
