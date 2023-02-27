package com.safexp.MDM.automation.pagelibraryNew;

import java.util.logging.Logger;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.safexp.MDM.automation.Utility.UtilityClass;
import com.safexp.MDM.automation.testcases.AllModules.MainTest_RunTest;
import com.safexp.MDM.automation.testcases.AllModules.MainTest_UAT;

public class SafexpressEPaymentPage extends MainTest_UAT {
    
	Logger log=Logger.getLogger(SafexpressEPaymentPage.class.getName());
	@BeforeMethod
	public static void ePayment() {
		
		UtilityClass.fn_Click("//img[@class='company-logo']");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.waitForElement("//section[contains(@style,'display')]//descendant::p /span[contains(text(),'E-payment')]");
		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p /span[contains(text(),'E-payment')]");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.waitForElement("//div[@class='epayhdr']");
		UtilityClass.fn_Click("//input[@id='waybill_number']");
//		UtilityClass.implicitelyWaitForAComponent(2000);
	}
	@Test(priority = 0)
	 public void epaymentNAOpt() {
		UtilityClass.waitForElement("//a[text()='Deny']");
	    UtilityClass.fn_Click("//a[text()='Deny']");
		UtilityClass.clearValue("//div/input[@formcontrolname='waybillNumber']");
		UtilityClass.fn_sendkeys("//div/input[@formcontrolname='waybillNumber']","106283300");
		UtilityClass.waitForElement("//button[text()='Pay Now']");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_Click("//button[text()='Pay Now']");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.waitForElement("//input[@id='gst_in_rs']");
		UtilityClass.fn_sendkeys("//input[@id='gst_in_rs']", "1");
		UtilityClass.implicitelyWaitForAComponent(10000);
//		UtilityClass.waitForElement("//input[@id='na_mobile']");
		UtilityClass.fn_sendkeys("//input[@id='na_mobile']", "9188702287");
		UtilityClass.waitForElement("//button[@class='btn btn-default verify-button ng-star-inserted']");
//		UtilityClass.waitForElement("//button[@class='btn col-md-2 paynow-button ng-star-inserted']");
//		UtilityClass.fn_Click("//button[@class='btn col-md-2 paynow-button ng-star-inserted']");
		UtilityClass.implicitelyWaitForAComponent(5000);

	 }
	
	@Test(priority = 1)
	public void epaymentAutoOpt() {
		
		UtilityClass.clearValue("//div/input[@formcontrolname='waybillNumber']");
        UtilityClass.fn_Click("//input[@id='e_waybill_number' and (@value='auto')]");
//        UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_sendkeys("//div/input[@formcontrolname='waybillNumber']","106283300");
//		UtilityClass.implicitelyWaitForAComponent(4000);
		UtilityClass.waitForElement("//button[text()='Pay Now']");
		UtilityClass.fn_Click("//button[text()='Pay Now']");
//		UtilityClass.implicitelyWaitForAComponent(4000);
		UtilityClass.waitForElement("//input[@id='gst_in_rs_auto']");
		UtilityClass.fn_sendkeys("//input[@id='gst_in_rs_auto']", "1");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_sendkeys("//input[@id='auto_tan']", "rrrr45454f");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_sendkeys("//input[@id='na_mobile']", "6123408642");
//		UtilityClass.waitForElement("//button[@class='btn col-md-2 paynow-button ng-star-inserted']");
//		UtilityClass.fn_Click("//button[@class='btn col-md-2 paynow-button ng-star-inserted']");
//		UtilityClass.implicitelyWaitForAComponent(2000);
	}
	
	@Test(priority = 2)
	public void epaymentManualOpt() {
	
		UtilityClass.clearValue("//div/input[@formcontrolname='waybillNumber']");
		UtilityClass.fn_Click("//input[@id='e_waybill_number' and (@value='manual')]");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_sendkeys("//div/input[@formcontrolname='waybillNumber']", "106283300");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_Click("//button[text()='Pay Now']");
//		UtilityClass.implicitelyWaitForAComponent(4000);
		UtilityClass.fn_sendkeys("//input[@id='gst_in_rs_auto']", "1");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_sendkeys("//input[@id='tds_amount']", "1");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_sendkeys("//input[@id='auto_tan']", "ssss88888s");
//		UtilityClass.implicitelyWaitForAComponent(2000);
		UtilityClass.fn_sendkeys("//input[@id='na_mobile']", "6123408642");
		UtilityClass.implicitelyWaitForAComponent(4000);
		
	//	UtilityClass.fn_Click("//button[@class='btn col-md-2 paynow-button ng-star-inserted']");
	
	}
}
