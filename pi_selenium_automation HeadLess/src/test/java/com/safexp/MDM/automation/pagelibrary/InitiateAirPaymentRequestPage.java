package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class InitiateAirPaymentRequestPage {
	Logger log= Logger.getLogger(InitiateAirPaymentRequestPage.class.getName());
	public void CreateNewSingleRequest(String AssociateName) throws Exception 
	{
		UtilityClass.fn_Click("InitiateAirPaymentRequestPage_PaymentCrDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateAirPaymentRequestPage_PaymentCrDD_Option2");
		UtilityClass.fn_Click("InitiateAirPaymentRequestPage_YearDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateAirPaymentRequestPage_YearDDOption");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateAirPaymentRequestPage_MonthDD");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateAirPaymentRequestPage_MonthDD_Option");
		Thread.sleep(2000);;
		UtilityClass.fn_InputAndPressEnter("InitiateAirPaymentRequestPage_AssociateNametxt", AssociateName);
		Thread.sleep(3000);
		UtilityClass.fn_clickByAction("InitiateBookingReq_AssociateRadioBtn");
		UtilityClass.fn_Click("SearchAssociate_Confirmbtn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("InitiateBookingReq_InitiateBtn");
		Thread.sleep(2000);
		UtilityClass.takeScreenshot();
	}
}
