package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class VehicleAllocationPage {
	Logger log=Logger.getLogger(VehicleAllocationPage.class.getName());
	public void clickOnPlusIcon()
	{
		UtilityClass.fn_Click("VehicleAllocationPage_plusicon");
	}

}
