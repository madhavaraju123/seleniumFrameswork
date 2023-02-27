package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class RetailContractPreviewScreen {
	Logger log= Logger.getLogger(RetailContractPreviewScreen.class.getName());
	public void validateRCCode(String RCCode) throws InterruptedException
	{
		UtilityClass.fn_validateText("RetailContractPreviewScreen_RCCode_label",RCCode);
		
	}

}
