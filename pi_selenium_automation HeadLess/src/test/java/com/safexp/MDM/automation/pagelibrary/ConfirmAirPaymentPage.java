package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ConfirmAirPaymentPage {
Logger log=Logger.getLogger(ConfirmAirPaymentPage.class.getName());
	
	public void ClickOnAdjustmentAmount()
	{
		UtilityClass.fn_Click("ConfirmAirPaymentPage_AdjustmentAmountLink");
	}
	public void ClickOnConfirmBtn() throws Exception
	{
		UtilityClass.fn_Click("ConfirmAirPaymentPage_BranchIdChkbtn");
		Thread.sleep(3000);
		UtilityClass.fn_Click("ConfirmAirPaymentPage_ConfirmBtn");		
		Thread.sleep(3000);
		
	}
	public void ProcessPayment() throws Exception
	{
		UtilityClass.fn_Click("NetAirPayoutPage_BranchIdChkbtn");
		Thread.sleep(3000);
		UtilityClass.fn_Click("ConfirmAirPaymentPage_ProcessBtn");
		Thread.sleep(3000);
		UtilityClass.takeScreenshot();
		
	}
}
