package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class DeliveryAdjustmentScreen {
	Logger log= Logger.getLogger(DeliveryAdjustmentScreen.class.getName());
	
	public void UpdateValues(String EMI,String snsdPnlty) throws Exception
	{
		//UtilityClass.fn_Input("DeliveryAdjustmentScreen_EMIAmt",EMI );
		UtilityClass.fn_Input("DeliveryAdjustmentScreen_snsdPnlty",snsdPnlty);
		//UtilityClass.fn_switchTochildWindow();
		//log.info("scrolling");
		//UtilityClass.fn_setFocusOnElement("DeliveryAdjustmentScreen_scrollbar");
		//UtilityClass.fn_scrolldown();
		
		
	//	UtilityClass.fn_scrolldown();
		UtilityClass.fn_Click("DeliveryAdjustmentScreen_CalculateBtn");
		Thread.sleep(10000);
		
		UtilityClass.fn_Click("DeliveryAdjustmentScreen_SubmitBtn");
		
				
	}

}
