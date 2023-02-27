package com.safexp.MDM.automation.pagelibrary;

import java.util.logging.Logger;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class BookingContractPreviewPage {
	
Logger log=Logger.getLogger(BookingContractPreviewPage.class.getName());
public void submitPreviewDetails() throws Exception
{
UtilityClass.fn_Click("BookingAssociateContractPreviewPage_submit_btn");
Thread.sleep(5000);
UtilityClass.takeScreenshot();
}

public void verifyUpdatedChangesandSubmit() throws Exception
{   Thread.sleep(5000);
    log.info("Preview details");
	UtilityClass.fn_Click("BookingAssociateContractPreviewPage_verifyUpdatedChanges_btn");
	Thread.sleep(7000);
	 log.info("Submitting details");
	UtilityClass.fn_Click("BookingAssociateContractPreviewPage_submit_btn");
	Thread.sleep(3000);
	UtilityClass.takeScreenshot();
}
}
