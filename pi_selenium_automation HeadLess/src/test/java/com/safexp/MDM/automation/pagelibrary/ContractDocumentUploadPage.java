package com.safexp.MDM.automation.pagelibrary;

import java.io.File;
import org.apache.log4j.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class ContractDocumentUploadPage {
Logger log= Logger.getLogger(ContractDocumentUploadPage.class.getName());

public void uploadContractDocument(String expiryDt) throws Exception
{
	UtilityClass.fn_Click("ContractDocumentUploadPage_DocType_drpdn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("ContractDocumentUploadPage_DocType_drpdnOption1");
	Thread.sleep(3000);
	UtilityClass.fn_Click("ContractDocumentUploadPage_DocSubType_drpdn");
	Thread.sleep(2000);
	UtilityClass.fn_Click("ContractDocumentUploadPage_DocSubType_drpdnOption1");
	UtilityClass.fn_Input("ContractDocumentUploadPage_ExpiryDt",expiryDt);
	UtilityClass.fn_Click("ContractDocumentUploadPage_browse_btn");
	String path=System.getProperty("user.dir")+File.separator+"TestData"+File.separator+"PN-2625-18062020.png";
	UtilityClass.fn_Input("ContractDocumentUploadPage_upload_btn",path);
	UtilityClass.fn_Click("ContractDocumentUploadPage_Preview_btn");
	Thread.sleep(10000);
}
public void clickPreviewButton() throws Exception
{
	log.info("Clicking preview button");
	Thread.sleep(5000);
	UtilityClass.fn_Click("ContractDocumentUploadPage_Preview_btn");
	Thread.sleep(10000);
}
}
