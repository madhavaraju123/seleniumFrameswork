package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class Air_ViewPaymentScreen {
	Logger log= Logger.getLogger(Air_ViewPaymentScreen.class.getName());
	public void SearchAirAssociatePayment(String AssociateName,String FromDate,String EndDate) throws Exception
{
	Thread.sleep(2000);
	log.info("searching payment");
	UtilityClass.fn_InputAndPressEnter("ViewAirPaymentScreenAssociateNm", AssociateName);
	Thread.sleep(3000);
	UtilityClass.fn_clickByAction("ViewAirPaymentScreen_SearchAssociateRBtn");
	UtilityClass.fn_Click("ViewAirPaymentScreen_ConfirmBtn");
	Thread.sleep(2000);
	UtilityClass.fn_Input("ViewAirPaymentScreen_FromDate", FromDate);
	UtilityClass.fn_Input("ViewAirPaymentScreen_EndDate", EndDate);
	UtilityClass.fn_Click("ViewAirPaymentScreen_searchBtn");
	Thread.sleep(2000);
}


public void VerifyPaymentRequestDetails() throws Exception
{
	UtilityClass.fn_Click("AirViewPayment_RequestIdLink");
	Thread.sleep(3000);
	UtilityClass.fn_Click("AirViewPayment_ViewDetailsBtn");
	Thread.sleep(3000);
	UtilityClass.takeScreenshot();
}


}
