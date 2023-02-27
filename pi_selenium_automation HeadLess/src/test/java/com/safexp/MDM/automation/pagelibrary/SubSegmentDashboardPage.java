package com.safexp.MDM.automation.pagelibrary;
import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class SubSegmentDashboardPage {
	Logger log= Logger.getLogger(SubSegmentDashboardPage.class.getName());
	
	public boolean searchExistingSubSegment(String subSegmentName ) throws InterruptedException
	{
		boolean status=false;
		UtilityClass.fn_Click("SubSegmentDashboard_segmentSearch_dropdown");
		UtilityClass.fn_Click("SubSegmentDashboard_segmentSearch_dropdown_option");
		Thread.sleep(2000);
		
		UtilityClass.fn_InputAndPressEnter("SubSegmentDashboard_search_input",subSegmentName);
			Thread.sleep(3000);
			
		log.info("Validating subsegment details");
		String name,displayValue;
		name=UtilityClass.fn_getText("SubSegmentDashboard_name_label");
		log.info(name);
		displayValue=UtilityClass.fn_getText("SubSegmentDashboard_displayValue_label");
		log.info(displayValue);
		UtilityClass.fn_Click("SubSegmentDashboard_viewDetails_button");
		log.info(UtilityClass.fn_getText("ViewSubSegment_Name_input"));
		UtilityClass.fn_validateText("ViewSubSegment_Name_input", name);
		log.info(UtilityClass.fn_getText("ViewSubSegment_displayName_input"));
		UtilityClass.fn_validateText("ViewSubSegment_displayName_input",displayValue);
		UtilityClass.fn_Click("ViewSubSegment_back_button");
		status=true;
		return status;
				
				
	}

}
