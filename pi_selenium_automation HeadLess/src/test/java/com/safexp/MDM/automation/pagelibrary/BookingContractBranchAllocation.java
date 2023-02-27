package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingContractBranchAllocation {
	Logger log=Logger.getLogger(BookingContractBranchAllocation.class.getName());
	public void searhAllocateBranchandVehicle(String branchName,String StartDt) throws Exception
	{           
		Thread.sleep(3000);
		log.info("Searching branch");
		UtilityClass.fn_Click("BookingContractBranchAllocationPage_searchBox");
		Thread.sleep(2000);
		UtilityClass.fn_InputAndPressEnter("BookingContractSearchBranch_SearchBy_text",branchName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("BookingContractSearchBranch_BranchCode_1stcheckbox");
		UtilityClass.fn_Click("BookingContractSearchBranch_AssignBtn");
		UtilityClass.fn_Click("BookingContractSearchBranch_AssignVehicleImg");
		Thread.sleep(2000);
		
		UtilityClass.fn_Click("BookingContract_AssignVehicle_VehicleNumberChkbox");
		UtilityClass.fn_Click("BookingContract_AssignVehicle_SaveBtn");
		Thread.sleep(3000);
		UtilityClass.fn_Input("BookingContractBranchAllocation_startDt", StartDt);
		UtilityClass.fn_Click("BookingContractBranchAllocationPage_NextBtn");
		
		Thread.sleep(5000);
	}
	public void clickNextButton() throws Exception
	{
       UtilityClass.fn_Click("BookingContractBranchAllocationPage_NextBtn");
		
		Thread.sleep(5000);
	}

}
