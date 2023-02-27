package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingAdjustmentScreen {
Logger log=Logger.getLogger(BookingAdjustmentScreen.class.getName());

public void UpdateValues(String wrongwt,String WaybillPenlty,String sla) throws Exception
{
	UtilityClass.fn_Input("BookingAdjustmentScreen_WrongWt",wrongwt );
	UtilityClass.fn_Input("BookingAdjustmentScreen_WaybillPenlty",WaybillPenlty );
	//UtilityClass.fn_Input("BookingAdjustmentScreen_sla",sla );
	UtilityClass.fn_Click("BookingAdjustmentScreen_CalculateBtn");
	Thread.sleep(10000);
    UtilityClass.fn_Click("BookingAdjustmentScreen_SubmitBtn");
    UtilityClass.takeScreenshot();
	Thread.sleep(5000);
	
}
}
