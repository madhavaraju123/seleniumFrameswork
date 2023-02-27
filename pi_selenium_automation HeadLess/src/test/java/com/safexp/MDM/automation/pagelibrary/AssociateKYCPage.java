package com.safexp.MDM.automation.pagelibrary;

import java.io.File;
import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class AssociateKYCPage {
Logger log= Logger.getLogger(AssociateKYCPage.class.getName());

public void uploadKYCDocument(String expiryDt) throws Exception
{
	String Path=System.getProperty("user.dir")+File.separator+"TestData"+File.separator+"PN-2549-18062020.png";
	UtilityClass.fn_Click("AssociateKYCPage_DocType_drpdn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AssociateKYCPage_DocType_drpdnOption1");
	Thread.sleep(3000);
	UtilityClass.fn_Click("AssociateKYCPage_DocSubType_drpdn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AssociateKYCPage_DocSubType_drpdnOption1");
	UtilityClass.fn_Input("AssociateKYCPage_ExpiryDt",expiryDt);
	UtilityClass.fn_Click("AssociateKYCPage_browse_btn");
	UtilityClass.fn_Input("AssociateKYCPage_upload_btn",Path);
	
	UtilityClass.fn_Click("AssociateKYCPage_DocType_drpdn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AssociateKYCPage_DocType_drpdnOption2");
	Thread.sleep(3000);
	UtilityClass.fn_Click("AssociateKYCPage_DocSubType_drpdn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AssociateKYCPage_DocSubType_drpdnOption2");
	UtilityClass.fn_Input("AssociateKYCPage_ExpiryDt",expiryDt);
	UtilityClass.fn_Click("AssociateKYCPage_browse_btn");
	UtilityClass.fn_Input("AssociateKYCPage_upload_btn",Path);
	
	UtilityClass.fn_Click("AssociateKYCPage_DocType_drpdn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AssociateKYCPage_DocType_drpdnOption3");
	Thread.sleep(3000);
	UtilityClass.fn_Click("AssociateKYCPage_DocSubType_drpdn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("AssociateKYCPage_DocSubType_drpdnOption3");
	UtilityClass.fn_Input("AssociateKYCPage_ExpiryDt",expiryDt);
	UtilityClass.fn_Click("AssociateKYCPage_browse_btn");
	
	UtilityClass.fn_Input("AssociateKYCPage_upload_btn",Path);
	
	UtilityClass.fn_Click("AssociateKYCPage_next_btn");
	
}
}
