package com.safexp.MDM.automation.pagelibraryNew;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.safexp.MDM.automation.Utility.UtilityClass;
import com.safexp.MDM.automation.testcases.AllModules.MainTest_RunTest;
import com.safexp.MDM.automation.testcases.AllModules.MainTest_UAT;

public class SafexpressBookNowPage extends MainTest_UAT {

	Logger log=Logger.getLogger(SafexpressBookNowPage.class.getName());
	@Test
	public void bookNow() {
		
//		UtilityClass.implicitelyWaitForAComponent(5000);
//		UtilityClass.implicitelyWaitForAComponent(5000);
	//	UtilityClass.fn_clickByAction1("//div/h1[text()='Chat']");
		UtilityClass.fn_Click("//img[@class='company-logo']");
		UtilityClass.waitForElement("//section[contains(@style,'display')]//descendant::p /span[contains(text(),'Book Now')]");
		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p /span[contains(text(),'Book Now')]");
//		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.waitForElement("//div[@class='mode-text']");
		UtilityClass.fn_sendkeys("//input[@placeholder='Customer/Consigner Name']", "Kumar");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Mobile Number']", "6123408642");
		UtilityClass.waitForElement("//img[@class='verfified-img ng-star-inserted']");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_sendkeys("//input[contains(@placeholder,'packages')]", "30");
//		UtilityClass..(3000);
		UtilityClass.fn_sendkeys("//input[contains(@placeholder,'Weight')or(@formcontrolname='weight')]", "90");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Origin Pincode']", "516360");
		UtilityClass.fn_tab("//input[@placeholder='Origin Pincode']");
		UtilityClass.waitForElement("//label[text()='Origin Pincode']/../following-sibling::span");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Destination Pincode']", "500016");
		UtilityClass.fn_tab("//input[@placeholder='Destination Pincode']");
		UtilityClass.waitForElement("//label[text()='Destination Pincode']/../following-sibling::span");
		UtilityClass.fn_datepicker("27-feb-2023", "//span[@class='mat-button-wrapper']",
				"//div[@aria-modal='true']/descendant::span[@class='mat-button-wrapper']/span",
				 "//tbody/descendant::td/descendant::div[contains(@class,'mat-calendar-body-cell-content')]",
				 "//tbody[@class='mat-calendar-body']/descendant::div[contains(@class,'mat-calendar-body-cell-content')]",
				 "//tbody[@class='mat-calendar-body']/descendant::div[contains(@class,'mat-calendar-body-cell-content')]");
//		UtilityClass.implicitelyWaitForAComponent(6000);
	//	UtilityClass.fn_sendkeys("//input[@placeholder='Preferred Pickup Date']", "31/01/2023");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Email']", "madhavpr91@gmail.com");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.fn_sendkeys("//input[@placeholder='Address']", "Kadapa district, Andhrapradesh");
//		UtilityClass.implicitelyWaitForAComponent(3000);
		UtilityClass.waitForElement("//button[@type='submit']");
		UtilityClass.fn_Click("//button[@type='submit']");
		
		UtilityClass.waitForElement("//span[text()='X']");
		UtilityClass.implicitelyWaitForAComponent(5000);
		UtilityClass.fn_Click("//span[text()='X']");
		
		
	}
}
