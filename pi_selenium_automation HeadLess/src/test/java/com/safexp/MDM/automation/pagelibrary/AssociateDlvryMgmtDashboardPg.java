package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateDlvryMgmtDashboardPg {
	Logger log=Logger.getLogger(AssociateDlvryMgmtDashboardPg.class.getName());
	public void ClickInitiateRequestButton() throws Exception
	{
		UtilityClass.fn_Click("AssociateDlvryMgmtDashboardPg_InitiateNewRequestBtn");
		Thread.sleep(10000);
	}
	public void EditRequest(String RequestId) throws InterruptedException
	{
		
		UtilityClass.fn_InputAndPressEnter("DeliveryMgmtSearchText",RequestId);
		String Expected="NO DATA MATCH";
		UtilityClass.fn_Click("DeliveryMgmtRequestIdLink");
		Thread.sleep(3000);
		
	}
	public void ClickViewPayment()
	{
		UtilityClass.fn_Click("DeliveryMgmtViewPaymentTab");
	}

}
