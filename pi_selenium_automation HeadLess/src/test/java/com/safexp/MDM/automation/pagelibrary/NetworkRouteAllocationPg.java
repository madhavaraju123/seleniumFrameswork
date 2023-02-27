package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class NetworkRouteAllocationPg {
	Logger log=Logger.getLogger(NetworkRouteAllocationPg.class.getName());
	public void AllocateRouteAndVehicle(String RouteCode) throws Exception
	{           
		Thread.sleep(10000);
		log.info("Searching Route");
		UtilityClass.fn_InputAndPressEnter("NetworkRouteAllocationPg_searchBox",RouteCode);
		Thread.sleep(7000);
		UtilityClass.fn_Click("NetworkRouteAllocationPg_routecode_radiobtn");
		Thread.sleep(7000);
		log.info("Assigning Route");
		UtilityClass.fn_Click("NetworkRouteAllocationPg_AssignVehicleImg");
		Thread.sleep(2000);
		
		UtilityClass.fn_Click("NetworkRouteAllocationPg_AssignVehicle_VehicleNumberChkbox");
		Thread.sleep(7000);
		UtilityClass.fn_clickByAction("NetworkRouteAllocationPg_AssignVehicle_SaveBtn");
		log.info("Assigning vehicle");
		Thread.sleep(7000);
		
		UtilityClass.fn_Click("NetworkRouteAllocationPg_NextBtn");
		
		Thread.sleep(20000);
	}

}
