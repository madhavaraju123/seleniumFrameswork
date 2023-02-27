package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BranchPincodeMappingPage {
	
Logger log= Logger.getLogger(BranchPincodeMappingPage.class.getName());
	
	public void searchExistingBranchAndValidatePinCode(String BranchName,String pincode1,String pincode2,String pincode3,String pincode4,String pincode5,String pincode6,String pincode7,String pincode8,String pincode9) throws InterruptedException
	{
		UtilityClass.fn_Click("BranchPincodeMappingPage_ClickOnSearchBox");
		//log.info("searching data");
	//	UtilityClass.fn_clickByAction("BranchLandingapage_search_input" );
		Thread.sleep(3000);
		UtilityClass.fn_InputAndPressEnter("SearchBranch_branchName_input",BranchName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("SearchBranch_branchName_select_radio");
		UtilityClass.fn_Click("SearchBranch_branchName_save");
		Thread.sleep(5000);
		String branch=UtilityClass.fn_getText("BranchPincodeMappingPage_name_label");
		log.info(branch);
		branch.compareToIgnoreCase(BranchName);
			UtilityClass.fn_Click("BranchPincodeMappingPage_viewDetails1_button");	
			String pincodelist1=UtilityClass.fn_getText("BranchPincodeMappingPage_primaryPincode_label");
			log.info(pincodelist1);
			if((pincodelist1.contains(pincode1)) &&  (pincodelist1.contains(pincode2)) && (pincodelist1.contains(pincode3)) && (pincodelist1.contains(pincode4)) && (pincodelist1.contains(pincode5)) && (pincodelist1.contains(pincode6)))      
					{
				log.info("Primary pincodes for branch are validated");
					}
			Thread.sleep(2000);
			UtilityClass.fn_Click("BranchPincodeMappingPage_viewDetails1_button");
			
			UtilityClass.fn_Click("BranchPincodeMappingPage_viewDetails2_button");
			String pincodelist2=UtilityClass.fn_getText("BranchPincodeMappingPage_secondaryPincode_label");
			if((pincodelist1.contains(pincode1)) &&  (pincodelist1.contains(pincode2)) && (pincodelist1.contains(pincode3)) && (pincodelist1.contains(pincode4)) && (pincodelist1.contains(pincode5)) && (pincodelist1.contains(pincode6)))      
			{
		log.info("Seondary pincodes for branch are validated");
			}
			
			
	

}
}
