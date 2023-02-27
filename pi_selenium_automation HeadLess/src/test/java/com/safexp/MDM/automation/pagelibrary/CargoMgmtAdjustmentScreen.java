package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CargoMgmtAdjustmentScreen {
	Logger log=Logger.getLogger(CargoMgmtAdjustmentScreen.class.getName());

	public void UpdateValues(String latePnlty,String ActualManDays,String EMIAmt) throws Exception
	{
		//UtilityClass.fn_Input("CargoMgmtAdjustmentScreen_latePnlty",latePnlty );
		UtilityClass.fn_Input("CargoMgmtAdjustmentScreen_ActualManDays",ActualManDays );
		UtilityClass.fn_Input("CargoMgmtAdjustmentScreen_EMIAmt",EMIAmt );
		UtilityClass.fn_Click("CargoMgmtAdjustmentScreen_CalculateBtn");
		Thread.sleep(10000);
	    UtilityClass.fn_Click("CargoMgmtAdjustmentScreen_SubmitBtn");
	    Thread.sleep(2000);
	    UtilityClass.takeScreenshot();
		
		
	}

}
