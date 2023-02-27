package com.safexp.MDM.automation.pagelibrary;
import java.util.List;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;
public class RetailContractPage {
	Logger log=Logger.getLogger(RetailContractPage.class.getName());
	public void validateRCCode(String RCCode) throws InterruptedException
	{
		Thread.sleep(2000);
		
	//	log.info(UtilityClass.fn_getText("RetailContractPage_RetailCode"));
		UtilityClass.fn_validateText("RetailContractPage_RetailCode",RCCode);
		UtilityClass.fn_Click("RetailContractPage_next_button");
		Thread.sleep(3000);
	}
	
}
