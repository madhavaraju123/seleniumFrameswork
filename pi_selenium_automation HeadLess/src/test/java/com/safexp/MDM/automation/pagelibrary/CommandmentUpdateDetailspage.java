package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CommandmentUpdateDetailspage {
	Logger log=Logger.getLogger(CommandmentUpdateDetailspage.class.getName());
	
	public void updateCommandment() throws InterruptedException
	{
		UtilityClass.fn_Click("CommandmentDetailsPage_editdetails_status_dropdown");
		UtilityClass.fn_Click("CommandmentDetailsPage_editdetails_status_dropdown_options");
		
		log.info("CommandmentUpdateDetailspage:changing status to Inactive");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentDetailsPage_editdetails_submit_button");
		log.info("clicked submit button");
		
		UtilityClass.fn_Click("CommandmentDetailsPage_editdetails_submitDelete_button");
		Thread.sleep(2000);
		//code to capture message for updation
	}
	
	}
