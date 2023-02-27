package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateNetworkMgmtDashboardPg {
	Logger log= Logger.getLogger(AssociateCargoMgmtDashboardPg.class.getName());
	public void ClickInitiateRequestButton() throws InterruptedException
	{
		
		log.info("Clicking Initiate request tab");
		
	//	Thread.sleep(3000);
		UtilityClass.fn_Click("InitiateNewNetworkPaymentRequestBtn");
		Thread.sleep(3000);
	}
	public void EditRequest(String RequestId) throws InterruptedException
	{
		log.info("searching request");
		
	//	log.info("Clicking Initiate request tab");
		//UtilityClass.fn_clickByAction("AssociateCargoMgmtDashboardPg_InitiateRequest_Tab");
		Thread.sleep(3000);
		UtilityClass.fn_Input("NetworkMgmtSearchText",RequestId);
		Thread.sleep(3000);
		UtilityClass.fn_Click("NetworkMgmtRequestIdLink");
		Thread.sleep(3000);
		
	}
	public void ConfirmPaymentRequest(String RequestId) throws InterruptedException
	{
		log.info("searching request");
		//UtilityClass.fn_Input("BookingMgmtSearchText",RequestId);
		Thread.sleep(3000);
		UtilityClass.fn_Click("NetworkMgmtRequestIdLinkConfirm");
		Thread.sleep(3000);
		
	}
	public void ClickViewPayment() throws Exception
	{
	UtilityClass.fn_clickByAction("NetworkMgmtViewPaymentTab");
		Thread.sleep(3000);
	}


}
