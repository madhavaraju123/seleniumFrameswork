package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ConfirmDlvryPaymentPage {
	Logger log= Logger.getLogger(ConfirmDlvryPaymentPage.class.getName());
	public void ClickOnAdjustmentAmount()
	{
		UtilityClass.fn_Click("ConfirmDlvryPaymentPage_AdjustmentAmountLink");
	}
	public void ClickOnConfirmBtn() throws Exception
	{
		UtilityClass.fn_Click("ConfirmDlvryPaymentPage_BranchIdChkbtn");
		UtilityClass.fn_Click("ConfirmDlvryPaymentPage_ConfirmBtn");	
		Thread.sleep(4000);
		
	}
	public void ProcessPayment() throws Exception
	{
		UtilityClass.fn_Click("NetDlveryPayoutPage_BranchIdChkbtn");
		UtilityClass.fn_Click("ConfirmDlvryPaymentPage_ProcessBtn");
		Thread.sleep(5000);
		
	}

}
