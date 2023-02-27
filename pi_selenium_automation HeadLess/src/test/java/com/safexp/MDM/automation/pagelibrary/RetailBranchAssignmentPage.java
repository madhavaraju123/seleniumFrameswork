package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class RetailBranchAssignmentPage {
	Logger log= Logger.getLogger(RetailBranchAssignmentPage.class.getName());
	public void validateRCCode(String RCCode) throws InterruptedException
	{
		log.info("branch assignment page");
		Thread.sleep(2000);
		UtilityClass.fn_validateText("RetailBranchAssignmentPage_RCCode_label",RCCode);
		//UtilityClass.fn_Click("RetailBranchAssignmentPage_Preview_button");
		Thread.sleep(5000);
	}
}
