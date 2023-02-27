package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CreditContract_TerminationPage {
	Logger log=Logger.getLogger(CreditContract_TerminationPage.class.getName());
	public void contractTermination(){
		log.info("validating sfx code");
		// UtilityClass.fn_validateText("CreditContract_TerminationPage_sfxCode_label","SFX233");
		 
		 log.info("sfx code validated");
		 UtilityClass.fn_Click("CreditContract_TerminationPage_reason_dropdown");
		 log.info("Selecting termination reason");
		 UtilityClass.fn_Click("CreditContract_TerminationPage_reason_option");
		 UtilityClass.fn_Input("CreditContract_TerminationPage_remarks_text","Contract termination");
		 UtilityClass.fn_Click("CreditContract_TerminationPage_submit_button");
		 log.info("contract termination initiated");
		 UtilityClass.fn_Click("CreditContract_TerminationPage_confirmationYes_button");
	}
}
