package com.safexp.MDM.automation.pagelibraryNew;

import java.util.logging.Logger;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.safexp.MDM.automation.Utility.UtilityClass;
import com.safexp.MDM.automation.testcases.AllModules.MainTest_UAT;

public class SafexpressPincodePage extends MainTest_UAT{
	Logger log=Logger.getLogger(SafexpressPincodePage.class.getName());
	
    @BeforeMethod
	public void GetPincodeHomePage() {
		UtilityClass.fn_Click("//img[@class='company-logo']");
		UtilityClass.waitForElement("//section[contains(@style,'display')]//descendant::p[contains(text(),'Pincode ')]");
		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'Pincode ')]");
		UtilityClass.waitForElement("//div[@class='track-col']");
	}
	@Test
	public void PincodePincodeServed() {
		UtilityClass.fn_sendkeys("//input[@placeholder='Enter 6 digit Pincode']","516360");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.waitForElement("//button[contains(text(),'Submit')]");
		UtilityClass.fn_Click("//button[contains(text(),'Submit')]");
//		UtilityClass.takeScreenshot();
		UtilityClass.implicitelyWaitForAComponent(4000);
	}
}
