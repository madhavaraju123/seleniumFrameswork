package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ConfirmPaymentPage {
	Logger log=Logger.getLogger(ConfirmPaymentPage.class.getName());
	
	public void ClickOnAdjustmentAmount()
	{
		UtilityClass.fn_Click("ConfirmPaymentPage_AdjustmentAmountLink");
	}
	public void ClickOnConfirmBtn()
	{
		UtilityClass.fn_Click("ConfirmPaymentPage_BranchIdChkbtn");
		UtilityClass.fn_Click("ConfirmPaymentPage_ConfirmBtn");		
		
	}
	public void ProcessPayment()
	{
		UtilityClass.fn_Click("NetPayoutPage_BranchIdChkbtn");
		UtilityClass.fn_Click("ConfirmPaymentPage_ProcessBtn");
		
	}

}
