package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CreateManifestPg {
	Logger log=Logger.getLogger(CreateManifestPg.class.getName());
	public void CreateNewManifest(String toLoaction,String waybill,String packageCount) throws Exception
	{
		UtilityClass.fn_Input("CreateManifestPg_toLocation",toLoaction);
		log.info("mentioned To location");
		Thread.sleep(3000);
		UtilityClass.fn_Click("CreateManifestPg_toLocation_option");
		UtilityClass.fn_Click("CreateManifestPg_Vehcileoption");
		Thread.sleep(3000);
		log.info("Chosen the vehicle for manifest");
		UtilityClass.fn_Click("CreateManifestPg_addPackageBtn");
		log.info("Adding package details");
		UtilityClass.fn_Input("CreateManifestPg_WaybillNumber",waybill);
		UtilityClass.fn_Input("CreateManifestPg_packageCount",packageCount);
		Thread.sleep(3000);
		UtilityClass.fn_Click("CreateManifestPg_SubmitBtn");
		Thread.sleep(3000);
		UtilityClass.takeScreenshot();
	}
	}
