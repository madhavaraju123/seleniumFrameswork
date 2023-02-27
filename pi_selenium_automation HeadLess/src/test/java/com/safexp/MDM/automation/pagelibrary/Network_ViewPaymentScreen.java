package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class Network_ViewPaymentScreen {
	Logger log= Logger.getLogger(Network_ViewPaymentScreen.class.getName());
	public void SearchNetworkAssociatePayment(String AssociateName,String FromDate,String EndDate) throws Exception
	{
		Thread.sleep(2000);
		log.info("searching payment");
		UtilityClass.fn_InputAndPressEnter("ViewNetworkPaymentScreenAssociateNm", AssociateName);
		Thread.sleep(3000);
		UtilityClass.fn_clickByAction("ViewNWPaymentScreen_SearchAssociateRBtn");
		UtilityClass.fn_Click("ViewNwPaymentScreen_ConfirmBtn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("ViewNetworkPaymentScreen_FromDate");
		UtilityClass.fn_Click("ViewNetworkPaymentScreen_SelectFromDate");
		Thread.sleep(2000);
		UtilityClass.fn_Click("ViewNetworkPaymentScreen_EndDate");
		UtilityClass.fn_Click("ViewNetworkPaymentScreen_SelectToDate");
		Thread.sleep(2000);
		UtilityClass.fn_Click("ViewNetworkPaymentScreen_searchBtn");
		
		Thread.sleep(2000);
	}


	public void VerifyPaymentRequestDetails() throws Exception
	{
		UtilityClass.fn_Click("NetworkViewPayment_RequestIdLink");
		Thread.sleep(3000);
		UtilityClass.fn_Click("NetworkViewPayment_ViewDetailsBtn");
		Thread.sleep(3000);
		UtilityClass.takeScreenshot();
	}
}
