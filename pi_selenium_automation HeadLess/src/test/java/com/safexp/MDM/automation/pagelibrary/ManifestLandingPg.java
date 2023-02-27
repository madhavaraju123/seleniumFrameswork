package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ManifestLandingPg {
	Logger log=Logger.getLogger(ManifestLandingPg.class.getName());
	
	public void ClickOnCreateManifest() throws Exception
	{
		UtilityClass.fn_Click("ManifestLandingPg_CreatemanifestTab");
		log.info("Clicked create manifest button");
		Thread.sleep(5000);
		
	}
	public void ConfirmAndFinalizeManifest(String manifestNumber) throws Exception
	{
		log.info("searching manifest number");
		UtilityClass.fn_Input("ManifestLandingPg_searchText",manifestNumber);
		/*log.info("checking if manifest is already confirmed");
		if(UtilityClass.fn_isEnabled("ManifestLandingPg_confirmBtn"))
		{
			log.info("manifest is not confirmed");
		}
		else 
		{
			log.info("manifest is confirmed ");*/
			UtilityClass.fn_Click("ManifestLandingPg_confirmBtn");
			Thread.sleep(3000);
			UtilityClass.fn_Click("ManifestLandingPg_Confirmmanifest_YesBtn");
			
			Thread.sleep(5000);
			UtilityClass.fn_InputAndPressEnter("ManifestLandingPg_searchText",manifestNumber);
			UtilityClass.fn_Click("ManifestLandingPg_FinalizeBtn");
			UtilityClass.fn_Click("ManifestLandingPg_FinalizeManifest_YesBtn");
			Thread.sleep(2000);
			UtilityClass.takeScreenshot();
		
	}

}
