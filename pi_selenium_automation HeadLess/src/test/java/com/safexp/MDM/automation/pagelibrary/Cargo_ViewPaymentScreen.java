package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class Cargo_ViewPaymentScreen {
	Logger log= Logger.getLogger(Cargo_ViewPaymentScreen.class.getName());
	public void SearchCargoAssociatePayment(String AssociateName,String FromDate,String EndDate) throws Exception
	{
		Thread.sleep(2000);
		log.info("searching payment");
		UtilityClass.fn_InputAndPressEnter("ViewCargoPaymentScreenAssociateNm", AssociateName);
		Thread.sleep(3000);
		UtilityClass.fn_clickByAction("ViewCargoPaymentScreen_SearchAssociateRBtn");
		UtilityClass.fn_Click("ViewCargoPaymentScreen_ConfirmBtn");
		Thread.sleep(2000);
		UtilityClass.fn_Input("ViewCargoPaymentScreen_FromDate", FromDate);
		UtilityClass.fn_Input("ViewCargoPaymentScreen_EndDate", EndDate);
		UtilityClass.fn_Click("ViewCargoPaymentScreen_searchBtn");
		Thread.sleep(2000);
	}


	public void VerifyPaymentRequestDetails() throws Exception
	{
		UtilityClass.fn_Click("CargoViewPayment_RequestIdLink");
		Thread.sleep(3000);
		UtilityClass.fn_Click("CargoViewPayment_ViewDetailsBtn");
		Thread.sleep(3000);
		UtilityClass.takeScreenshot();
	}
}
