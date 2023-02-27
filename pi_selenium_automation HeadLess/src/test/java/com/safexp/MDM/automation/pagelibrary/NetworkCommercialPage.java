package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NetworkCommercialPage {
	Logger log=Logger.getLogger(NetworkCommercialPage.class.getName());
	public void AssignCommercial( String StratDt,String TransitTime) throws Exception
	{
		Thread.sleep(7000);
		UtilityClass.fn_Click("NetworkCommercialPage_vehicleCheckBox");
		log.info("Vehicle checking on Commercial page");
		UtilityClass.fn_clickByAction("NetworkCommercialPage_operationalDays_Dropdn");
		Thread.sleep(2000);
		
		UtilityClass.fn_Click("NetworkCommercialPage_operationalDays_DropdnOption");
		UtilityClass.fn_applyTAB("NetworkCommercialPage_operationalDays_Dropdn");
		log.info("Selected operational days");
		UtilityClass.fn_Input("NetworkCommercialPage_StartDt",StratDt);
		Thread.sleep(5000);
		UtilityClass.fn_Input("NetworkCommercialPage_TransitTime",TransitTime);
		UtilityClass.fn_Click("NetworkCommercialPage_NextBtn");
		Thread.sleep(20000);
	}
	public void updateDetails(String TransitTime) throws Exception
	{
		UtilityClass.fn_Input("NetworkCommercialPage_TransitTime",TransitTime);
		UtilityClass.fn_Click("NetworkCommercialPage_NextBtn");
		Thread.sleep(10000);		
	}
	

}
