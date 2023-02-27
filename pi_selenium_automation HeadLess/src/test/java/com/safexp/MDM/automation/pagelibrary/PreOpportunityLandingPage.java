package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.Constants;
import com.safexp.MDM.automation.Utility.UtilityClass;

public class PreOpportunityLandingPage {

	Logger log = Logger.getLogger(PreOpportunityLandingPage.class.getName());

	public void setOpportunityName(String opportunityname) {
		//UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("Entering Opportunity name");
		UtilityClass.fn_Input("PreOpportunityPage_opportunityName_Input", opportunityname);
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_3S);
		log.info("Entered opportunity Name");
	}

	public void clickOnSubmit() {
		UtilityClass.fn_Click("PreOpportunityPage_Submit_bt");
		log.info("Clicked on Submit opportunity");
		UtilityClass.implicitelyWaitForAComponent(Constants.WAIT_7S);
	}
}
