package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CreateAssocPg {
	Logger log=Logger.getLogger(CreateAssocPg.class.getName());
	public void createAssociate(String OrgName,String PANNumber,String FName,String LName,String Gender,String OffMobile,String eMail,String WhatsappNo,String DOB,String AnniversaryDate,String Adhar,String DeptName,String ChequeInFavorOf,String TDSpercentage,String AccountNo,String BankAddress,String offAddress,String residenceAddress,String Pincode,String Descr,String OnBoardingDt,String EffDate) throws Exception
	{
		
		log.info("inside that method");
		UtilityClass.fn_Click("CreateAssociatePage_DeptName_dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateAssociatePage_DeptName_optiondropdn");
		UtilityClass.fn_Click("CreateAssociatePage_AscType_dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateAssociatePage_AscType_optiondropdn");

		UtilityClass.fn_Click("CreateAssociatePage_MOP_dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateAssociatePage_MOP_optiondropdn");
		UtilityClass.fn_Click("CreateAssociatePage_RegisteredAs_dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateAssociatePage_RegisteredAs_optiondropdn");
		
	//	UtilityClass.fn_SelectByVisibleText("//mat-select[@id='mat-select-3']/div[1]/div[2]", dropdownlistxpath, text);
		UtilityClass.fn_Input("CreateAssociatePage_PersonaleMail_text",eMail);
		UtilityClass.fn_Input("CreateAssociatePage_AccountNo_text",AccountNo);
		
		UtilityClass.fn_Input("CreateAssociatePage_offAddress_text",offAddress);
		UtilityClass.fn_Input("CreateAssociatePage_residenceAddress_text",residenceAddress);
		UtilityClass.fn_Input("CreateAssociatePage_Pincode1_text",Pincode);
		UtilityClass.fn_Click("CreateAssociatePage_Pincode1_option");
		UtilityClass.fn_Click("CreateAssociatePage_Pincode1_option");
		UtilityClass.fn_Input("CreateAssociatePage_Pincode2_text",Pincode);
		UtilityClass.fn_Click("CreateAssociatePage_Pincode1_option");
		UtilityClass.fn_Click("CreateAssociatePage_Pincode1_option");
		UtilityClass.fn_Input("CreateAssociatePage_Descr_text",Descr);
		UtilityClass.fn_Input("CreateAssociatePage_OnBoardingDt_text",OnBoardingDt);
		UtilityClass.fn_Input("CreateAssociatePage_EffDate_text",EffDate);
		
		
		
		//if(!UtilityClass.fn_isChecked("CreateAssociatePage_TDSCeritificate_btn"))
			UtilityClass.fn_Click("CreateAssociatePage_TDSCeritificate_btn");
		UtilityClass.fn_Input("CreateAssociatePage_TDSpercentage_text",TDSpercentage);
	
		//UtilityClass.fn_Input("CreateAssociatePage_AscType_text",AscType);
		
		UtilityClass.fn_Click("CreateAssociatePage_BankName_dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateAssociatePage_BankName_optiondropdn");
		
		UtilityClass.fn_Click("CreateAssociatePage_BranchName");
		Thread.sleep(4000);
		UtilityClass.fn_Click("CreateAssociatePage_SelectBranchName_branchoption");
		UtilityClass.fn_Click("CreateAssociatePage_SelectBranch_AssignBtn");
		
		//UtilityClass.fn_Input("CreateAssociatePage_IFSCCode_text",IFSCCode);
		
		
		
		UtilityClass.fn_Input("CreateAssociatePage_PANnumber_text",PANNumber);
		UtilityClass.fn_Input("CreateAssociatePage_FName_text",FName);
		UtilityClass.fn_Input("CreateAssociatePage_LName_text",LName);
		UtilityClass.fn_Input("CreateAssociatePage_OffMobile_text",OffMobile);
		UtilityClass.fn_Input("CreateAssociatePage_OrgName_text",OrgName);	
		//if(!UtilityClass.fn_isChecked("CreateAssociatePage_GSTRegistered_btn"))
	//	UtilityClass.fn_Click("CreateAssociatePage_GSTRegistered_btn");
		UtilityClass.fn_Input("CreateAssociatePage_ChequeInFavorOf_text",ChequeInFavorOf);
		UtilityClass.fn_Input("CreateAssociatePage_personalMobile_text",OffMobile);
		UtilityClass.fn_Input("CreateAssociatePage_EmergencyContact_text",OffMobile);
				UtilityClass.fn_Input("CreateAssociatePage_eMail_text",eMail);
	//	UtilityClass.fn_SelectByVisibleText(".//mat-select[@id='mat-select-2']/div[1]/div[1]/span[1]", "//mat-option[contains(@id,'mat-option')]",Gender);
		UtilityClass.fn_Input("CreateAssociatePage_WhatsappNo_text",WhatsappNo);
		UtilityClass.fn_Input("CreateAssociatePage_DOB_text",DOB);
		
		
		UtilityClass.fn_Input("CreateAssociatePage_AnniversaryDate_text",AnniversaryDate);
		UtilityClass.fn_Input("CreateAssociatePage_Adhar_text",Adhar);
		
		
		log.info("all details");
		//UtilityClass.fn_Click("CreateAssociatePage_next_btn");
	
	Thread.sleep(3000);
	
	
	}
			

}
