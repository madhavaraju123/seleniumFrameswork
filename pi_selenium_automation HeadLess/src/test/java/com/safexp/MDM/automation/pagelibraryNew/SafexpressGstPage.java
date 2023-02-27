package com.safexp.MDM.automation.pagelibraryNew;

import org.apache.bcel.classfile.Utility;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.safexp.MDM.automation.Utility.UtilityClass;

public class SafexpressGstPage {
    @BeforeMethod
	public void clickSafLogoAndGst() {
    	UtilityClass.fn_Click("//img[@class='company-logo']");
    	UtilityClass.waitForElement("//section[contains(@style,'display')]//descendant::p[contains(text(),'GST')]");
		UtilityClass.fn_Click("//section[contains(@style,'display')]//descendant::p[contains(text(),'GST')]");
		UtilityClass.waitForElement("//div[@class='track-colm']");
	}
    public void gstWaybillInfo() {
    	UtilityClass.fn_Click("//div/ancestor::form[not(contains(@class,'formob'))]/descendant::input[@id='waybill_number']");
    	UtilityClass.fn_sendkeys("//input[contains(@placeholder,'Number') or contains(@class,'waybill')]", "");
    	UtilityClass.waitForElement("//button[contains(@type,'submit')]");
    	UtilityClass.fn_Click("//button[contains(@type,'submit')]");
    	
    }
}
