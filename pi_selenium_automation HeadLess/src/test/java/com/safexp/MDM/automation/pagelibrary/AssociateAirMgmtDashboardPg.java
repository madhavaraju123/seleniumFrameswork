package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateAirMgmtDashboardPg {
	Logger log= Logger.getLogger(AssociateAirMgmtDashboardPg.class.getName());
	public void ClickInitiateRequestButton() throws InterruptedException
	{
		Thread.sleep(5000);
		log.info("Clicking Initiate request tab");
		UtilityClass.fn_clickByAction("AssociateAirMgmtDashboardPg_InitiateRequest_Tab");
		Thread.sleep(3000);
		UtilityClass.fn_Click("InitiateNewAirPaymentRequestBtn");
		Thread.sleep(5000);
	}
	public void EditRequest(String RequestId) throws InterruptedException
	{
		log.info("searching request");
		
		
		UtilityClass.fn_Input("AirMgmtSearchText",RequestId);
		Thread.sleep(3000);
		UtilityClass.fn_Click("AirMgmtRequestIdLink");
		Thread.sleep(3000);
		
	}
	public void ConfirmPaymentRequest(String RequestId) throws InterruptedException
	{
		log.info("searching request");
		//UtilityClass.fn_Input("BookingMgmtSearchText",RequestId);
		Thread.sleep(3000);
		UtilityClass.fn_Click("AirMgmtRequestIdLinkConfirm");
		Thread.sleep(3000);
		
	}
	public void ClickViewPayment() throws Exception
	{
	UtilityClass.fn_Click("AirMgmtViewPaymentTab");
		Thread.sleep(6000);
	}

}
