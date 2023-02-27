package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateCargoMgmtDashboardPg {
	Logger log= Logger.getLogger(AssociateCargoMgmtDashboardPg.class.getName());
	public void ClickInitiateRequestButton() throws InterruptedException
	{
		Thread.sleep(5000);
		log.info("Clicking Initiate request tab");
		
	//	Thread.sleep(3000);
		UtilityClass.fn_Click("InitiateNewCargoPaymentRequestBtn");
		Thread.sleep(5000);
	}
	public void EditRequest(String RequestId) throws InterruptedException
	{
		log.info("searching request");
		
	//	log.info("Clicking Initiate request tab");
		//UtilityClass.fn_clickByAction("AssociateCargoMgmtDashboardPg_InitiateRequest_Tab");
		Thread.sleep(3000);
		UtilityClass.fn_Input("CargoMgmtSearchText",RequestId);
		Thread.sleep(3000);
		UtilityClass.fn_Click("CargoMgmtRequestIdLink");
		Thread.sleep(3000);
		
	}
	public void ConfirmPaymentRequest(String RequestId) throws InterruptedException
	{
		log.info("searching request");
		//UtilityClass.fn_Input("BookingMgmtSearchText",RequestId);
		Thread.sleep(3000);
		UtilityClass.fn_Click("CargoMgmtRequestIdLinkConfirm");
		Thread.sleep(3000);
		
	}
	public void ClickViewPayment() throws Exception
	{
	UtilityClass.fn_clickByAction("CargoMgmtViewPaymentTab");
		Thread.sleep(3000);
	}

}
