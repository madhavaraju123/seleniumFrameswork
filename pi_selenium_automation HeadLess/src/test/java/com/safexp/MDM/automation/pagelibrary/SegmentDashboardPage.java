package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;


public class SegmentDashboardPage {
	Logger log=Logger.getLogger(SegmentDashboardPage.class.getName());

	public boolean searchExistingSegment(String segmentName ) throws InterruptedException
	{
		boolean status=false;
		UtilityClass.fn_InputAndPressEnter("SegmentDashboard_search_input",segmentName);
		Thread.sleep(3000);
		log.info("Validating segment details");
		String name,displayValue;
		name=UtilityClass.fn_getText("SegmentDashboard_name_label");
		log.info(name);
		displayValue=UtilityClass.fn_getText("SegmentDashboard_displayValue_label");
		log.info(displayValue);
		UtilityClass.fn_Click("SegmentDashboard_viewDetails_button");
		Thread.sleep(2000);
		log.info(UtilityClass.getTextOnElement("SegmentDashboard_ViewSegment_Name_input"));
		log.info(UtilityClass.getTextOnElement("SegmentDashboard_ViewSegment_displayName_input"));
		//UtilityClass.fn_validateText("SegmentDashboard_ViewSegment_Name_input", name);
		//UtilityClass.fn_validateText("SegmentDashboard_ViewSegment_displayName_input",displayValue);
		UtilityClass.fn_Click("SegmentDashboard_ViewSegment_back_button");
		status=true;
		return status;
		
				
	}
	
	public void ClickOnSubSegmentTab() throws InterruptedException
	{
		Thread.sleep(5000);
		log.info("Clicking on SubSegment tab");
		UtilityClass.fn_clickByAction("SegmentDashboard_SubSegmentTab");
		Thread.sleep(3000);
		log.info("Clicked on SubSegment tab");
	}

}
