package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class InitiateBookingRequestPg {
	Logger log= Logger.getLogger(InitiateBookingRequestPg.class.getName());
	public void CreateNewRequest(String AssociateName,String Criteria) throws Exception
	{
		if(Criteria.equalsIgnoreCase("Bulk"))
		{ CreateNewBulkRequest(AssociateName); }
		else if (Criteria.equalsIgnoreCase("Single"))
		{
			CreateNewSingleRequest(AssociateName);
		}
	}
	public void CreateNewBulkRequest(String AssociateName) throws InterruptedException 
	{
		UtilityClass.fn_Click("InitiateBookingReqPaymentCrDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateBookingReqPaymentCrDD_Option1");
		UtilityClass.fn_Click("InitiateBookingReqYearDD");
		UtilityClass.fn_Click("InitiateBookingReqYearDDOption");
		UtilityClass.fn_Click("InitiateBookingReqMonthDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateBookingReqMonthDD_Option7");
		/*UtilityClass.fn_Click("InitiateBookingReq_AssociateRBtn");
		UtilityClass.fn_InputAndPressEnter("InitiateBookingReq_Associatetxt2", AssociateName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("InitiateBookingReq_AssociateCheckBtn");
		UtilityClass.fn_Click("SearchAssociate_Excludebtn");*/
		UtilityClass.fn_Click("InitiateBookingReq_InitiateBtn");
		
	}
	
	
	public void CreateNewSingleRequest(String AssociateName) throws Exception 
	{
		UtilityClass.fn_Click("InitiateBookingReqPaymentCrDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateBookingReqPaymentCrDD_Option2");
		UtilityClass.fn_Click("InitiateBookingReqYearDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateBookingReqYearDDOption");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateBookingReqMonthDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateBookingReqMonthDD_Option7");
		Thread.sleep(2000);;
		UtilityClass.fn_InputAndPressEnter("InitiateBookingReq_AssociateNametxt", AssociateName);
		Thread.sleep(3000);
		UtilityClass.fn_clickByAction("InitiateBookingReq_AssociateRadioBtn");
		UtilityClass.fn_Click("SearchAssociate_Confirmbtn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateBookingReq_InitiateBtn");
	}
}
