package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ViewDlvryPaymentScreen {
	Logger log= Logger.getLogger(ViewDlvryPaymentScreen.class.getName());
	public void SearchDlvryAssociatePayment(String AssociateName,String FromDate,String EndDate) throws Exception
	{
		Thread.sleep(2000);
		UtilityClass.fn_InputAndPressEnter("ViewDlvryPaymentScreenAssociateNm", AssociateName);
		Thread.sleep(3000);
		UtilityClass.fn_clickByAction("ViewDlvryPaymentScreen_SearchAssociateRBtn");
		UtilityClass.fn_Click("ViewDlvryPaymentScreen_ConfirmBtn");
		Thread.sleep(2000);
		UtilityClass.fn_Input("ViewDlvryPaymentScreen_FromDate", FromDate);
		UtilityClass.fn_Input("ViewDlvryPaymentScreen_EndDate", EndDate);
		UtilityClass.fn_Click("ViewDlvryPaymentScreen_searchBtn");
		Thread.sleep(2000);
	}
	public void ViewPaymentDetails() throws Exception 
	{
		String ExAdjAmt= UtilityClass.fn_getText("ViewDlvryPaymentScreen_AdjustmentAmttext");
		log.info(ExAdjAmt);
		
		String BasicAmt= UtilityClass.fn_getText("ViewDlvryPaymentScreen_BasicAmttext");
		log.info(BasicAmt);
			UtilityClass.fn_Click("ViewDlvryPaymentScreen_ViewDetailsLnk");
			
			String AcAdjAmt=UtilityClass.fn_getText("ViewDlvryPaymentScreen_ViewDetails_AdjustmentAmttext");
			String AcBasicAmt=UtilityClass.fn_getText("ViewDlvryPaymentScreen_ViewDetails_BasicAmttext");
			if ((AcAdjAmt.equalsIgnoreCase(ExAdjAmt))&&(AcBasicAmt.equalsIgnoreCase(BasicAmt)))
					{
				log.info("payment details are matching");
					}
			else
				{ log.info("Basic amount or Adjustment amounts are not matching");}
	}

	public void VerifyPaymentRequestDetails() throws Exception
	{
		UtilityClass.fn_Click("DeliveryViewPayment_RequestIdLink");
		Thread.sleep(3000);
		UtilityClass.fn_Click("DeliveryViewPayment_ViewDetailsBtn");
		Thread.sleep(3000);
		UtilityClass.takeScreenshot();
	}

}
