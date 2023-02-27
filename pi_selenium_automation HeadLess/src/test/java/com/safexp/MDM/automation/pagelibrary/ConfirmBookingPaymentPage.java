package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ConfirmBookingPaymentPage {
	Logger log=Logger.getLogger(ConfirmBookingPaymentPage.class.getName());
	
	public void ClickOnAdjustmentAmount()
	{
		UtilityClass.fn_Click("ConfirmPaymentPage_AdjustmentAmountLink");
	}
	public void ClickOnConfirmBtn() throws Exception
	{
		UtilityClass.fn_Click("ConfirmPaymentPage_BranchIdChkbtn");
		Thread.sleep(3000);
		UtilityClass.fn_Click("ConfirmPaymentPage_ConfirmBtn");		
		Thread.sleep(3000);
		
	}
	public void ProcessPayment() throws Exception
	{
		UtilityClass.fn_Click("NetPayoutPage_BranchIdChkbtn");
		Thread.sleep(3000);
		UtilityClass.fn_Click("ConfirmPaymentPage_ProcessBtn");
		Thread.sleep(3000);
		UtilityClass.takeScreenshot();
		
	}

}
