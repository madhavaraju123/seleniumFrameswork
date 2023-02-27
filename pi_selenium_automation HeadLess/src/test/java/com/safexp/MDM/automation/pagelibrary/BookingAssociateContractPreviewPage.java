package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingAssociateContractPreviewPage {
	
Logger log=Logger.getLogger(BookingAssociateContractPreviewPage.class.getName());
public void submitPreviewDetails() throws Exception
{
UtilityClass.fn_Click("BookingAssociateContractPreviewPage_submit_btn");
Thread.sleep(5000);
UtilityClass.takeScreenshot();
}

public void verifyUpdatedChangesandSubmit() throws Exception
{
	UtilityClass.fn_Click("BookingAssociateContractPreviewPage_verifyUpdatedChanges_btn");
	Thread.sleep(5000);
	UtilityClass.fn_Click("BookingAssociateContractPreviewPage_submit_btn");
	Thread.sleep(5000);
	UtilityClass.takeScreenshot();
}
}
