package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ViewBkngPaymentScreen {
Logger log= Logger.getLogger(ViewBkngPaymentScreen.class.getName());
public void SearchAssociatePayment(String AssociateName,String FromDate,String EndDate) throws Exception
{
	UtilityClass.fn_Input("BookingViewPaymentAssociateNm", AssociateName);
	UtilityClass.fn_Click("BookingViewPayment_EndDate");
	UtilityClass.fn_Click("BookingViewPaymentAssociateNm");
	Thread.sleep(3000);
	UtilityClass.fn_clickByAction("BookingViewPayment_SearchAssociateRBtn");
	UtilityClass.fn_Click("BookingViewPayment_ConfirmBtn");
	
	UtilityClass.fn_Input("BookingViewPayment_FromDate", FromDate);
	UtilityClass.fn_Input("BookingViewPayment_EndDate", EndDate);
	UtilityClass.fn_Click("BookingViewPayment_searchBtn");
	Thread.sleep(3000);
}
public void ViewPaymentDetails() 
{
	String ExAdjAmt= UtilityClass.fn_getText("BookingViewPayment_AdjustmentAmttext");
	String BasicAmt= UtilityClass.fn_getText("BookingViewPayment_BasicAmttext");
		UtilityClass.fn_Click("BookingViewPayment_ViewDetailsLnk");
		String AcAdjAmt=UtilityClass.fn_getText("BookingViewPayment_ViewDetails_AdjustmentAmttext");
		String AcBasicAmt=UtilityClass.fn_getText("BookingViewPayment_ViewDetails_BasicAmttext");
		if ((AcAdjAmt.equalsIgnoreCase(ExAdjAmt))&&(AcBasicAmt.equalsIgnoreCase(BasicAmt)))
				{
			log.info("payment details are matching");
				}
		else
			{ log.info("Basic amount or Adjustment amounts are not matching");}
}

public void VerifyPaymentRequestDetails() throws Exception
{
	UtilityClass.fn_Click("BookingViewPayment_RequestIdLink");
	Thread.sleep(3000);
	UtilityClass.fn_Click("BookingViewPayment_ViewDetailsBtn");
	Thread.sleep(3000);
	UtilityClass.takeScreenshot();
}
}
