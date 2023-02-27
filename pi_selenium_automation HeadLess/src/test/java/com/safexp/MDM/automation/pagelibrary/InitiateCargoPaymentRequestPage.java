package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class InitiateCargoPaymentRequestPage {
	Logger log= Logger.getLogger(InitiateCargoPaymentRequestPage.class.getName());
public void CreateNewSingleRequest(String AssociateName) throws Exception 
{
	UtilityClass.fn_Click("InitiateCargoPaymentRequestPage_PaymentCrDD");
	Thread.sleep(2000);
	UtilityClass.fn_Click("InitiateCargoPaymentRequestPage_PaymentCrDD_Option2");
	UtilityClass.fn_Click("InitiateCargoPaymentRequestPage_YearDD");
	Thread.sleep(2000);
	UtilityClass.fn_Click("InitiateCargoPaymentRequestPage_YearDDOption");
	Thread.sleep(2000);
	UtilityClass.fn_Click("InitiateCargoPaymentRequestPage_MonthDD");
	Thread.sleep(2000);
	UtilityClass.fn_Click("InitiateCargoPaymentRequestPage_MonthDD_Option");
	Thread.sleep(2000);;
	UtilityClass.fn_InputAndPressEnter("InitiateCargoPaymentRequestPage_AssociateNametxt", AssociateName);
	Thread.sleep(3000);
	UtilityClass.fn_clickByAction("InitiateCargoReq_AssociateRadioBtn");
	UtilityClass.fn_Click("SearchAssociate_Confirmbtn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("InitiateCargogReq_InitiateBtn");
	Thread.sleep(2000);
	UtilityClass.takeScreenshot();
}

}
