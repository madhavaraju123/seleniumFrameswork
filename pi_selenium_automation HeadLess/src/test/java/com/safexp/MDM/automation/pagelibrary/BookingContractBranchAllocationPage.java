package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingContractBranchAllocationPage {
	Logger log=Logger.getLogger(BookingContractBranchAllocationPage.class.getName());
	public void searhAllocateBranchandVehicle(String branchName) throws Exception
	{
		UtilityClass.fn_Click("BookingContractBranchAllocationPage_searchBox");
		UtilityClass.fn_InputAndPressEnter("BookingContractSearchBranch_SearchBy_text",branchName);
		UtilityClass.fn_Click("BookingContractSearchBranch_BranchCode_1stcheckbox");
		UtilityClass.fn_Click("BookingContractSearchBranch_AssignBtn");
		UtilityClass.fn_Click("BookingContractSearchBranch_AssignVehicleImg");
		
		UtilityClass.fn_Click("BookingContract_AssignVehicle_VehicleNumberChkbox");
		UtilityClass.fn_Click("BookingContract_AssignVehicle_SaveBtn");
		Thread.sleep(3000);
		UtilityClass.fn_Click("BookingContractBranchAllocationPage_NextBtn");
		
		Thread.sleep(5000);
	}

}
