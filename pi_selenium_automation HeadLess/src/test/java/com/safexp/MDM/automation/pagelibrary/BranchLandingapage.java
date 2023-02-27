package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BranchLandingapage {
	Logger log= Logger.getLogger(BranchLandingapage.class.getName());
	public void searchExistingBranch_diffCriteria(String BranchName,String BranchType,String pincode) throws InterruptedException
	{
		UtilityClass.fn_Click("BranchLandingapage_ClickOnSearchBox");
		log.info("searching data");
	//	UtilityClass.fn_clickByAction("BranchLandingapage_search_input" );
		Thread.sleep(3000);
		UtilityClass.fn_InputAndPressEnter("SearchBranch_branchName_input",BranchName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("SearchBranch_branchName_select_radio");
		UtilityClass.fn_Click("SearchBranch_branchName_save");
		Thread.sleep(3000);
		String branch=UtilityClass.fn_getText("BranchLandingapage_name_label");
		log.info(branch);
		branch.compareToIgnoreCase(BranchName);
		log.info("Data fetched via Name parameter");
		
		
		
	}
	
	public void searchExistingBranch(String BranchName,String BranchCode,String pincode,String Address,String email,String mobile,String type,String org,String feature,String effDate,String expiryDt,String MgrType) throws InterruptedException
	{
		UtilityClass.fn_Click("BranchLandingapage_ClickOnSearchBox");
		//log.info("searching data");
	//	UtilityClass.fn_clickByAction("BranchLandingapage_search_input" );
		Thread.sleep(3000);
		UtilityClass.fn_InputAndPressEnter("SearchBranch_branchName_input",BranchName);
		Thread.sleep(3000);
		UtilityClass.fn_Click("SearchBranch_branchName_select_radio");
		UtilityClass.fn_Click("SearchBranch_branchName_save");
		Thread.sleep(3000);
		String branch=UtilityClass.fn_getText("BranchLandingapage_name_label");
		log.info(branch);
		branch.compareToIgnoreCase(BranchName);
			UtilityClass.fn_Click("BranchLandingapage_viewDetails_button");	
			Thread.sleep(5000);
			log.info("Validating Branch details");
			log.info(UtilityClass.fn_getText("BranchLandingapage_branchName"));
		//	log.info(UtilityClass.fn_getText("BranchLandingapage_branchCode"));
			log.info(UtilityClass.fn_getText("BranchLandingapage_pincode"));
			log.info(UtilityClass.fn_getText("BranchLandingapage_address"));
			log.info(UtilityClass.fn_getText("BranchLandingapage_email"));
			log.info(UtilityClass.fn_getText("BranchLandingapage_type"));
			log.info(UtilityClass.fn_getText("BranchLandingapage_mobile"));
			log.info(UtilityClass.fn_getText("BranchLandingapage_MgrType"));
			
			
			UtilityClass.fn_validateText("BranchLandingapage_branchName",BranchName);
			//UtilityClass.fn_validateText("BranchLandingapage_branchCode",BranchCode);
			UtilityClass.fn_validateText("BranchLandingapage_pincode",pincode);
			UtilityClass.fn_validateText("BranchLandingapage_address",Address);
			UtilityClass.fn_validateText("BranchLandingapage_email",email);
			UtilityClass.fn_validateText("BranchLandingapage_mobile",mobile);
			UtilityClass.fn_validateText("BranchLandingapage_type",type);
			UtilityClass.fn_validateText("BranchLandingapage_MgrType",MgrType);	
		
	}
	
	public void ClickOnBranchPinCodeMapping() throws InterruptedException
	{
		UtilityClass.fn_Click("Branchlandingpge_BranchtoPinMapping_tab");
		Thread.sleep(5000);
		
	}
}
