package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class SwitchBranchScreen {
	Logger log= Logger.getLogger(SwitchBranchScreen.class.getName());
	public void AllocateBranch() throws Exception
	{
		log.info("Switching to default Branch");
		UtilityClass.fn_Click("SwitchBranchScreen_branchRadioBtn");
		Thread.sleep(5000);
		UtilityClass.fn_Click("SwitchBranchScreen_ConfirmBtn");
		Thread.sleep(5000);
	}

}
