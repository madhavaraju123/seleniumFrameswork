package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;
public class OrganisationEditDetailsPage {
	Logger log=Logger.getLogger(OrganisationEditDetailsPage .class.getName());	
	public void inactivateOrganisation() throws InterruptedException 
	{
		Thread.sleep(2000);
		//UtilityClass.fn_SelectByValue("OrganisationEditDetailsPage_status_dropdown", "INACTIVE");
		String desc_text=UtilityClass.fn_getText("OrganisationEditDetailsPage_description_input");
		log.info(desc_text);
		UtilityClass.fn_Input("OrganisationEditDetailsPage_description_input",desc_text+"updated");
		
		UtilityClass.fn_Click("OrganisationEditDetailsPage_status_dropdown");
		Thread.sleep(3000);
		UtilityClass.fn_Click("OrganisationEditDetailsPage_status_dropdown_options");
		Thread.sleep(3000);
		
		UtilityClass.fn_Click("OrganisationEditDetailsPage_save_button");
		boolean status=UtilityClass.fn_isDisplayed("OrganisationEditDetailsPage_successMsg");
		if(status) 
			log.info("Organisation is inactivated successfully");
		else
			log.info("There is some issue in inactivating the organisation. pls. recheck");
		}
	
}