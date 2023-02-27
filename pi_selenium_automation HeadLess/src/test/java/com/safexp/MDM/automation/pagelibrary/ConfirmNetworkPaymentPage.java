package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ConfirmNetworkPaymentPage {
	Logger log=Logger.getLogger(ConfirmNetworkPaymentPage.class.getName());

public void ClickOnAdjustmentAmount()
{
	UtilityClass.fn_Click("ConfirmNetworkPaymentPage_AdjustmentAmountLink");
}
public void ClickOnConfirmBtn() throws Exception
{
	UtilityClass.fn_Click("ConfirmNetworkPaymentPage_BranchIdChkbtn");
	Thread.sleep(3000);
	UtilityClass.fn_Click("ConfirmNetworkPaymentPage_ConfirmBtn");		
	Thread.sleep(5000);
	
}
public void ProcessPayment() throws Exception
{
	UtilityClass.fn_Click("NetNWPayoutPage_BranchIdChkbtn");
	Thread.sleep(3000);
	UtilityClass.fn_Click("ConfirmNetworkPaymentPage_ProcessBtn");
	Thread.sleep(3000);
	UtilityClass.takeScreenshot();
	
}

}
