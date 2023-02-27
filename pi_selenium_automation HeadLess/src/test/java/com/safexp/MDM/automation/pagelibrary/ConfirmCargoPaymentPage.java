package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ConfirmCargoPaymentPage {
Logger log=Logger.getLogger(ConfirmCargoPaymentPage.class.getName());
	
	public void ClickOnAdjustmentAmount()
	{
		UtilityClass.fn_Click("ConfirmCargoPaymentPage_AdjustmentAmountLink");
	}
	public void ClickOnConfirmBtn() throws Exception
	{
		UtilityClass.fn_Click("ConfirmCargoPaymentPage_BranchIdChkbtn");
		Thread.sleep(3000);
		UtilityClass.fn_Click("ConfirmCargoPaymentPage_ConfirmBtn");		
		Thread.sleep(3000);
		
	}
	public void ProcessPayment() throws Exception
	{
		UtilityClass.fn_Click("NetCargoPayoutPage_BranchIdChkbtn");
		Thread.sleep(3000);
		UtilityClass.fn_Click("ConfirmCargoPaymentPage_ProcessBtn");
		Thread.sleep(3000);
		UtilityClass.takeScreenshot();
		
	}
}
