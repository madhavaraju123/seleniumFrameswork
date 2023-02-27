package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class UpdateAssociatePage {
Logger log=Logger.getLogger(UpdateAssociatePage.class.getName());
public void updateAssociateDetails(String bankAddress,String depositAmount,String description) throws Exception
{
	
	log.info("updating details");
	//UtilityClass.fn_Input("UpdateAssociatePage_bankAddress_text",bankAddress);
//	UtilityClass.fn_Input("UpdateAssociatePage_depositAmount_text",depositAmount);
	UtilityClass.fn_Input("UpdateAssociatePage_description_text",description);
	UtilityClass.fn_Click("UpdateAssociatePage_next_btn");
	Thread.sleep(3000);
	UtilityClass.fn_Click("AssociateKYCPage_next_btn");
	Thread.sleep(3000);
	UtilityClass.fn_Click("VehicleAllocationPage_submit_btn");
}
}
