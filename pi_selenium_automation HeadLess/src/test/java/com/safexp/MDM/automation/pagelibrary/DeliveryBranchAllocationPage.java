package com.safexp.MDM.automation.pagelibrary;

import java.sql.Date;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class DeliveryBranchAllocationPage {
	Logger log=Logger.getLogger(DeliveryBranchAllocationPage.class.getName());
	public void AllocateBranch(String branchName,String StartDt) throws Exception
	{           
		Thread.sleep(5000);
		log.info("Searching branch");
		UtilityClass.fn_Click("BookingContractBranchAllocationPage_searchBox");
		Thread.sleep(2000);
		UtilityClass.fn_InputAndPressEnter("BookingContractSearchBranch_SearchBy_text",branchName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_BranchCode_1stcheckbox");
		UtilityClass.fn_Click("BookingContractSearchBranch_AssignBtn");
		UtilityClass.fn_Click("BookingContractSearchBranch_AssignVehicleImg");
		Thread.sleep(2000);
		
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_AssignVehicle_VehicleNumberChkbox");
		UtilityClass.fn_Click("BookingContract_AssignVehicle_SaveBtn");
		Thread.sleep(3000);
		UtilityClass.fn_Input("DeliveryBranchAllocationPage_startDt",StartDt);
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_PinCodelnk");
		Thread.sleep(3000);
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_customizedPinCode_State");
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_customizedPinCode_StateOption");
		Thread.sleep(5000);
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_customizedPinCode_City");
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_customizedPinCode_CityOption");
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_customizedPinCode_SearchBtn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_customizedPinCode_ScheduleChk");
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_customizedPinCode_SafexChk");
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_customizedPinCode_Submit");
		UtilityClass.fn_Click("DeliveryBranchAllocationPage_NextBtn");
		
		Thread.sleep(5000);
	}

}
