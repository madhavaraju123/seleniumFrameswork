package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class InitiateDlvryRequestPage {

	Logger log= Logger.getLogger(InitiateDlvryRequestPage.class.getName());
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
		UtilityClass.fn_Click("InitiateDeliveryReqPaymentCrDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateDeliveryReqPaymentCrDD_Option2");
		UtilityClass.fn_Click("InitiateDeliveryReqPaymentMonthDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateDeliveryReqPaymentMonthDD_Option7");
		UtilityClass.fn_Click("InitiateDeliveryReqPayment_AssociateRBtn");
		UtilityClass.fn_InputAndPressEnter("InitiateDeliveryReqPayment_Associatetxt", AssociateName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("InitiateDeliveryReqPayment_AssociateCheckBtn");
		UtilityClass.fn_Click("SearchAssociate_Excludebtn");
		UtilityClass.fn_Click("InitiateDeliveryReq_InitiateBtn");
		
	}
	
	
	public void CreateNewSingleRequest(String AssociateName) throws Exception 
	{
		UtilityClass.fn_Click("InitiateDeliveryReqPaymentPaymentCrDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateDeliveryReqPaymentCrDD_Option1");
		UtilityClass.fn_Click("InitiateDeliveryReq_YearDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateDeliveryReq_YearDD_Option");
		UtilityClass.fn_Click("InitiateDeliveryReqPaymentMonthDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateDeliveryReqPaymentMonthDD_Option6");
		UtilityClass.fn_InputAndPressEnter("InitiateDeliveryReqPayment_AssociateNametxt", AssociateName);
		Thread.sleep(3000);
		UtilityClass.fn_clickByAction("InitiateDeliveryReqPayment_AssociateRadioBtn");
		UtilityClass.fn_Click("SearchAssociate_Confirmbtn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateDeliveryReq_InitiateBtn");
		Thread.sleep(3000);
		UtilityClass.takeScreenshot();
	}
}
