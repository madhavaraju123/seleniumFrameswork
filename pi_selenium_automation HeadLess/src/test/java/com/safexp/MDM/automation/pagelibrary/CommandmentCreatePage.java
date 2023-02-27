 package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CommandmentCreatePage {
	Logger log=Logger.getLogger(NotepadViewDetailspage.class.getName());
	public void createCommandment(String commandmentName,String commandmentType,String geoType,String geoSubType,String calculationType,String calculationUnit,String calculationMeasure,String businessType,String serviceOffering,String contractType,String chargesOn,String effectiveDt,String RRvalue,String minValue,String maxValue) throws InterruptedException
    {
		UtilityClass.fn_InputByAction("CommandmentCreatePage_commandmentName_input",commandmentName );
		UtilityClass.fn_Click("CommandmentCreatePage_RRFlag_No");
	
		
		UtilityClass.fn_Input("CommandmentCreatePage_effectiveDt_input",effectiveDt );
		
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_contractType_dropdown");
		UtilityClass.fn_Click("CommandmentCreatePage_contractType_dropdown_option2");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_contractType_dropdown");
		Thread.sleep(2000);
		
				UtilityClass.fn_Click("CommandmentCreatePage_serviceOffering_dropdown");
				log.info("clicking dropdown");
		UtilityClass.fn_Click("CommandmentCreatePage_serviceOffering_dropdown_option6");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_serviceOffering_dropdown");
		Thread.sleep(2000);
		log.info("clicking dropdown");
		
		
		UtilityClass.fn_Click("CommandmentCreatePage_calculationType_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_calculationType_dropdown_option2");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_calculationType_dropdown");
		
		UtilityClass.fn_Click("CommandmentCreatePage_MaxAmountFlag_No");
		UtilityClass.fn_Click("CommandmentCreatePage_calculationUnit_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_calculationUnit_dropdown_option3");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_calculationUnit_dropdown");
		
		//UtilityClass.fn_SelectByVisibleText("CommandmentCreatePage_commandmentType_dropdown", "dropdownlistxpath", commandmentType);
		
		UtilityClass.fn_Click("CommandmentCreatePage_commandmentType_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_commandmentType_dropdown_option1");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_geoType_dropdown");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CommandmentCreatePage_geoType_dropdown_option3");
		Thread.sleep(2000);
		
		
	UtilityClass.fn_Click("CommandmentCreatePage_chargesOn_dropdown");
	Thread.sleep(2000);
	UtilityClass.fn_clickByAction("CommandmentCreatePage_chargesOn_dropdown_option2");
	Thread.sleep(2000);
	UtilityClass.fn_Click("CommandmentCreatePage_chargesOn_dropdown");
	UtilityClass.fn_Click("CommandmentCreatePage_businessType_dropdown");
	  Thread.sleep(2000);
	UtilityClass.fn_Click("CommandmentCreatePage_businessType_dropdown_option2");
	Thread.sleep(2000);
	UtilityClass.fn_Click("CommandmentCreatePage_businessType_dropdown");
	UtilityClass.fn_clickByAction("CommandmentCreatePage_calculationMeasure_dropdown");
	log.info("clicking dropdown");
	Thread.sleep(2000);
	UtilityClass.fn_Click("CommandmentCreatePage_calculationMeasure_dropdown_option2");
	Thread.sleep(2000);
	UtilityClass.fn_Click("CommandmentCreatePage_calculationMeasure_dropdown");
	Thread.sleep(2000);
	
	
	UtilityClass.fn_Click("CommandmentCreatePage_geoSubType_dropdown");
	log.info("clicked dropdown");
	Thread.sleep(2000);
UtilityClass.fn_Click("CommandmentCreatePage_geoSubType_dropdown_option2");
log.info("clicked dropdown option");
Thread.sleep(2000);
UtilityClass.fn_Click("CommandmentCreatePage_geoSubType_dropdown");

UtilityClass.fn_Click("CommandmentCreatePage_MinAmountFlag_No");

		UtilityClass.fn_Click("CommandmentCreatePage_next_button");
		Thread.sleep(3000);
		
		
    }	
}
