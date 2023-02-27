package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AirMgmtAdjustmentScreen {
	Logger log=Logger.getLogger(AirMgmtAdjustmentScreen.class.getName());

	public void UpdateValues(String Invoicewt,String InvoiceAmt,String AdjustmentAmt) throws Exception
	{
		UtilityClass.fn_Input("AirMgmtAdjustmentScreen_Invoicewt",Invoicewt );
		UtilityClass.fn_Input("AirMgmtAdjustmentScreen_InvoiceAmt",InvoiceAmt );
		UtilityClass.fn_Input("AirMgmtAdjustmentScreen_AdjustmentAmt",AdjustmentAmt );
		UtilityClass.fn_Click("AirMgmtAdjustmentScreen_CalculateBtn");
		Thread.sleep(10000);
	    UtilityClass.fn_Click("AirMgmtAdjustmentScreen_SubmitBtn");
	    UtilityClass.takeScreenshot();
		Thread.sleep(5000);
		
	}
}
