package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class InitiatenetworkPaymentRequestPg {
	Logger log= Logger.getLogger(InitiatenetworkPaymentRequestPg.class.getName());
public void CreateNewSingleRequest(String AssociateName,String RPSDt) throws Exception 
{
	
	UtilityClass.fn_InputAndPressEnter("InitiateNetworkPaymentRequestPage_AssociateNametxt", AssociateName);
	Thread.sleep(3000);
	UtilityClass.fn_clickByAction("InitiateNetworkReq_AssociateRadioBtn");
	UtilityClass.fn_Click("SearchAssociate_Confirmbtn");
	UtilityClass.fn_Click("InitiateNetworkPaymentRequestPage_RPSDt");
	UtilityClass.fn_Click("InitiateNetworkPaymentRequestPage_RPSDate");
	Thread.sleep(2000);
	UtilityClass.fn_Click("InitiateNetworkReq_InitiateBtn");
	Thread.sleep(2000);
	UtilityClass.takeScreenshot();
}

}
