package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateBookingMgmtDashboardPg {
	Logger log= Logger.getLogger(AssociateBookingMgmtDashboardPg.class.getName());
	public void ClickInitiateRequestButton() throws InterruptedException
	{
		UtilityClass.fn_Click("InitiateNewBookingRequestBtn");
		Thread.sleep(5000);
	}
	public void EditRequest(String RequestId) throws InterruptedException
	{
		log.info("searching request");
		UtilityClass.fn_Input("BookingMgmtSearchText",RequestId);
		Thread.sleep(3000);
		UtilityClass.fn_Click("BookingMgmtRequestIdLink");
		Thread.sleep(3000);
		
	}
	public void ConfirmPaymentRequest(String RequestId) throws InterruptedException
	{
		log.info("searching request");
		//UtilityClass.fn_Input("BookingMgmtSearchText",RequestId);
		Thread.sleep(3000);
		UtilityClass.fn_Click("BookingMgmtRequestIdLinkConfirm");
		Thread.sleep(3000);
		
	}
	public void ClickViewPayment()
	{
		UtilityClass.fn_Click("BookingMgmtViewPaymentTab");
	}
}
