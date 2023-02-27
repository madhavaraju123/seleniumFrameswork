package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CargoBranchAllocationPg {
	Logger log=Logger.getLogger(CargoBranchAllocationPg.class.getName());
	public void AllocateBranch(String branchName,String StartDt) throws Exception
	{           
		Thread.sleep(5000);
		log.info("Searching branch");
		UtilityClass.fn_Click("CargoBranchAllocationPg_searchBox");
		Thread.sleep(2000);
		log.info("Searching branch");
		UtilityClass.fn_InputAndPressEnter("CargoBranchAllocationPg_SearchBy_text",branchName);
		Thread.sleep(7000);
		log.info("Searching branch text");
		UtilityClass.fn_Click("CargoBranchAllocationPg_1stcheckbox");
		log.info("Selecting branch");
		UtilityClass.fn_Click("CargoBranchAllocationPg_AssignBtn");
		log.info("Assigning branch");
		Thread.sleep(7000);
		UtilityClass.fn_Click("CargoBranchAllocationPg_startDt");
		UtilityClass.fn_Click("CargoBranchAllocationPg_startDtoption");
		
		log.info("start date is entered");
		UtilityClass.fn_Click("CargoBranchAllocationPg_NextBtn");
		log.info("navigating to payment page is entered");
		Thread.sleep(20000);
	}

}
