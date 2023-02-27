package com.safexp.MDM.automation.pagelibrary;

import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class CreateNewAssociateStaffPage {
	Logger log= Logger.getLogger(CreateNewAssociateStaffPage.class.getName());
	public void createNewAssociateStaff(String fName,String lName,String Mobile,String eMail,String DOB,String AdharNum,String establishmentDt,String effDt,String WhatsappNum,String PANNumber,String ResidenceAddress,String maritalStatus) throws Exception
	{
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_fName_text",fName);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_lName_text",lName);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_Mobile_text",Mobile);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_eMail_text",eMail);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_DOB_text",DOB);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_AdharNum_text",AdharNum);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_establishmentDt_text",establishmentDt);
		UtilityClass.fn_Click("CreateNewAssociateStaffPage_Designation_dropdn");
		Thread.sleep(2000);
		UtilityClass.fn_Click("CreateNewAssociateStaffPage_Designation_optiondropdn");
		
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_effDt_text",effDt);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_WhatsappNum_text",WhatsappNum);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_PANNumber_text",PANNumber);
		UtilityClass.fn_Input("CreateNewAssociateStaffPage_ResidenceAddresstext",ResidenceAddress);
		if(maritalStatus.equalsIgnoreCase("Single"))
			UtilityClass.fn_Click("CreateNewAssociateStaffPage_maritalStatus_btn1");	
		else
			UtilityClass.fn_Click("CreateNewAssociateStaffPage_maritalStatus_btn2");	
				
		UtilityClass.fn_Click("CreateNewAssociateStaffPage_submit_btn");
	}
}
