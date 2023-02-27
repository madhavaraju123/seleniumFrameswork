package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NetworkMgmtAdjustmentScreen {
	Logger log=Logger.getLogger(NetworkMgmtAdjustmentScreen.class.getName());

	public void UpdateValues(String MaterialLoss,String SealDedPnlty,String NonTouchPnlty) throws Exception
	{
		UtilityClass.fn_Input("NetworkMgmtAdjustmentScreen_MaterialLoss",MaterialLoss );
		UtilityClass.fn_Input("NetworkMgmtAdjustmentScreen_SealDedPnlty",SealDedPnlty );
		UtilityClass.fn_Input("NetworkMgmtAdjustmentScreen_NonTouchPnlty",NonTouchPnlty );
		UtilityClass.fn_Click("NetworkMgmtAdjustmentScreen_CalculateBtn");
		Thread.sleep(10000);
	    UtilityClass.fn_Click("NetworkMgmtAdjustmentScreen_SubmitBtn");
	    Thread.sleep(2000);
	    UtilityClass.takeScreenshot();
		
		
	}
}
